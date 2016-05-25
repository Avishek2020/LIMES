package org.aksw.limes.core.evaluation.qualititativeMeasures;

import org.aksw.limes.core.datastrutures.GoldStandard;
import org.aksw.limes.core.io.mapping.Mapping;

/**
 * Implements a quality measure for unsupervised ML algorihtms, dubbed pseudo F-Measure. 
 * Thereby, not relying on any gold standard. The basic idea is to measure the quality of the
 * a given Mapping by calc. how close it is to an assumed 1-to-1 Mapping between source and 
 * target.
 * @author Klaus Lyko <lyko@informatik.uni-leipzig.de>
 * @author ngonga
 * @author mofeed hassan
 * @version 1.0
 *
 */
public class PseudoPrecision extends APseudoPRF {

public PseudoPrecision() {}
	
	/**
	 * Use this constructor to toggle between symmetric precision (true) and the older asymmetric
	 * Pseudo-Precision (false)
	 * @param symmetricPrecision
	 */
	public PseudoPrecision(final boolean symmetricPrecision) {
		this();
		this.symmetricPrecision = symmetricPrecision;
	}
	
    /** Computes the pseudo-precision, which is basically how well the mapping 
     * maps one single s to one single t
     * @param sourceUris List of source uris
     * @param targetUris List of target uris
     * @param result Mapping of source to targer uris
     * @return Pseudo precision score
     */
	@Override
	public double calculate(Mapping predictions, GoldStandard goldStandard) {
		Mapping res = predictions;
    	Mapping rev = res.reverseSourceTarget();
    	if(useOneToOneMapping) {
    		res = predictions.getBestOneToNMapping();
    		rev = res.reverseSourceTarget().getBestOneToNMapping();
    	}
    	double p = res.getMap().keySet().size();
    	if(symmetricPrecision)
    		p = res.getMap().keySet().size()+rev.getMap().keySet().size();
        double q = 0;
        for (String s : predictions.getMap().keySet()) {
        	if(symmetricPrecision)
        		q = q + 2*predictions.getMap().get(s).size();
        	else
        		q = q + predictions.getMap().get(s).size();
        }
        if(p==0 || q==0) return 0;
        return p / q;
	}
	
	

}
