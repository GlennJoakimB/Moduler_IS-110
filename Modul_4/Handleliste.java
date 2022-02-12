import java.util.ArrayList;
/**
 * Write a description of class Handleliste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Handleliste
{
    // instance variables - replace the example below with your own
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
        // put your code here
        list.add(new Vare(name));
    }
    
    
    
    public void RemoveItem(int index)
    {
        if(index < list.size()){
            list.remove(index);
        }
    }
}
