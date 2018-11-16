/**
 * 
 */
package prj5;

import student.TestCase;

/**
 * @author andrewcaldwell
 *
 */
public class CombinationCalculatorTest extends TestCase {

    private CombinationCalculator calc;
    private String[][] str;
    private String key;


    /**
     * Sets up the common test scenario
     */
    public void setUp() {
        str = new String[7][7];
        

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                str[i][j] = "yes";

            }
        }
        

        key = "genre";

        calc = new CombinationCalculator(str, 1, key);
        
    }


    /**
     * Tests the countLikes method
     */
    public void testCountLikes() {
        assertEquals(0, calc.countLikes(key));
    }
    
    /**
     * Tests the count heard method
     */
    public void testCountHeard() {
        assertEquals(0, calc.countHeard(key));
    }
    
    /**
     * Tests the likePercentToString method
     */
    public void testLikeAndHeardPercentToString() {
        assertEquals("", calc.likePercentToString());
        assertEquals("", calc.heardPercentToString());
    }
    
    //any method not used by input should be a private method.
    

}
