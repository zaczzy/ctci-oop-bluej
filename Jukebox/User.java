
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    // instance variables - replace the example below with your own
    private String name;
    private long id;
    public static long idTracker = 2 ^ 5;
    /**
     * Constructor for objects of class User
     */
    public User(String name)
    {
        // initialise instance variables
        id = idTracker++;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public long getId() {
        return id;
    }
}
