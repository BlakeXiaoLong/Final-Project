package pkgfinal.project;
import java.util.Random;
public class Character
{
    String name;
    int level, hp, mhp, str, dex, con;
    double hr;
    long exp;
    Random rand = new Random();
    
    //Opponent constructor
    public Character(String name, int level, int mhp, int str, int dex, int con, double hr)
    {
        this.name = name;
        this.level = level;
        this.mhp = mhp;
        this.hp = mhp;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.hr = hr;
    }
    //Player constructor
    public Character()
    {
        this.name = "Bulk Squatthrust";
        this.level = 1;
        this.hp = rand.nextInt(16)+15;
        this.mhp = this.hp;
        this.str = rand.nextInt(5)+5;
        this.dex = rand.nextInt(5)+5;
        this.con = rand.nextInt(5)+5;
        this.exp = expToLevel(1);
        this.hr = rand.nextInt(5)+60;
    }
    
    /**
     *
     * @param level
     * @return
     */
    private long expToLevel(long level)
    {
        return (128*level*level);
    }
    
    public boolean levelUp()
    {
        if(this.exp > expToLevel(this.level+1))
        {
            //Level Up
            this.level++;
            switch(rand.nextInt(3)+1)
            {
                case 1:
                    this.str += 10;
                    this.dex += 7;
                    this.con += 7;
                    this.mhp += 10;
                    this.hp = this.mhp;
                    break;
                case 2:
                    this.str += 7;
                    this.dex += 10;
                    this.con += 7;
                    this.mhp += 10;
                    this.hp = this.mhp;
                    break;
                case 3:
                    this.str += 7;
                    this.dex += 7;
                    this.con += 10;
                    this.mhp += 10;
                    this.hp = this.mhp;
                    break;
                case 4:
                    this.str += 7;
                    this.dex += 7;
                    this.con += 7;
                    this.mhp += 15;
                    this.hp = this.mhp;
                    break;
                default:
                    break;
            }
            return true;
        }
        return false;
    }
    
    public long getExp(long level)
    {
        return expToLevel(level);
    }
}
