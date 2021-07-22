
/**
 * Write a description of class SongSelector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SongSelector
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class SongSelector
     */
    public SongSelector()
    {
    }

    public Song selectSong(String title, long length)
    {
        // put your code here
        return new Song(title, length);
    }

}
