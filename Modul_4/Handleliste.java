import java.util.ArrayList;
/**
 * Handleliste over varer man trenger.
 *
 * @author (Glenn Jaokim)
 * @version (11/02/2022)
 */
public class Handleliste
{
    private ArrayList<Vare> list;

    /**
     * Constructor for objects of class Handleliste
     */
    public Handleliste()
    {
        // initialise instance variables
        list = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void AddItem(String name)
    {
        list.add(new Vare(name));
    }
    
    public void ListItems()
    {
        //
        for(Vare v : list) {
            System.out.println(v.GetName());
        }
    }
    
    public void RemoveItem(int index)
    {
        if(index < list.size()){
            list.remove(index);
        }
    }
}
