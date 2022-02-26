import java.util.HashMap;
/**
 * A fisher that wants to get some fish.
 * The hook will return with a random item.
 *
 * @author Glenn Joakim
 * @version 23/02/2022
 */
public class Fisher
{
    private Pond pond;
    private HashMap<String, String> response;
    private FishBucket bucket;

    /**
     * Constructor for the game
     */
    public Fisher()
    {
        pond = new Pond();
        bucket = new FishBucket();
        response = new HashMap<>();
        fillResponse();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void throwHook()
    {
        String caughtItem = pond.generateCatch();
        String resp = response.get(caughtItem);
        
        if(resp != null) {
            System.out.println(resp);
        }
        bucket.add(caughtItem);
    }
    
    /**
     * 
     */
    public void displayBucket()
    {
        bucket.showCount();
    }
    
    /**
     * Fill the hashmap response with responses.
     */
    private void fillResponse()
    {
        //trash
        response.put("Boot",
                 "Agh, just an old boot.");
        response.put("Bucket",
                 "A rusty old bucket? Not worth much.");
        response.put("Fishhook",
                 "Heh, a lost fishinghook.");
        response.put("Bottle",
                 "A glass bottle? The label is washed off.");
        
        //fish
        response.put("Trout",
                 "Trout! A fine catch!");
        response.put("Salmon",
                 "A slippery salmon. Not bad.");
        response.put("Tuna",
                 "A small tuna.");
        response.put("Cod",
                 "A cod. Not bad.");
    }
}
