/*
Student Name: Kin Man Leung
Student Number: 041057464
Course & Section #: 22S_CST8288_012
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;

/**
 * class that represents the "context" in the Strategy Design Pattern
 * @author Kin Man Leung
 */
public class Converter {
    private UnitConverter converter;
    private double unit;
    private double convertedUnit;
    
    /**
     * no-arg constructor initializes converter behavior/strategy to that of convert
     * Celsius to Fahrenheit 
     */
    public Converter(){
        this.converter= new CFconverter();
    }
    
    /**
     * @param converter
     */
    public void changeconverterTo(UnitConverter converter){
		// ToDo: Detect and prevent nulls
	this.converter = converter;
    }
    
    /**
     * @param unit
     * @return
     */
    public double convert(double unit){
        this.unit = unit;
        convertedUnit =  this.converter.convert(unit);
        return convertedUnit;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
		builder.append(unit)
                       .append(" in ")
                       .append(converter.iUnit())
                       .append(" is ")
                       .append(String.format("%.2f", convertedUnit))
                       .append(" ")
                       .append(converter.fUnit());
		return builder.toString();
    }
    
    
}
