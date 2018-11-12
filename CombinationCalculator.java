package prj5;

/**
 * A class that is designed to be able to take a given input file and output
 * 
 * @author Andrew Caldwell (candrew9)
 * @version 2018.11.11
 *
 */
public class CombinationCalculator {

    // fields

    // need to add private enum fields

    /**
     * Constructs a Combination calculator with no parameters
     */
    public CombinationCalculator() {
        // implement the list
    }


    /**
     * Calculates the the percentage of the given enum fields
     * 
     * @return an array containing the result of each of the arrays given from
     *         the DLList
     */
    public double[] percent() {
        // list needs to be added here
        // some other array I made up
        int[][] temp = new int[4][1];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                temp[row][col] = col;
            }
        }

        // real code goes here

        // sum of recorded yes's
        int sum = 0;
        double ans = 0.0;
        double[] result = new double[4];

        for (int i = 0; i < temp.length; i++) {

            for (int j = 0; j < temp[i].length; j++) {
                if (temp[i][j] == 0) {
                    sum++;
                }

                // calculate percentage array
                if (j == temp[i].length - 1) {
                    ans = sum / (temp[i].length);
                }
            }

            // update result array
            result[i] = ans;

        }

        return result;

    }


    /**
     * Determines the most common hobby
     */
    public int getCommonHobby() {
        //TODO
        return 0;
    }

}
