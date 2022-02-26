import java.util.Random;
/**
 * A dice with a flexible amount of sides.
 * Roll the dice to generate a sudo-random number.
 *
 * @author Glenn Joakim
 * @version 25/02/2022
 */
public class Dice
{
    private Random randNumb;

    /**
     * Constructs a Dice
     */
    public Dice()
    {
        randNumb = new Random();
    }

    /**
     * Generate a random number between 1 and y
     * 
     * @param y     Number of sides on the dice
     * @return void
     */
    public void rollDice(int y)
    {
        int numb = randNumb.nextInt(y);
        numb++;
        System.out.println(numb);
    }
}
