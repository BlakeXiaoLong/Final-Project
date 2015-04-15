/*
This is to be a rendition (read: port) of Huge Quest spawning from
    the deepest parts of the 4chan board /tg/
I am Andrew Jimenez, project codehead; Along with me on this fateful
    adventure are Alex Osterholzer, project leader,
    and Joshua Sloat, project somethingsomethingsomething
        
Here goes nothing
*/

package pkgfinal.project;
import java.util.Scanner;
public class FinalProject
{
    static int turncounter = 0;
    static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        out("Welcome to Huge Quest: The Game\n"
                + "An adventure where your only mission is to become HUGE\n"
                + "In fact, the HUGEest of all HUGE\n\n"
                + "But right now, you are just a man,\n"
                + "a rather girlish man, to be quite frank.\n\n"
                + "But no matter, you will become HUGE!\n"
                + "(or fail the game, honestly, they're both the same to me)");
        out("Press 1 to continue");
        if(menu() == 1)
            loading();
        else
            out("Ok then, guess you really didn't want to play\n");
    }
    public static void out(String text) // If only it were cout <<
    {
        System.out.println(text);
    }
    public static int menu()
    {
        turncounter++;    
        return userInput.nextInt();
    }
    
    public static void pause(int x) // 1 eats a newline character before pausing, 2 does not
    {
        if(x == 1) userInput.nextLine();
        out("Press Enter to continue");
        userInput.nextLine();
    }
    
    public static void loading()
    {
        out("\n\n\n\n\n\nYou begin as a nameless peon, weak and frail\n"
                + "like a little girl\n"
                + "For many years, you have blown in the winds of...\n"
                + "time... and things.\n\n"
                + "Your goal?\n"
                + "To become the HUGEST of HUGE\n"
                + "... It hasn't worked out so far.\n\n"
                + "But you can feel it.\n"
                + "This will be day you've been waiting for\n"
                + "This will be the day we open up the do-\n\n"
                + "Wait, What's your name again?");
        userInput.nextLine(); // to eat the newline character
        String name = userInput.nextLine();
        if(name.equals("Bulk Squatthrust"))
            out("\n\n\n\n\n\nGood Choice!");
        else
        {
            out("\n\n\n\n\n\nNah, that's a stupid name.\n"
                    + "You need a tough-sounding name\n"
                    + "like Tarkus or Blake or Jaune Ar-\n"
                    + "  wait no, that's a stupid one.\n\n"
                    + "I know!\n"
                    + "How about Bulk Squatthrust?\n"
                    + "(Y/N)");
            name = userInput.nextLine(); /* "warning: the assigned value is never used"
                                            Your point being? Silly Java,
                                            who would ever use the input they take from their users? */
        }
        
        out("\n\n\n\n\n\nYes, and what a glorious name it is.\n"
                + "You don't deserve it right now,\n"
                + "but you will earn the right to call yourself 'Bulk'\n"
                + "or HUGE!");
        pause(2);
        
        out("\n\nAlso, before we start, you should probably mention that you\n"
                + "are poor and have no job.\n"
                + "Also that you have a very loose sense of ethics,\n"
                + "and aren't above the most heinous atrocities against mankind");
        
        // Now that that's done, we can move on
        M1();
    }
    
    public static void M1()
    {
        
    }
}