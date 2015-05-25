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
import java.util.Random;
public class FinalProject
{
    static int turncounter = 0;
    static Scanner userInput = new Scanner(System.in);
    Random rand = new Random();
    
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
        Process exitCode;
        int response = userInput.nextInt();
        try
        {
            if(System.getProperty("os.name").startsWith("Window") )
                exitCode = Runtime.getRuntime().exec("cls");
            else
                exitCode = Runtime.getRuntime().exec("clear");
        }
        catch (Exception e)
        {
            for(int i = 0; i < 1000; i++)
                System.out.println();
        }
        
        turncounter++;    
        return response;
    }    
    public static void pause(int x) // 1 eats a newline character before pausing, 2 does not
    {
        if(x == 1) userInput.nextLine();
        out("Press Enter to continue");
        userInput.nextLine();
        Process exitCode;
        try
        {
            if(System.getProperty("os.name").startsWith("Window") )
                exitCode = Runtime.getRuntime().exec("cls");
            else
                exitCode = Runtime.getRuntime().exec("clear");
        }
        catch (Exception e)
        {
            for(int i = 0; i < 1000; i++)
                System.out.println();
        }
    }
    public static void Wait(Character Bulk)
    {
        out("You wait.\n"
                + "I don't know why but you do.\n"
                + "Because I hate campers, I kill you.\n");
        ded(Bulk);
    }
    public static void ded(Character Bulk)
    {
        out("LMAO\n"
                + "U R DED\n");
        out("Retry?\n"
                + "1. Yes\n"
                + "2. No\n");
        switch(menu())
        {
            case 1:
                Bulk.exp = 129;
                Bulk.level = 1;
                M1(Bulk);
                break;
            case 2:
                System.exit(0);
                break;
            default:
                out("Invalid Input\n"
                        + "So I'm gonna take that as a no.\n");
                System.exit(0);
                break;
                
        }
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
        if(userInput.nextLine().equals("Bulk Squatthrust"))
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
            userInput.nextLine(); /* "warning: the assigned value is never used"
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
        pause(2);
        Character Bulk = new Character();
        // Now that that's done, we can move on
        M1(Bulk);
    }
    
    public static void M1(Character Bulk)
    {
        if(Bulk.exp == 128)
        {
            out("\n\nThere is a bottle of PILLZ on the desk before you.\n\n"
                    + "What shall you do?\n"
                    + "1. Excercise like a boss\n"
                    + "2. Take the PILLZ\n"
                    + "3. Wait");
            switch(menu())
            {
                case 1:
                    out("You try to buff up, but your limp arm noodles\n"
                            + "are incapable of lifting anthing more than that\n"
                            + "conveniently-placed bottle of PILLZ on the counter.");
                    M1(Bulk);
                    break;
                case 2:
                    out("After spending several minutes trying to open the PILLZ\n"
                            + "you finally muster the strength to open them\n"
                            + "and down half the container.\n\n"
                            
                            + "Kids: Don't try this at home.\n");
                    Bulk.exp = 129;                    
                    M1(Bulk);
                    break;
                case 3:
                    Wait(Bulk);
                    break;
                default:
                    out("Invalid Input\n");
                    M1(Bulk);
                    break;
            }
        }
        else if(Bulk.exp == 129)
        {
            out("You are in an empty house.\n"
                    + "It isn't yours, you just broke in here\n"
                    + "to feel sorry for yourself.\n\n"
                    + "With the power of the PILLZ running though you\n"
                    + "you feel like you could do anything!\n"
                    + "You could bench press an empty milk carton\n"
                    + "or lift your own body weight\n"
                    + "What shall you do?\n"
                    + "1. Excercise like a boss\n"
                    + "2. Wait\n");
            switch(menu())
            {
                case 1:
                    out("You choose to exercise\n"
                            + "and exercise you do.\n"
                            + "With the power of a normal human being\n"
                            + "and the longevity of a small child\n"
                            + "you spend the next 90 seconds moving around the\n"
                            + "house with the speed that would astound most snails\n\n"
                            + "Maybe you should have mentioned that you've never exercised");
                    Bulk.exp = 130;
                    M1(Bulk);
                    break;
                case 2:
                    Wait(Bulk);
                    break;
                default:
                    out("Invalid Input\n");
                    M1(Bulk);
                    break;
            }
        }
        else if(Bulk.exp == 130) // Ayy lmao, I wrote this bit, hope it doesn't suck too bad - Alex
        {
            out("A mysterious power grows within your body.\n"
                    + "You don't know what it is or where it came from.\n\n"
                    + "Is this what people call 'strength'?\n\n"
                    + "There doesn't seem to be much left in this house for you to HUGE yourself with.\n"
                    + "What now?\n"
                    + "1. Excercise as much as humanly possible\n"
                    + "2. Break through the wall\n"
                    + "3. Wait\n");
            switch(menu())
            {
                case 1:
                    out("Feeling the need to gain more mass\n"
                            + "you begin a rigorous bout of pushups, working\n"
                            + "your arm muscles as long as you can.\n"
                            + "Which is a little over one rep.\n"
                            + "Barely managing to lift yourself off of\n"
                            + "the ground, you feel no different than earlier.\n"
                            + "Instead, you decide that leaving might be a good idea.\n"
                            + "Feeling exhausted from excercise, you slowly\n"
                            + "walk to the door and exit.\n");
                    M2(Bulk);
                    break;
                case 2:
                    out("Feeling as though you could do\n"
                            + "anything with this new power, you\n"
                            + "you hurl yourself at the wall in\n"
                            + "an attempt to break through it.\n"
                            + "Your meager mass smashes against the \n"
                            + "surface with a soft thud.\n"
                            + "Tending to a bruised shoulder, you\n"
                            + "decide that the door is a better\n"
                            + "idea, and make your exit.");
                    M2(Bulk);
                    break;
                case 3:
                    Wait(Bulk);
                    break;
                default:
                    out("Invalid Input\n");
                    M1(Bulk);
                    break;
            }
        } // Time for the next area boyz
        else
        {
            out("How'd you manage to do that??\n");
        }
    }
    public static void M2(Character Bulk)
    {
        out("As you exit the house, you see a HUMAN\n"
                + "in your path.\n"
                + "What to do?\n"
                + "1. Fight!\n"
                + "2. Allow him to live\n"
                + "3. Wait\n");
        switch(menu())
        {
            case 1:
                Battle b = new Battle(Bulk, new Character("Human", 2, 30, 10, 10, 10, 65));
                if(!b.activate())
                    ded(Bulk);
                out("After your intense battle with the human warrior\n"
                        + "he falls, and you see that he is merely a child\n"
                        + "Perhaps you should HUGE yourself more before\n"
                        + "you try to fight again\n");
                M2_2(Bulk);
                break;
            case 2:
                out("You allow him to live...\n"
                        + "for now.\n");
                M2_2(Bulk);
                break;
            case 3:
                Wait(Bulk);
                break;
            default:
                out("Invalid Input\n");
                M2(Bulk);
                break;
        }
    }
    public static void M2_2(Character Bulk)
    {
        out("After the HUMAN, you see another house,\n"
                + "What to do?\n"
                + "1. Go to the house\n"
                + "2. Wait\n");
        switch(menu())
        {
            case 1:
                M2_3(Bulk);
                break;
            case 2:
                Wait(Bulk);
                break;
            default:
                out("Invalid Input\n");
                M2_2(Bulk);
                break;
        }
    }
    public static void M2_3(Character Bulk)
    {
        out("With your newfound power,\n"
                        + "you bash the front door of the house open.\n"
                        + "Inside, you see a refrigerator. That is all.\n"
                        + "This is a very sparse house\n"
                        + "What do you do?\n"
                        + "1. Devour the contents of the refrigerator\n"
                        + "2. Go outside\n"
                        + "3. Wait\n");
                switch(menu())
                {
                    case 1:
                        out("You eat everything in the refrigerator.\n"
                                + "Everything. Shelves and all\n"
                                + "Afterward, you eat the refrigertator too.\n\n"
                                + "You feel an immense power growing inside of you\n"
                                + "You feel... HUGE\n\n"
                                + "With the strength of a tanker truck,\n"
                                + "you plow through the wall of the house right into...\n"
                                + "Oh.\n"
                                + "Maybe you aren't as HUGE as you thought...\n");
                        M3(Bulk);
                        break;
                    case 2:
                        M2_2(Bulk);
                        break;
                    case 3:
                        Wait(Bulk);
                        break;
                    default:
                        out("Invalid Input\n");
                        M2_3(Bulk);
                        break;
                }
    }
    public static void M3(Character Bulk)
    {
        
    }
    public static void M4_1(Character Bulk)
    {
        
    }
    public static void M4_2(Character Bulk)
    {
        
    }
    public static void M4_3(Character Bulk)
    {
        
    }
    public static void M4_4(Character Bulk)
    {
        
    }
    public static void M4_5(Character Bulk)
    {
        
    }
    public static void M4_6(Character Bulk)
    {
        
    }
    public static void M4_7(Character Bulk)
    {
        
    }
    public static void M4_8(Character Bulk)
    {
        
    }
    public static void M4_9(Character Bulk)
    {
        
    }
    public static void M5_1(Character Bulk)
    {
        
    }
    public static void M5_2(Character Bulk)
    {
        
    }
    public static void M6(Character Bulk)
    {
        
    }
    public static void M7(Character Bulk)
    {
        
    }
    public static void M8(Character Bulk)
    {
        
    }
    public static void M9(Character Bulk)
    {
        
    }
    public static void M10(Character Bulk)
    {
        
    }
}
