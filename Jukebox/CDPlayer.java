
/**
 * Write a description of class CDPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CDPlayer
{
    private Playlist p;
    private CD c;
    
    /**
     * Constructor for objects of class CDPlayer
     */
    public CDPlayer(CD c, Playlist p)
    {
        // initialise instance variables
        this.p = p;
        this.c = c;
    }

    /**
     * Do nothing at our logic level, call the actual song player driver
     * 
     */
    public void playSong(Song s)
    {
        // put your code here
    }
    
    public Playlist getPlaylist() {
        return p;
    }
    public void shufflePlaylist(){
        p.shuffle();
    }
    public Song getCurrentSong() {
        return p.getPlaying();
    }
}
