package com.legstar.test.coxb.custrecord.bind;

import com.legstar.coxb.transform.AbstractXmlTransformers;
import com.legstar.coxb.transform.HostTransformException;

/**
 * XML Transformers provider for CustRecord.
 *
 */
public class CustRecordXmlTransformers extends AbstractXmlTransformers {

    /**
     * Create a set of directional transformers.
     * @throws HostTransformException if transformer cannot be created
     */
    public CustRecordXmlTransformers() throws HostTransformException {
        super(new CustRecordXmlToHostTransformer(),
                new CustRecordHostToXmlTransformer());
    }

}
