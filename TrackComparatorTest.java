package prj5;

import student.TestCase;

/**
 * 
 * Tests the insertion sort methods present in the percent calculator
 * 
 * @author Group 124
 * 
 * @version 2018.11.28
 *
 */
public class TrackComparatorTest extends TestCase {

    // fields

    private DLList<Track> trackList;
    private TrackComparator comparator;
    private Track t;
    private Track track;
    private Track tires;


    /**
     * Sets up the common test scenario
     */
    public void setUp() {
        trackList = new DLList<Track>();
        
        track = new Track("tracks", "roads", "1999", "pop");
        t = new Track("name", "artist", "2008", "genre");
        
        tires = new Track("xPresso", "life", "2021", "money");
        trackList.add(t);
        trackList.add(track);
        trackList.add(tires);
        comparator = new TrackComparator(trackList);
    }

    /**
     * Tests the sortName method, which organizes the songs in the DLList by
     * their string Name
     */
    public void testSortByName() {
        DLList<Track> control = new DLList<Track>();
        
        control.add(t);
        control.add(track);
        control.add(tires);
        
        assertEquals(control.toString(), comparator.sortByName().toString());
    }
    
    /**
     * Tests the sortByGenre method, which organizes the songs in the DLList by
     * their string genre
     */
    public void testSortByGenre() {
        DLList<Track> control = new DLList<Track>();
        
        control.add(t);
        control.add(tires);
        control.add(track);
        
        
        
        assertEquals(control.toString(), comparator.sortByGenre().toString());
    }
    
    /**
     * Tests the sortByArtist method, which organizes the songs in the DLList by
     * their string artist
     */
    public void testSortByArtist() {
        DLList<Track> control = new DLList<Track>();
        
        control.add(t);
        control.add(tires);
        control.add(track);
        
        
        
        assertEquals(control.toString(), comparator.sortByArtist().toString());
    }
    
    /**
     * Tests the sortByGenre method, which organizes the songs in the DLList by
     * their string genre
     */
    public void testSortByYear() {
        DLList<Track> control = new DLList<Track>();
        
        control.add(track);
        control.add(t);
        control.add(tires);
        
        
        assertEquals(control.toString(), comparator.sortByYear().toString());
    }

}
