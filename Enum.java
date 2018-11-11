package prj5;

/**
 * Enum class
 * 
 * @author candrew9
 * @version 2018.11.11
 *
 */
public class Enum {
    // fields

    private String hobby = "";
    private String major = "";
    private String region = "";


    /**
     * Constructs an Enum based off the given parameters of the object
     * 
     * @param hobby
     *            the hobby of the student
     * @param major
     *            the major of the student
     * @param region
     *            The region where the student lives
     */
    public Enum(String hobby, String major, String region) {
        this.hobby = hobby;
        this.major = major;
        this.region = region;
    }


    /**
     * Retrieves the hobby of this enum
     */
    public String hobby() {
        return this.hobby;
    }


    /**
     * Retrieves the major of this enum
     */
    public String major() {
        return this.major;
    }


    /**
     * Retrieves the region of this enum
     */
    public String region() {
        return this.region;
    }
}
