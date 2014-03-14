package com.example.mainframe.ml;

import java.io.FileInputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.legstar.test.coxb.custrecord.CustRecord;
import com.legstar.test.coxb.custrecord.bind.CustRecordTransformers;
import com.legstar.test.coxb.custrecord.bind.CustRecordXmlTransformers;
import com.marklogic.client.DatabaseClient;
import com.marklogic.client.DatabaseClientFactory;
import com.marklogic.client.DatabaseClientFactory.Authentication;
import com.marklogic.client.document.XMLDocumentManager;
import com.marklogic.client.io.StringHandle;


/*
 * Sample code, freely usable but use at your own risk.
 */
public class LoadToMarkLogic
{
	public static byte EBCDIC_LF=0x25; // Line separator, EBCDIC style
	
	public LoadToMarkLogic()
	{
	}

	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			throw new RuntimeException("Usage: LoadToMarkLogic <file name>");
		}
		
		String fileName = args[0];
		try
		{
			// MarkLogic connection
			DatabaseClient client = DatabaseClientFactory.newClient("localhost", 8072, "admin", "admin", Authentication.DIGEST);
			XMLDocumentManager docMgr = client.newXMLDocumentManager();
			
			// XML transformer for converting copybook-described data to XML
			CustRecordXmlTransformers xmlTransform = new CustRecordXmlTransformers();
			
			// A POJO transformer (used to pull the object ID easily)
			CustRecordTransformers objectTransform = new CustRecordTransformers();
			
			List<Byte> bytes = new ArrayList<Byte>();
			FileInputStream fis = new FileInputStream(fileName);
			int nextByte= -1;
			
			int rec=0;
			while ((nextByte=fis.read()) != -1)
			{
				if (nextByte != EBCDIC_LF)
				{
					bytes.add((byte)nextByte);
				}
				else
				{
					System.out.println("Found newline, processing record "+rec+"\n\t");
					
					// Load into a byte array
					int i=0;
					byte[] barray=new byte[bytes.size()];
					for(Byte b:bytes) barray[i++] = b.byteValue();
					
					StringWriter sw = new StringWriter();
					// Get the XML version of the record according to the copy-book
					xmlTransform.toXml(barray, sw);
					System.out.println("\t"+sw);
					
					// Get a POJO representation to get the ID easily - but a POJO might also be used for persistence (perhaps in another example...)
					CustRecord cr = objectTransform.toJava(barray);
					long custId = cr.getCustId();
					
					StringHandle sh = new StringHandle(sw.toString());
					// Persist the XML document into the DB, giving it a URI based on the customer ID in the record
					docMgr.write("/mainframe/customer_"+custId+".xml", sh);
					System.out.println("Record "+rec+" written to the database");
					rec++;
					bytes.clear();
				}
			}
			fis.close();
			client.release();
		}
		catch (Exception e)
		{
			throw new RuntimeException("Things did not go as planned.", e);
		}
	}

}
