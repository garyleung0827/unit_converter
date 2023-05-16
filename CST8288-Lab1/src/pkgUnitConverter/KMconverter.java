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
 *class that encapsulates the conversion of Kilometer to Miles
 * @author Kin Man Leung
 */
public class KMconverter implements UnitConverter{
    	private final double convFactor= 0.621371;
	
	/**
         * 
	 * @param kilometer value in Kilometer to be converted
	 * @return equivalent in Miles
	 */
        @Override
	public double convert(double kilometer) {
		return kilometer * convFactor;
	}
        
        /**
         *
         * @return
         */
        @Override
        public String iUnit(){
            return "Kilometer";
        }
        
        /**
         *
         * @return
         */
        @Override
        public String fUnit(){
            return "Miles";
        }
}
