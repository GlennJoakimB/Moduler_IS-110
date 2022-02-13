
/**
 * Write a description of class Target here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Target
{
    private int hits;
    private int atk;

    /**
     * Constructor for objects of class Target
     */
    public Target()
    {
        // initialise instance variables
        hits = 0;
        atk = 20;
    }

    /**
     * When hit, increase number
     */
    public void GetHit()
    {
        hits++;
    }
    
    public void AtkPlayer(Player p)
    {
        p.GetAtked(atk);
    }
    
    public int GetNumbHits()
    {
        return hits;
    }
}
