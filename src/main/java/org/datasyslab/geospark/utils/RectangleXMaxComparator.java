package org.datasyslab.geospark.utils;

/**
 * 
 * @author Arizona State University DataSystems Lab
 *
 */

import com.vividsolutions.jts.geom.Envelope;

import java.io.Serializable;
import java.util.Comparator;

public class RectangleXMaxComparator extends GeometryComparator implements Comparator<Envelope>, Serializable {

	 /* (non-Javadoc)
 	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
 	 */
 	public int compare(Envelope envelope1, Envelope envelope2) {
	    if(envelope1.getMaxX()>envelope2.getMaxX())
	    {
	    	return 1;
	    }
	    else if (envelope1.getMaxX()<envelope2.getMaxX())
	    {
	    	return -1;
	    }
	    else return 0;
	    }
}
