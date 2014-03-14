package com.legstar.test.coxb.custrecord.bind;

import com.legstar.coxb.transform.AbstractXmlTransformers;
import com.legstar.coxb.transform.HostTransformException;

/**
 * XML Transformers provider for CustName.
 *
 */
public class CustNameXmlTransformers extends AbstractXmlTransformers {

    /**
     * Create a set of directional transformers.
     * @throws HostTransformException if transformer cannot be created
     */
    public CustNameXmlTransformers() throws HostTransformException {
        super(new CustNameXmlToHostTransformer(),
                new CustNameHostToXmlTransformer());
    }

}
