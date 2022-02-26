import java.util.Random;
import java.util.ArrayList;
/**
 * A pond that holds many mysteries deep below the surface.
 *
 * @author Glenn Joakim
 * @version 23/02/2022
 */
public class Pond
{
    private Random randNumb;
    private ArrayList<String> itemsInPond;

    /**
     * Constructor for objects of class Pond
     */
    public Pond()
    {
        randNumb = new Random();
        itemsInPond = new ArrayList<>();
        fillPond();
    }

    /**
     * Generates a random catch
     *
     * @return    Random string from list
     */
    public String generateCatch()
    {
        int x = randNumb.nextInt(itemsInPond.size());
        return itemsInPond.get(x);
        //return itemsInPond.get(randNumb.nextInt(itemsInPond.size()));
    }
    
    /**
     * Fills the pond with items
     */
    public void fillPond()
    {
        //trash
        itemsInPond.add("Boot");
        itemsInPond.add("Bucket");
        itemsInPond.add("Fishhook");
        itemsInPond.add("Bottle");
        
        //fish
        itemsInPond.add("Trout");
        itemsInPond.add("Salmon");
        itemsInPond.add("Tuna");
        itemsInPond.add("Cod");
    }
    
    
}
