import java.util.HashMap;
import java.util.HashSet;
/**
 * A FishBucket for storing the number of items collected from the pond,
 * as well as ceeping track and displaying when one of every item is collected.
 *
 * @author Glenn Joakim
 * @version 23/02/2022
 */
public class FishBucket
{
    // instance variables - replace the example below with your own
    private HashMap<String, Integer> count;
    private HashSet<String> collected;

    /**
     * Constructs a FishBucket for storing the items collected from the pond.
     */
    public FishBucket()
    {
       count = new HashMap<>();
       collected = new HashSet<>();
    }

    /**
     * Adds an item to the bucket for counting.
     *
     * @param item  A string object to add to the bucket
     * @return      void
     */
    public void add(String item)
    {
        //add to collection
        collected.add(item);
        completeCollection();
        //add to counter
        int numb = count.getOrDefault(item, 0);
        count.put(item, numb + 1);
        
    }
    
    /**
     * Display the count of items in the bucket
     */
    public void showCount()
    {
        //
        System.out.println(count);
    }
    
    
    /**
     * A method for checking if the bucket contains one of every available
     * item from the pond
     * 
     * @return  void
     */
    public void completeCollection()
    {
        if(collected.contains("Boot") &&
            collected.contains("Bucket") &&
            collected.contains("Fishhook") &&
            collected.contains("Bottle") &&
            
            collected.contains("Trout") &&
            collected.contains("Salmon") &&
            collected.contains("Tuna") &&
            collected.contains("Cod"))
        {
            //
            System.out.println("\n" + "I have collected one of each item now.");
        }
    }
}
