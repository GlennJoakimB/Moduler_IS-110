import java.util.Random;
/**
 * Write a description of class Magic_8ball here.
 *
 * @author Glenn Joakim
 * @version 23/02/2022
 */
public class Magic_8ball
{
    private Random randomNumb;

    /**
     * Constructs a Magic_8ball
     */
    public Magic_8ball()
    {
        randomNumb = new Random();
    }
       
    /**
     * Ask the 8ball a question, and an answer will be given if the parameter ends
     * with a question-mark. If there is no question-mark, a message is printed.
     * 
     * @param   question    A full question in the form of a string
     * @return  void
     */
    public void ask(String input)
    {
        input.trim();
        if(input.contains("?")){
            giveResponse();
        } else {
            System.out.println("Was that a question?");
        }
    }
    
    
    /**
     * Prints out a random response between yes, no and maybe.
     * 
     * @return  void
     */
    private void giveResponse()
    {
        int index = randomNumb.nextInt(3);
        if(index == 0){
            System.out.println("Yes");
        }
        if(index == 1){
            System.out.println("No");
        }
        if(index == 2){
            System.out.println("Maybe");
        }
    }
}
