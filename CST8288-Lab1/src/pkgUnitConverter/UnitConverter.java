/*
Student Name: Kin Man Leung
Student Number: 041057464
Course & Section #: 22S_CST8288_012
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;

/**
 * consistent interface for converter's behaviors/strategies
 * @author Kin Man Leung
 */
public interface UnitConverter {
    
    /**
     *
     * @param amount
     * @return
     */
    public double convert(double amount);
    
    /**
     * 
     * @return
     */
    public String iUnit();
    
    /**
     * 
     * @return
     */
    public String fUnit();
}
