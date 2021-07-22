import java.util.ArrayList;
/**
 * Write a description of class CD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CD
{
    // instance variables - replace the example below with your own
    private int id;
    private String artist;
    private ArrayList<Song> songs;
    public static int idTracker = 0;
    /**
     * Constructor for objects of class CD
     */
    public CD(String artist, ArrayList<Song> songs)
    {
        // initialise instance variables
        id = idTracker++;
        this.artist = artist;
        this.songs = songs;
    }
    public CD(String artist)
    {
        // initialise instance variables
        id = idTracker++;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
    
    public void addSong(Song s)
    {
        // put your code here
        songs.add(s);
        s.setCD(this);
    }
    
    public int size() {
        return songs.size();
    }
}
