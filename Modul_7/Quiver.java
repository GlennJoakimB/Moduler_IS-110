
/**
 * Write a description of class Quiver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quiver
{
    // instance variables - replace the example below with your own
    private int arrows;

    /**
     * Constructor for objects of class Quiver
     */
    public Quiver()
    {
        // initialise instance variables
        arrows = 0;
    }

    /**
     * Fill it
     */
    public void Fill(int x)
    {
        // put your code here
        arrows = arrows + x;
    }
    
    public int GetArrowNumb()
    {
        return arrows;
    }
    
    public void ShootA()
    {
        if(arrows > 0)
            arrows = arrows - 1;
    }
}
