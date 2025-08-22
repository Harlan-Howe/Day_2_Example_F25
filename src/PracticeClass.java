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
        // Done: we need to write this!
        myName = keyReader.nextLine();
        System.out.println("Hello, "+myName+"!");
    }

    /**
     * Uses a loop to say hello to the user 5 times.
     */
    public void sayHello5Times()
    {
        System.out.println("I'm gonna say hello 5 times!");
        // TODO: we need to write this, too.
//        int i = 0;
//        while (i < 5)
//        {
//            System.out.println("Howdy again, "+myName);
//            i = i + 1;
//        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i+"\tHowdy again, "+myName);
        }

        double x = 5;
        double y = 3;
        System.out.println(x/y);

        System.out.println(Math.pow(5,3));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.abs(-42));

    }
}
