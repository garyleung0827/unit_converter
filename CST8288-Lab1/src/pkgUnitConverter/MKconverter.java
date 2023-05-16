/*
Student Name: Kin Man Leung
Student Number: 041057464
Course & Section #: 22S_CST8288_012
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;

/**
 * 
 * class that encapsulates the conversion of Miles to Kilometer
 * @author Kin Man Leung
 */
public class MKconverter implements UnitConverter{
    private final double convFactor= 1.60934;
	
	/**
         * 
	 * @param miles value in Miles to be converted
	 * @return equivalent in Kilometer
	 */
        @Override
	public double convert(double miles) {
		return miles * convFactor;
	}
        
        /**
         *
         * @return
         */
        @Override
        public String iUnit(){
            return "Miles";
        }
        
        /**
         *
         * @return
         */
        @Override
        public String fUnit(){
            return "Kilometer";
        }
}
