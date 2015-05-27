/*
 * Andrew Jimenez
 * Mr. Swagbanks
 * Battle.h (close enough)
 * Implements all the features for combat
 */
package pkgfinal.project;
import java.util.Random;
/**
 *
 * @author Andrew Jimenez
 */
public class Battle
{
    private Character player, creature;
    private Boolean playerTurn = null;
    Random rand = new Random();
    public Battle(Character player, Character creature)
    {
        this.player = player;
        this.creature = creature;
    }
    
    @SuppressWarnings("empty-statement")
    public Boolean activate()
    {
        playerTurn = (player.dex > creature.dex);
        while(player.hp > 0 && creature.hp > 0)
        {
            aT(player, creature, playerTurn);
            playerTurn = !playerTurn;
        }
        if(player.hp <= 0)
        {
            FinalProject.out(creature.name + " is victorious!\n");
            FinalProject.pause(2);
            return false;
        }
        else if(creature.hp <= 0)
        {
            FinalProject.out(player.name + " is victorious!\n");            
            FinalProject.pause(2);
            player.exp+=(creature.getExp(creature.level)/6);
            while(player.levelUp());
            return true;
        }
        FinalProject.out("Something messed up\n"
                + "Error 2\n");
        System.exit(2);
        return false;
    }
    public void aT(Character a, Character b, Boolean turn)
    {
        if(turn)
        {
            FinalProject.out("What will you do?\n"
                    + "1. Attack\n"
                    + "2. Defend\n");
            switch(FinalProject.menu())
            {
                case 1:
                    attack(a, b);
                    break;
                case 2:
                    break;
                default:
                    FinalProject.out("Invalid Input\n");
                    aT(a, b, turn);
                    break;
            }
        }
        else
            attack(b, a);
    }
    public void attack(Character a, Character b)
    {
        int damage = a.str/2;
        double hitRate = a.hr;
        FinalProject.out(a.name + " attacks!\n");
        FinalProject.sleep(250);        
        if(rand.nextInt(99)+1 < (10 + hitRate - b.dex))
        {
            FinalProject.out(a.name + " strikes!\n");
            b.hp -= damage;
        }
        else
            FinalProject.out(a.name + " misses!\n");
        FinalProject.sleep(250);
    }
}