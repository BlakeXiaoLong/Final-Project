/*
 * This is to be a rendition (read: port) of Huge Quest spawning from
 *     the deepest parts of the 4chan board /tg/
 * I am Andrew Jimenez, project codehead; Along with me on this fateful
 *    adventure are Alex Osterholzer, project leader,
 *    and Joshua Sloat, project somethingsomethingsomething
 *       
 * Here goes nothing
 */

package pkgfinal.project;
import java.util.Scanner;
import java.util.Random;
public class FinalProject
{
    static int turncounter = 0;
    static Scanner userInput = new Scanner(System.in);
    static Random rand = new Random();
    static final int a = rand.nextInt(9)+1, s = rand.nextInt(1)+1;
    
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
        try // clears the console upon recieving input
        {
            if(System.getProperty("os.name").startsWith("Window"))
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
        try // clears the console upon recieving input
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
                + "Because I hate campers, I kill you.\n"); // Rekt
        ded(Bulk);
    }
    public static void ded(Character Bulk)
    {
        while(true)
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
                    out("Invalid Input\n");
                    break;
            }
        }
    }
    public static void sleep(int i)
    {
        try // Sleep() function from C++
        {
            Thread.sleep(i);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
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
                + "This will be the day we open up the do-\n\n" // That's 1
                + "Wait, What's your name again?");
        userInput.nextLine(); // to eat the newline character
        if(userInput.nextLine().equals("Bulk Squatthrust"))
            out("\n\n\n\n\n\nGood Choice!");
        else
        {
            out("\n\n\n\n\n\nNah, that's a stupid name.\n"
                    + "You need a tough-sounding name\n"
                    + "like Tarkus or Blake or Jaune Ar-\n" // That's 2 and 3
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
                    + "or even lift your own body weight\n"
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
                        Bulk.exp = Bulk.expToLevel(Bulk.level+1);
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
        out("There is a HUGE woman here\n"
                + "She speaks:\n"
                + "\t'Subject Ten, why did you leave the facility?'\n"
                + "What do you reply?\n"
                + "1. 'Fight tha' power!'\n"
                + "2. 'HUGE!!'\n"
                + "3. Don't reply\n");
        switch(menu())
        {
            case 1:
                M3_1(Bulk); //TODO, make a response for this
                break;
            case 2:
                M3_2(Bulk);
                break;
            case 3:
                M3_3(Bulk);
                break;
            default:
                out("Invalid Input\n");
                M3(Bulk);
                break;
        }
    }
    public static void M3_1(Character Bulk) // Alex, I defer to your Gurren Lagann reference powers here
    {
        out("\tThe HUGE woman grins a HUGE grin and looks toward the ground.\n"
            + "When she looks up again she has red, V-shaped sunglasses on her face and one arm extended\n"
            + "into the air, jabbing a finger at the heavens."
            + "'You dumbass!' she yells. 'JUST WHO THE HELL DO YOU THINK I AM?'\n\n"
            + "At these words the woman begins to grow impossibly HUGE, her body stretching to the skies and continuing beyond.\n"
            + "'MY HUGE IS THE HUGE THAT WILL PIERCE THE HEAVENS!'\n\n"
            + "Your guts begin to churn and your sphincter loosens as you tremble before her might.\n"
            + "The ground shakes violently and as you loose your grip on reality a giant glowing drill\n"
            + "breaks through the ground beneath you. The drill rockets upwards, eviscerating you, despite your HUGE.\n\n"
            + "As your world fades to black, you think you see a mighty, blue haired man floating above you.\n"
            + "His words reach your ears just before you lose consciousness.\n\n");
        sleep(500);
        System.out.print(".");
        sleep(500);
        System.out.print(".");
        sleep(500);
        System.out.print(".");
        out("'A true man never dies ... even when he's killed.'\n");
        M3(Bulk); // I got you bro - Alex
    }
    public static void M3_2(Character Bulk)
    {
        out("\t'Ah.'\n"
                + "She says,\n"                
                + "\t'You need to come with me, back to the facility'\n"
                + "It is clear that she wants to end your quest to become HUGE,\n"
                + "so you do the only thing you can.\n"
                + "You fight her.\n"
                + "To begin with, she smashes you into the air with a POWER PUNCH.\n");
        pause(1);
        Battle b = new Battle(Bulk, new Character("HUGE Woman", 2, 15, 5, 5, 5, 40));
        if(!b.activate())
            ded(Bulk);
        out("After landing a final blow,\n"
                + "you SMASH the woman into the city below.\n"
                + "All this aerial combat has raised you to:\n"
                + "HUGE Level XL!\n");
        pause(2);
        Bulk.exp = Bulk.expToLevel(Bulk.level+1);
        out("The HUGE Woman lies in a crater below, you should probably\n"
                + "aim for that.\n");
        sleep(500);
        out("The city shakes with the force of HUGE against HUGE!\n\n");
        sleep(500);
        out("Boss Defeated:\n");
        sleep(500);
        out("\tXP: HUGE\n");
        pause(2);
        
        out("She speaks again:\n"
                + "\t'Surely you are the MOST HUGE of us now.\n"
                + "\tPerhaps now you can defeat our master, THE HUGEST'\n"
                + "'Surely she jests', you think. 'There is no one HUGER than I'\n"
                + "\t'Train well, nameless one.\n"
                + "\tHe awaits you, at the FACILITY'\n"
                + "'Where's that?'\n"
                + "\t'Honestly?\n"
                + "\tIt's the HUGE BUILDING, the one with HUGE FACILITY\n"
                + "\twritten on it in HUGE LETTERS'\n"
                + "'Oh yeah, how did I miss that?'"
                + "\t'Its good that you did not swallow all of the PILLZ,\n"
                + "\tyou should use them in a time of need'\n");
        pause(2);
        M4(Bulk);
    }
    public static void M3_3(Character Bulk)
    {
        out("She continues:\n"
                + "\t'You need to come with me, back to the facility'\n"
                + "It is clear that she wants to end your quest to become HUGE,\n"
                + "so you do the only thing you can.\n"
                + "You fight her\n.\n"
                + "To begin with, she smashes you into the air with a POWER PUNCH.\n");
        pause(1);
        Battle b = new Battle(Bulk, new Character("HUGE Woman", 2, 15, 5, 5, 5, 40));
        if(!b.activate())
            ded(Bulk);
        out("After landing a final blow,\n"
                + "you SMASH the woman into the city below.\n"
                + "All this aerial combat has raised you to:\n"
                + "HUGE Level XL!\n");
        pause(2);
        Bulk.exp = Bulk.expToLevel(Bulk.level+1);
        out("The HUGE Woman lies in a crater below, you should probably\n"
                + "aim for that.\n");
        sleep(500);
        out("The city shakes with the force of HUGE against HUGE!\n\n");
        sleep(500);
        out("Boss Defeated:\n");
        sleep(500);
        out("\tXP: HUGE\n");
        pause(2);
        
        out("She speaks again:\n"
                + "\t'Surely you are the MOST HUGE of us now.\n"
                + "\tPerhaps now you can defeat our master, THE HUGEST'\n"
                + "'Surely she jests', you think. 'There is no one HUGER than I'\n"
                + "\t'Train well, nameless one.\n"
                + "\tHe awaits you, at the FACILITY'\n"
                + "'Where's that?'\n"
                + "\t'Honestly?\n"
                + "\tIt's the HUGE BUILDING, the one with HUGE FACILITY\n"
                + "\twritten on it in HUGE LETTERS'\n"
                + "'Oh yeah, how did I miss that?'"
                + "\t'Its good that you did not swallow all of the PILLZ,\n"
                + "\tyou should use them in a time of need'\n");
        pause(2);
        M4(Bulk);
    }
    public static void M4(Character Bulk) // TODO
    {
        
    }
    public static void M5_1(Character Bulk)
    {
        out("As you walk, you see a flash of black across the street\n" // Technically 4
                + "What to do?\n"
                + "1. Keep going\n"
                + "2. Turn back\n"
                + "3. Wait\n");
        switch(menu())
        {
            case 1:
                M5_2(Bulk);
            case 2:
                out("You wisely turn back\n"
                        + "Dang psychic spies, you can never be too careful\n"); // That's 5
                M4(Bulk);
                break;
            case 3:
                Wait(Bulk);
                break;
            default:
                out("Invalid Input\n");
                M5_1(Bulk);
                break;
        }
    }
    public static void M5_2(Character Bulk)
    {
        out("As you walk, you see a group of GIRLS\n" // 6
                + "with red, white, black, and yellow themes.\n"
                + "The small red one speaks up:\n"
                + "'Your crimes against humanity make you an enemy of\n"
                + "the kingdom of Vale!\n\n"
                + "Justice will be be swift!\n" // It's a specific scene, so I'm gonna count that as 7
                + "Justice will be painful!\n"); /* It will be DELICIOUS!!!*/
        pause(2);
        out("You prepare your HUGE for battle as they draw their weapons and attack.\n");
        sleep(500);
        System.out.print(".");
        sleep(500);
        System.out.print(".");
        sleep(500);
        System.out.print(".");
        out("Yeah, you don't even get a battle screen for this.\n"
                + "their power level is waaay over yours.\n\n"
                + "Rekt.\n\n");
        ded(Bulk);
    }
    public static void M6(Character Bulk)
    {
        out("You are standing at the foot of the FACILITY,\n"
                + "it really is HUGE.\n"
                + "Again, you question how you never noticed this before,"
                + "its literally the size of a small moon.\n\n"
                + "Aaanyway, all you have to do is fight your way to the top,\n"
                + "kill all the people, find the HUGEST\n"
                + "and put to rest all those crazy notions of a HUGER one than you.\n\n");
        pause(2);
        out("As you mull over the finer points of infiltrating a skyscraper\n"
                + "a HUGE arm bursts out of the tower and snatches a few planes.\n"
                + "Oh. Well.\n"
                + "It's probably all perspective, right?"
                + "Those planes he grabbed were probably just birds."
                + "Let's get a better look.\n");
        pause(2);
        out("Well crap, it looks like he's about a mile tall.\n"
                + "Looks like HUGE XXL wasn't HUGE enough.\n"
                + "This guy is XXXL!\n"
                + "What do I do??\n"
                + "1. RUN!!\n"
                + "2. Confusedly work out\n"
                + "3. Eat buildings\n"
                + "4. Enter the FACILITY\n"
                + "5. Wait\n");
        switch(menu())
        {
            case 1:
                out("You run as fast as your MASSIVE FRAME allows you,\n"
                        + "but it isn't fast enough\n"
                        + "as the glory of the HUGEST's moustache is enough to\n"
                        + "erase you and the rest of the world from existence.\n");
                ded(Bulk);
                break;
            case 2: // Same as Case 3                
            case 3:
                out("You run over to the nearest building and punch it over,\n"
                        + "catching it as it falls and bench pressing it as you do so.\n"
                        + "Finally, you toss the building into the air and catch\n"
                        + "it with your digestive tract.\n\n"
                        + "R.I.P. building\n\n");
                pause(2);
                out("As you continue to rampage across the city, eating buildings\n"
                        + "and working out at the same time,\n"
                        + "the HUGEST manages to work his way out of the FACILITY,"
                        + "knocking it over in the process.\n");
                pause(2);
                out("The city is basically destroyed.\n"
                        + "I mean, a tower the size of a continent just fell on it.\n"
                        + "Oh well.\n"
                        + "You yell out to the HUGEST,\n"
                        + "\t'I won't let you hurt any more of these people!'\n"
                        + "which is kind of ironic... you know\n");
                pause(2);
                out("The HUGEST yells out,\n"
                        + "\t'I SEE YOU HAVE GROWN HUGE, SUBJECT TEN'\n"
                        + "Wow, even his words are HUGE.\n"
                        + "'AT LAST, YOU HAVE RETURNED;\n"
                        + "MY SON!\n\n"); // CAPPPPS LOCK!!
                pause(2);
                M8(Bulk);
                break;                
            case 4:
                out("You go to enter the FACILITY, but as you approach the door,\n"
                        + "the builidng topples onto you.\n\n"
                        + "What did you think would happen?\n"
                        + "I mean, this giant guy punches a hole in the wall,\n"
                        + "then starts coming out of it, and you expect\n"
                        + "the GIANT BUILDING to stay standing??\n");
                ded(Bulk);
                break;
            case 5:
                Wait(Bulk);
                break;
            default:
                out("Invalid Input");
                M6(Bulk);
                break;
        }
    }
    public static void M7(Character Bulk) // TODO (Facility), actually maybe not. Time will tell
    {
        
    }
    public static void M8(Character Bulk)
    {
        Battle b = new Battle(Bulk, new Character("HUGEST", 4, 61, 36, 36, 36, 45));
                out("WELL, I MEAN, I THINK YOU WERE ADOPTED OR SOMETHING.\n"
                        + "Anyway, LETS FIGHT!!! (queue boss music)\n");
                while(true)
                {
                    out("What do you want to do?\n"
                            + "1. Fight head on\n"
                            + "2. Jump up and introduce your HUGE FIST to\n"
                            + "\this HUGE TEETH\n"
                            + "3. Wait\n");
                    switch(menu())
                    {
                        case 1: // Your funeral
                            if(!b.activate())
                                ded(Bulk);
                            break;
                        case 2:
                            out("Great idea!\n");
                            pause(2);
                            out("As you leap into the air, poised to strike,\n"
                                    + "you meet the HUGEST's fist with a thump and you\n"
                                    + "quickly smash back into the ground.\n"
                                    + "Ouch.\n"
                                    + "Maybe that wasn't such a good idea.\n");
                            while(true)
                            {
                                out("What now?\n"
                                        + "1. Fight head on\n"
                                        + "2. Climb his arm and beat him up\n"
                                        + "3. Wait\n");
                                switch(menu())
                                {
                                    case 1: // Your funeral
                                        if(!b.activate())
                                            ded(Bulk);
                                        break;
                                    case 2:
                                        out("You climb up one of the HUGEST's massive arms,\n"
                                                + "every mole and wart becoming painfully clear.\n"
                                                + "\t'You really need to go see a dermatologist'\n"
                                                + "you yell as the HUGEST tries and fails to swat you off.\n"
                                                + "When you reach his face, you have to shield your eyes\n"
                                                + "from the sheer glory of his moustache.\n");
                                        pause(2);
                                        out("Punching him on the face seems to be completely ineffective\n"
                                                + "other than the fact that the HUGEST keeps slapping himself\n"
                                                + "while trying to hit you.\n");
                                        while(true)
                                        {
                                            out("Hwhat now?\n"
                                                    + "1. Keep going!\n"
                                                    + "2. Try alternate methods\n"
                                                    + "3. Wait\n");
                                            switch(menu())
                                            {
                                                case 2:
                                                    out("You try for something different,\n"
                                                            + "jumping inside the HUGEST's nostril\n"
                                                            + "and going deeper, chuggin' the rest of the PILLZ\n"
                                                            + "as you go\n");
                                                    pause(2);
                                                    out("Once inside, you find that you are sorely dissapointed.\n"
                                                            + "The HUGEST's brain is no bigger than your FIST\n");
                                                    while(true)
                                                    {
                                                        out("What now?"
                                                                + "1. Eat it\n"
                                                                + "2. Wait\n");
                                                        switch(menu())
                                                        {
                                                            case 1:
                                                                out("I hear it tastes just like eggs.\n"
                                                                        + "As you take a HUGE bite, you hear the HUGEST begin to\n"
                                                                        + "derp massively."
                                                                        + "When you lean in for another bite, you feel the PILLZ\n"
                                                                        + "take effect and through some combination of the\n"
                                                                        + "PILLZ and cannibalism, you vomit inside the HUGEST's skull,\n"
                                                                        + "propelling yourself out in the process.\n"
                                                                        + "In the air, you feel yourself begin to change...\n");
                                                                sleep(250);
                                                                out("I've become...\n");
                                                                sleep(250);
                                                                out("I've become...!\n");
                                                                sleep(250);
                                                                out("Final Form: SUPA KAWAII!\n");
                                                                M9(Bulk);
                                                                break;
                                                            case 2:
                                                                out("You wait.\n"
                                                                        + "Finally, the PILLZ take effect and you feel yourself\n"
                                                                        + "about to puke.\n"
                                                                        + "You aim yourself toward the exit, and hurl violently,\n"
                                                                        + "forcing yourself out of the Hugest's skull and into his\n"
                                                                        + "waiting hand, where you are immediately crushed.\n");
                                                                ded(Bulk);
                                                                break;
                                                        }
                                                        out("Invalid Input\n");
                                                    }
                                                case 1: // basically the same as 3
                                                    out("You keep trying to beat the HUGEST up,\n"
                                                            + "which is clearly doing nothing.\n");
                                                case 3:
                                                    out("You end up waiting,\n"
                                                            + "and the HUGEST finally manages to land a hit\n"
                                                            + "on you, destroying your everything.\n");
                                                    ded(Bulk);
                                                    break;
                                            }
                                            out("Invalid Input");
                                        }
                                    case 3:
                                        out("You're in the middle of a battle with someone who could\n"
                                                + "stand up to Tengen Toppa Gurren Lagann.\n"
                                                + "Why in the world would you wait??\n");
                                        pause(2);
                                        out("The HUGEST's FIST mashes you into the ground\n");
                                        ded(Bulk);
                                        break;
                                }
                                out("Invalid Input\n");
                            }
                        case 3:
                            out("You're in the middle of a battle with someone who could\n"
                                    + "stand up to Tengen Toppa Gurren Lagann.\n"
                                    + "Why in the world would you wait??\n");
                            pause(2);
                            out("The HUGEST's FIST mashes you into the ground\n");
                            ded(Bulk);
                            break;
                    }
                    out("Invalid Input\n");
                }
    }
    public static void M9(Character Bulk) // TODO (Heavens)
    {
        out("The former HUGEST yips at year heels, like a tiny dog.\n"
                + "He is no longer a threat, a blithering remnant of his former self.\n"
                + "It take a mere kick to send him through the moon and into the SUN\n"
                + "at near the SPEED OF LIGHT,\n\n"
                + "for you have BECOME HUGE,\n"
                + "the PERFECT HUGE.\n");
        pause(2);
        out("You no problem consuming the entire Earth, then other planets.\n"
                + "Soon, only STARS can sate your hunger.\n"
                + "As days pass, you gain the knowledge of billions of civilizations,\n"
                + "all consumed by your HUGE.\n"
                + "As you are now capable of consuming whole GALAXIES,\n"
                + "you realize that you are the HUGE that the HUGE WOMAN\n"
                + "from so long ago spoke of,\n"
                + "the HUGE that would PIERCE THE HEAVENS.\n");
        pause(2);
        out("CONGRATURASHUNZ\n\n"
                + "ATROCITIES: " + a + "/10\n"
                + "SOCKS SAVED: " + s + "/2\n"
                + "HUGE XP: " + Bulk.exp + "/" + Bulk.expToLevel(Bulk.level) + "\n\n"
                + "TURNS TAKEN: " + turncounter + "\n"
                + "YOU WINZ\n");
    }
}
