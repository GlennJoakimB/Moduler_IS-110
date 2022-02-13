
/**
 * Write a description of class Potion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Potion
{
    // instance variables - replace the example below with your own
    private String name; //what potion it is
    private int value; //what the potion gives in points

    /**
     * Constructor for objects of class Potion
     */
    public Potion(String name, int value)
    {
        // initialise instance variables
        this.name = name;
        this.value = value;
    }

    public String GetName()
    {
        return name;
    }
    
    public int GetValue()
    {
        return value;
    }
}
