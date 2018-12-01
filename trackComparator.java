
package prj5;

/**
 * Class that compares a toString method of the track and creates a DLList
 * organized the preferred way
 * 
 * @author group 124
 * @version 2018.11.28
 *
 */
public class TrackComparator {

    // fields
    DLList<Track> tracks;
    Track[] array;


    /**
     * Creates a new trackComparator
     * 
     * @param list
     *            a DLList containing tracks and their data
     */
    public TrackComparator(DLList<Track> list) {
        tracks = list;
        array = new Track[tracks.size()];
        for (int i = 0; i < tracks.size(); i++) {
            array[i] = tracks.getNodeAtIndex(i).getData();
        }
    }


    /**
     * Sorts the list by Name
     * 
     * @return DLList containing track data, sorted by name and alphabetical
     *         order
     */
    public DLList<Track> sortByName() {
        Track temp;
        
        
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            String tempName = temp.getName();
            int j = 0;
            for (j = i; j > 0; j--) {
                if (tempName.compareTo(array[j - 1].getName()) < 0) {
                    array[j] = array[j - 1];
                }
                else {
                    break;
                }
               
            }
            array[j] = temp;
        }
        
        DLList<Track> result = new DLList<Track>();
        for (int k = 0; k < array.length; k++) {
            result.add(k, array[k]);
        }
        return result;
        
    }
    
    /**
     * Sorts the list by Genre
     * 
     * @return DLList containing track data, sorted by genre and alphabetical
     *         order
     */
    public DLList<Track> sortByGenre() {
        Track temp;
        
        
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            String tempName = temp.getGenre();
            int j = 0;
            for (j = i; j > 0; j--) {
                if (tempName.compareTo(array[j - 1].getGenre()) < 0) {
                    array[j] = array[j - 1];
                }
                else {
                    break;
                }
               
            }
            array[j] = temp;
        }
        
        DLList<Track> result = new DLList<Track>();
        for (int k = 0; k < array.length; k++) {
            result.add(k, array[k]);
        }
        return result;
        
    }
    
    /**
     * Sorts the list by Artist
     * 
     * @return DLList containing track data, sorted by genre and alphabetical
     *         order
     */
    public DLList<Track> sortByArtist() {
        Track temp;
        
        
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            String tempName = temp.getArtist();
            int j = 0;
            for (j = i; j > 0; j--) {
                if (tempName.compareTo(array[j - 1].getArtist()) < 0) {
                    array[j] = array[j - 1];
                }
                else {
                    break;
                }
               
            }
            array[j] = temp;
        }
        
        DLList<Track> result = new DLList<Track>();
        for (int k = 0; k < array.length; k++) {
            result.add(k, array[k]);
        }
        return result;
        
    }
    
    /**
     * Sorts the list by Year
     * 
     * @return DLList containing track data, sorted by date and alphabetical
     *         order
     */
    public DLList<Track> sortByYear() {
        Track temp;
        
        
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            String tempName = temp.getDate();
            int j = 0;
            for (j = i; j > 0; j--) {
                if (tempName.compareTo(array[j - 1].getDate()) < 0) {
                    array[j] = array[j - 1];
                }
                else {
                    break;
                }
               
            }
            array[j] = temp;
        }
        
        DLList<Track> result = new DLList<Track>();
        for (int k = 0; k < array.length; k++) {
            result.add(k, array[k]);
        }
        return result;
        
    }

}
