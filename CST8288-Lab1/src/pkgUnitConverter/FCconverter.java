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
 * class that encapsulates the conversion of Fahrenheit to Celsius
 * @author Kin Man Leung
 */
public class FCconverter implements UnitConverter{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
         * 
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
        @Override
	public double convert(double fahrenheit) {
            return (fahrenheit - convOrigin)/convFactor;
	}
        
        /**
         *
         * @return
         */
        @Override
        public String iUnit(){
            return "Fahrenheit";
        }
        
        /**
         *
         * @return
         */
        @Override
        public String fUnit(){
            return "Celsius";
        }
}
