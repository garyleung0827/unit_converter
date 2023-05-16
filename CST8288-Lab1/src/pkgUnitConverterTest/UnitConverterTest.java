/*
Student Name: Kin Man Leung
Student Number: 041057464
Course & Section #: 22S_CST8288_012
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverterTest;

import pkgUnitConverter.*;
/**
 * class to test the strategy pattern of unit converter, 4 strategies which are 
 * Fahrenheit to Celsius, Celsius to Fahrenheit, Kilometer to Miles and Miles to Kilometer.
 * @author kriger
 */
public class UnitConverterTest {

    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
	Converter c = new Converter();
        c.convert(20.00);
        System.out.println(c);
        
        c.changeconverterTo(new FCconverter());
        c.convert(70.00);
        System.out.println(c);
        
        c.changeconverterTo(new KMconverter());
        c.convert(2.00);
        System.out.println(c);
        
        c.changeconverterTo(new MKconverter());
        c.convert(1500.00);
        System.out.println(c);
		
	}

}
