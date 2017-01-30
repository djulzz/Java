
package mod07_2016_prg_451_ch1;

/**
 * Author: William Cherry
 * Summary: Take two fractions and combine add them
 */
public class FractionCalc {
    
    public static void main(String args[])
    {
        CalcMethods CalcTest= new CalcMethods();
        int[] thecheese= {1,2,3,4,5,6};
        System.out.println(CalcTest.addFract(thecheese));
        System.out.println(CalcTest.subFract(thecheese));
        System.out.println(CalcTest.multFract(thecheese));
        System.out.println(CalcTest.divFract(thecheese));        
    }
}
