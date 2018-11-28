
package prj5;

/**
 * A class that represents each track presented in the survey.
 * 
 * @author Andrew Caldwell (candrew9)
 * @version 2018.11.25
 *
 */
public class Track {

    // fields
    private String name;
    private String artist;
    private String date;
    private String genre;


    /**
     * Creates a new track, establishing the fields by using the title, artist,
     * date, genre and other data required for survey results
     * 
     * @param name
     *            the name of the track
     * @param artist
     *            the artist who created the track
     * @param date
     *            the date the track was created
     * @param genre
     *            the genre this tack follows
     */
    public Track(String name, String artist, String date, String genre) {
        this.name = name;
        this.artist = artist;
        this.date = date;
        this.genre = genre;
    }

    /**
     * Gets the name of the artist who created this track
     * 
     * @return the name of the artist
     */
    public String getArtist() {
        return artist;
    }
    
    /**
     * Gets the name of the track
     * 
     * @return the name of the track
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the date the track was created
     * 
     * @return the date of the track
     */
    public String getDate() {
        return date;
    }
    
    /**
     * Gets the genre of the track
     * 
     * @return the genre of the track
     */
    public String getGenre() {
        return genre;
    }
    
    //Method that calls the percent calculator and gets results
    
    /**
     * Return a string of this song
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Song Title: ");
        builder.append(name);
        builder.append("\n");
        builder.append("Song Artist: ");
        builder.append(artist);
        builder.append("\n");
        builder.append("Song Genre: ");
        builder.append(genre);
        builder.append("\n");
        builder.append("Song Year: ");
        builder.append(date);
        builder.append("\n");
        
        return builder.toString();
    }

}
