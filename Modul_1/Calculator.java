
/**
 * Write a description of class Calculator here.
 * A simple calculator for adding, subtracting,
 * dividing and multiplying two numbers
 *
 * The purpose of this class is for me to demonstrate
 * my knowledge of Java code and use of BlueJ.
 *
 * @author (Glenn Joakim Bakklund)
 * @version (14.01.2022)
 */
public class Calculator
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private String prosess;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        x = 0;
        y = 0;
        prosess = "add";
    }

    /**
     * simple method of calculation
     * choose between ("add", "sub", "div", "multi",)
     */
    public int prosess(String newProsess,int x,int y)
    {
        prosess = newProsess;
        if (prosess == "multi") {
            return x * y;
        }
        else if (prosess == "div"){
            return x / y;
        }
        else if (prosess == "sub"){
            return x - y;
        }
        else {
            // if "add"
            return x + y;
        }
    }
    
}
