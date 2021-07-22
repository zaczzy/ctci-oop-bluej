import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
// ArrayDeque is faster for iteration and insert/delete at both ends.
// LinkedList is faster when deleting current element during iteration.
import java.util.ArrayDeque;

/**
 * Write a description of class Playlist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Playlist
{
    // instance variables - replace the example below with your own
    private Song playing;
    private Queue<Song> queue;

    /**
     * Constructor for objects of class Playlist
     */
    public Playlist()
    {
        // initialise instance variables
        playing = null;
        queue = new ArrayDeque<>();
    }

    public Playlist(Song s) {
        this(s, new ArrayList<>());
    }
    public Playlist(List<Song> list) {
        this(null, list);
    }
    public Playlist (Song s, List<Song> list) {
        playing = s;
        for (Song song : list) {
            queue.add(song);
        }
    }
    public void currentSongEnds()
    {
        // put your code here
        playing = queue.remove();
    }
    public Song getPlaying() {
        return playing;
    }
    public void queueUpSong(Song s) {
        queue.add(s);
    }
    
    public void shuffle() {
        // driver: stop playing
        queue.add(playing);
        List<Song> shuffled = new ArrayList<>(queue);
        Collections.shuffle(shuffled);
        queue = new ArrayDeque<>(shuffled);
        playing = queue.remove();
    }
}
