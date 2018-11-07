package Introduction;

/**
 * This class will take two inputs as parameters and will contain methods
 * to perform some of the most basic calculations that are available
 * using a calculator.
 *
 * @author Andrew Caldwell candrew9
 * @version 8/24/18
 */

public class Calculator {
    private double input1;
    private double input2;


    /**
     * Create a new Calculator object.
     * 
     * @precondition first input and second input cannot be NULL
     * @param firstInput
     *            the first num typed into the calculator
     * @param secondInput
     *            the num typed into the calculator after the operation
     */
    public Calculator(double firstInput, double secondInput) {
        this.input1 = firstInput;
        this.input2 = secondInput;

    }


    /**
     * This method will return the first number typed into the calculator
     * 
     * @return input1
     */
    public double getFirstInput() {

        return input1;
    }


    /**
     * This method will return the number typed into the calculator
     * after the operation
     * 
     * @return input2
     */
    public double getSecondInput() {
        return input2;
    }


    /**
     * This method will calculate the multiplication of the first and
     * second inputs
     * 
     * @return product of input1 and input2
     */
    public double multiply() {
        double temp;
        temp = input1 * input2;
        return temp;
    }


    /**
     * This method will divide the first input by the second input
     * 
     * @return quotient of input1 and input2, NaN if input2 is zero
     */
    public double divide() {
        double temp;
        if (input2 == 0) {
            return Double.NaN;
        }
        else {
            temp = input1 / input2;
        }
        return temp;
    }


    /**
     * This method will add the first and second inputs
     * 
     * @return sum of input1 and input2
     */
    public double add() {
        double temp;
        temp = input1 + input2;
        return temp;
    }


    /**
     * This method will subtract the first input by the second input
     * 
     * @return difference of input1 and input2
     */
    public double subtract() {
        double temp;
        temp = input1 - input2;
        return temp;
    }


    /**
     * This method will calculate the value of the first input to
     * the power of the second input using the static method pow
     * from the Math class
     * 
     * @precondition first and second inputs do not have to be whole numbers
     * @return input1 to the input2 power
     */
    public double power() {
        double temp;
        temp = Math.pow(input1, input2);
        return temp;
    }
}
