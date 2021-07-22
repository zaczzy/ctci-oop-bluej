
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int id;
    private long length;
    private String title;
    private CD cd;
    public static int idTracker = 0;
    /**
     * Constructor for objects of class Song
     */
    public Song(String title, long length)
    {
        // initialise instance variables
        cd = null;
        id = idTracker++;
        this.title = title;
        this.length = length;
    }
    
    /**
     * @return    the length of Song
     */
    public long getLength()
    {
        return length;
    }
    
    public void setCD(CD cd)
    {
        this.cd = cd;
    }

}
