package pkgfinal.project;
public class Character
{
    private String name;
    private int level, hp, mhp, str, dex, con;
    double hr;
    private long exp;
    
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
        this.level = 0;
        this.hp = 0;
        this.mhp = 0;
        this.str = 0;
        this.dex = 0;
        this.con = 0;
        this.exp = 0;
        this.hr = 0;
        this.exp = 0;
    }
}
