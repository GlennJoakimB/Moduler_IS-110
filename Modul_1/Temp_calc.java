
/**
 * Write a description of class Temp_calc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temp_calc
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private String method;

    /**
     * Constructor for objects of class Temp_calc
     */
    public Temp_calc()
    {
        // initialise instance variables
        x = 0;
        y = 5;
        method = "add";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int process(int x, String newMethod, int y)
    {
        method = newMethod;
        if (method == "sub") {
            System.out.println("subtract");
            return x - y;
        } else {
            // if add
            System.out.println("add");
            return x + y;
        }
    }
}
