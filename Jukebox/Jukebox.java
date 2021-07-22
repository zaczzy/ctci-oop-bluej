import java.util.Set;

/**
 * Write a description of class Jukebox here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jukebox
{
    // instance variables - replace the example below with your own
    private int x;
    private CDPlayer cdPlayer;
    private User user;
    private Set<CD> cdCollection;
    private SongSelector ts;
    /**
     * Constructor for objects of class Jukebox
     */
    public Jukebox(CDPlayer player, User user, Set<CD> collection, SongSelector ts)
    {
        // initialise instance variables
        cdPlayer = player;
        this.user = user;
        cdCollection = collection;
        this.ts = ts;
    }
    public void playSongFromPlaylist(){}
    public void playSongFromCD() {}
    public Song getCurrentSong()
    {
        return cdPlayer.getCurrentSong();
    }
}
