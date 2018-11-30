
package prj5;

/**
 * Class that compares a toString method of the track and creates a DLList
 * organized the preferred way
 * 
 * @author group 124
 * @version 2018.11.28
 *
 */
public class trackComparator {

    // fields
    DLList<Track> tracks;
    Track[] array;


    /**
     * Creates a new trackComparator
     * 
     * @param list
     *            a DLList containing tracks and their data
     */
    public trackComparator(DLList<Track> list) {
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
            result.add(array[k]);
        }
        return result;
        
    }

}
