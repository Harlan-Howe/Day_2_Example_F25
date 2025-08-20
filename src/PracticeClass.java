import java.util.Scanner;

public class PracticeClass
{
    private String myName;
    private Scanner keyReader;

    public PracticeClass() // constructor
    {
        System.out.println("Making a practice class.");
        keyReader = new Scanner(System.in);
    }

    /**
     * asks the user for his/her name and greets them with that name.
     */
    public void greetUser()
    {
        System.out.println("What is your name? ");
        // TODO: we need to write this!
    }

    /**
     * Uses a loop to say hello to the user 5 times.
     */
    public void sayHello5Times()
    {
        System.out.println("I'm gonna say hello 5 times!");
        // TODO: we need to write this, too.
    }
}
