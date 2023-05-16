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
 * class that encapsulates the conversion of Celsius to Fahrenheit
 * @author Kin Man Leung
 */
public class CFconverter implements UnitConverter{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
        /**
         * 
	 * @param celsius value in Celsius to be converted
	 * @return equivalent in Fahrenheit
	 */
        @Override
	public double convert(double celsius) {
            return celsius*convFactor + convOrigin;
	}
        
        /**
         *
         * @return
         */
        @Override
        public String iUnit(){
            return "Celsius";
        }
        
        /**
         *
         * @return
         */
        @Override
        public String fUnit(){
            return "Fahrenheit";
        }
}
