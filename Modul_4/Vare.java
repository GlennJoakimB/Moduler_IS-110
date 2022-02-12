
/**
 * En handleVare fra butikken
 *
 * @author Glenn Joakim
 * @version 04/02/2022
 */
public class Vare
{
    // instance variables - replace the example below with your own
    private String name;
    //private int amount;

    /**
     * Constructor for objects of class Vare
     */
    public Vare(String name)
    {
        // initialise instance variables
        this.name = name;
        //this.amount = amount;
    }
    
    public String GetName()
    {
        return name;
    }

}
