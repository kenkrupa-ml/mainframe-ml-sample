package com.example.mainframe.ml;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

import com.legstar.test.coxb.custrecord.CustName;
import com.legstar.test.coxb.custrecord.CustRecord;
import com.legstar.test.coxb.custrecord.bind.CustRecordTransformers;


/*
 * Sample code, freely usable but use at your own risk.
 */
public class GenerateEBCDICData
{
	public static byte EBCDIC_LF=0x25; // Line separator, EBCDIC style

	public GenerateEBCDICData()
	{
	}
	
	public static void main(String[] args)
	{
		if (args.length != 2)
		{
			throw new RuntimeException("Usage: GenerateEBCDICData <input-file-name> <output-file-name>");
		}
		
		String inputFileName = args[0];
		String outputFileName = args[1];
		try
		{
			BufferedReader input = new BufferedReader(new FileReader(inputFileName));
			FileOutputStream output = new FileOutputStream(outputFileName);
			
			String header = input.readLine();
			if (header == null)
			{
				System.out.println("Input file is empty. Nothing done.");
				System.exit(0);
			}
			
			String[] headerCols=header.split("\\|");  // pipe-delimited
			
			String line = null;
			while ((line = input.readLine())!=null)
			{
				String[] lineCols=line.split("\\|"); // pipe delimited

				CustRecord custRecord = new CustRecord();

				String idString = getColumn("custId", headerCols, lineCols);
				if (idString == null)
				{
					throw new RuntimeException("Customer ID cannot be null");
				}
				int custId=Integer.parseInt(idString); // Will throw NFE if NG
				
				custRecord.setCustId(custId);
				
				CustName custName = new CustName();				
				custName.setCustFirstName(getColumn("custFirstName", headerCols, lineCols));
				custName.setCustLastName(getColumn("custLastName", headerCols, lineCols));

				custRecord.setCustName(custName);

				custRecord.setStreetAddress(getColumn("streetAddress", headerCols, lineCols));
				custRecord.setCity(getColumn("city", headerCols, lineCols));
				custRecord.setUsState(getColumn("usState", headerCols, lineCols));
				custRecord.setOtherStateProvince(getColumn("otherStateProvince", headerCols, lineCols));
				custRecord.setPostalCode(getColumn("postalCode", headerCols, lineCols));
				custRecord.setCountryCode(getColumn("countryCode", headerCols, lineCols));
				custRecord.setNotes(getColumn("notes", headerCols, lineCols));
				
				CustRecordTransformers hostTransform = new CustRecordTransformers();
				byte[] ebcdicOutput = hostTransform.toHost(custRecord);
				output.write(ebcdicOutput);
				output.write(EBCDIC_LF);
			}
			
			input.close();
			output.close();
			
		}
		catch (Exception e)
		{
			throw new RuntimeException("Things did not go as planned.", e);
		}
	}
	
	public static String getColumn(String _colName, String[] _headerCols, String[] _lineCols)
	{
		int i=0;
		String rtn=null;
		for(String headerCol:_headerCols)
		{
			if (headerCol!=null && headerCol.equals(_colName))
			{
				rtn=_lineCols[i];
				break;
			}
			i++;
		}
			System.out.println("Found " + _colName + " -> " + rtn);
		return rtn;
	}

}
