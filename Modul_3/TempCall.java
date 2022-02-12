
/**
 * Write a description of class TempCall here.
 *
 * @author Glenn Joakim
 * @version 01/02/2022
 */
public class TempCall
{
    // instance variables - replace the example below with your own
    private int x;
    private TempNumb tempN;

    /**
     * Constructor for objects of class TempCall
     */
    public TempCall()
    {
        // initialise instance variables
        x = 2;
        tempN = new TempNumb();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleCalc()
    {
        // put your code here
        return x + tempN.GetNumb();
        // forvente 7
    }
    
    private void GrowCalc()
    {
        //
        tempN.GrowNumb();
        x = x + 2;
    }
    
    public int NewCalc()
    {
        //
        GrowCalc();
        return x + tempN.GetNumb();
    }
}
