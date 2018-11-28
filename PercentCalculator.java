package prj5;

import java.util.Comparator;

/**
 * Class to help calculate the percentages of students who answered the survey
 * and calculate their results
 * 
 * Note - might want to create 6 array fields instead of 2, would need to double
 * up methods as well
 * 
 * @author Andrew Caldwell (candrew9)
 * @version 2018.11.26
 *
 */
public class PercentCalculator implements Comparator<String> {

    // fields
    private int[][] heardMajor;
    private int[][] likedMajor;
    private int[][] heardRegion;
    private int[][] likedRegion;
    private int[][] heardHobby;
    private int[][] likedHobby;
    private int type;


    /**
     * Creates a new percentCalculator, using integer values to determine hobby,
     * major or region percentages
     */
    public PercentCalculator(int category) {
        heardMajor = new int[4][2];
        likedMajor = new int[4][2];
        heardRegion = new int[4][2];
        likedRegion = new int[4][2];
        heardHobby = new int[4][2];
        likedHobby = new int[4][2];
        type = category;
    }


    /**
     * Gathers the total number of heards for a track
     * 
     * @param category
     *            the category of survey results to decipher from
     * @param survey
     *            the survey result being targeted for the category
     * @param answer
     *            the answer to the specific question targeted from the survey
     */
    private void heardSong(int category, String survey, String answer) {

        if (category == 0) {
            if (compare(survey, "Computer Science") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardMajor[0][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardMajor[0][1]++;
                }
            }
            else if (compare(survey, "Math or CMDA") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardMajor[1][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardMajor[1][1]++;
                }
            }
            else if (compare(survey, "Other Engineering") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardMajor[2][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardMajor[2][1]++;
                }
            }
            else if (compare(survey, "Other") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardMajor[3][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardMajor[3][1]++;
                }
            }
        }
        else if (category == 1) {
            if (compare(survey, "Northeast") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardRegion[0][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardRegion[0][1]++;
                }
            }
            else if (compare(survey, "Southeast") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardRegion[1][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardRegion[1][1]++;
                }
            }
            else if (compare(survey,
                "United States (other than Southeast or Northwest") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardRegion[2][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardRegion[2][1]++;
                }
            }
            else if (compare(survey, "Outside of United States") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardRegion[3][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardRegion[3][1]++;
                }
            }
        }
        else {
            if (compare(survey, "music") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardHobby[0][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardHobby[0][1]++;
                }
            }
            else if (compare(survey, "sports") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardHobby[1][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardHobby[1][1]++;
                }
            }
            else if (compare(survey, "art") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardHobby[2][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardHobby[2][1]++;
                }
            }
            else if (compare(survey, "reading") == 0) {
                if (compare(answer, "Yes") == 0) {
                    heardHobby[3][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    heardHobby[3][1]++;
                }
            }
        }
    }


    /**
     * Gathers the total number of likes for a track
     * 
     * @param category
     *            the category of survey results to decipher from
     * @param survey
     *            the survey result being targeted for the category
     * @param answer
     *            the answer to the specific question targeted from the survey
     */
    private void likedSong(int category, String survey, String answer) {

        if (category == 0) {
            if (compare(survey, "Computer Science") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedMajor[0][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedMajor[0][1]++;
                }
            }
            else if (compare(survey, "Math or CMDA") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedMajor[1][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedMajor[1][1]++;
                }
            }
            else if (compare(survey, "Other Engineering") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedMajor[2][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedMajor[2][1]++;
                }
            }
            else if (compare(survey, "Other") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedMajor[3][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedMajor[3][1]++;
                }
            }
        }
        else if (category == 1) {
            if (compare(survey, "Northeast") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedRegion[0][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedRegion[0][1]++;
                }
            }
            else if (compare(survey, "Southeast") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedRegion[1][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedRegion[1][1]++;
                }
            }
            else if (compare(survey,
                "United States (other than Southeast or Northwest") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedRegion[2][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedRegion[2][1]++;
                }
            }
            else if (compare(survey, "Outside of United States") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedRegion[3][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedRegion[3][1]++;
                }
            }
        }
        else {
            if (compare(survey, "music") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedHobby[0][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedHobby[0][1]++;
                }
            }
            else if (compare(survey, "sports") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedHobby[1][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedHobby[1][1]++;
                }
            }
            else if (compare(survey, "art") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedHobby[2][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedHobby[2][1]++;
                }
            }
            else if (compare(survey, "reading") == 0) {
                if (compare(answer, "Yes") == 0) {
                    likedHobby[3][0]++;
                }
                else if (compare(answer, "No") == 0) {
                    likedHobby[3][1]++;
                }
            }
        }
    }


    /**
     * Adds values to the field array using an outside class
     * 
     * @param category
     *            the type of survey results changed (i.e. major, region, hobby)
     * @param heards
     *            the heards found from the results of this survey
     * @param likes
     *            the likes found from the survey results
     */
    public void calculate(int category, String survey, String heards, String likes) {
        heardSong(category, survey, heards);
        likedSong(category, survey, likes);
    }

    /**
     * Returns an integer value based on two Strings reading the same
     * 
     * @param str1
     *            the to string to be compared to
     * 
     * @param str2
     *            the string being compared
     */
    @Override
    public int compare(String str1, String str2) {
        return (str1.compareTo(str2));
    }
    
    /**
     * Creates a integer array containing the percentages of the likes by Hobby,
     * Region or class
     * 
     * @param category
     *            integer representing which category to calculate the
     *            percentage of likes for
     * 
     * @return an integer array containing the percentage of the total likes for
     *         each track
     */
    public int[] percentageHeard(int category) {
        int[] percent = new int[4];

        if (category == 0) {

            for (int i = 0; i < percent.length; i++) {
                percent[i] = (heardMajor[i][0] / (heardMajor[i][0]
                    + heardMajor[i][1]));
            }
        }
        else if (category == 1) {

            for (int i = 0; i < percent.length; i++) {
                percent[i] = (heardRegion[i][0] / (heardRegion[i][0]
                    + heardRegion[i][1]));
            }
        }
        else {

            for (int i = 0; i < percent.length; i++) {
                percent[i] = (heardHobby[i][0] / (heardHobby[i][0]
                    + heardHobby[i][1]));
            }
        }
        
        return percent;

    }
    /**
     * Creates a integer array containing the percentages of the likes by Hobby,
     * Region or class
     * 
     * @param category
     *            integer representing which category to calculate the
     *            percentage of likes for
     * 
     * @return an integer array containing the percentage of the total likes for
     *         each track
     */
    public int[] percentageLikes(int category) {
        int[] percent = new int[4];

        if (category == 0) {

            for (int i = 0; i < percent.length; i++) {
                percent[i] = (likedMajor[i][0] / (likedMajor[i][0]
                    + likedMajor[i][1]));
            }
        }
        else if (category == 1) {

            for (int i = 0; i < percent.length; i++) {
                percent[i] = (likedRegion[i][0] / (likedRegion[i][0]
                    + likedRegion[i][1]));
            }
        }
        else {

            for (int i = 0; i < percent.length; i++) {
                percent[i] = (likedHobby[i][0] / (likedHobby[i][0]
                    + likedHobby[i][1]));
            }
        }
        
        return percent;

    }
}
