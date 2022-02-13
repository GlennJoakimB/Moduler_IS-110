/**
 * Player has a bag of potions, and a bow.
 * The bow requires arrows, held in a quiver-object.
 * The bow is also hevy to pull back, so it depletes some stamina each use.
 *
 * @author (Glenn Joakim)
 * @version (13/02/2022)
 */
public class Player
{
    private Potion[] bag;
    private Quiver quiv;
    private int hp;
    private int sp;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        // initialise instance variables
        bag = new Potion[20];
        hp = 100;
        sp = 100;
        quiv = new Quiver();
    }

    /**
     * Shoot an arrow 
     */
    public void ShootArrow(Target t)
    {
        if(sp >= 20) {
            if(quiv.GetArrowNumb() > 0) {
                sp = sp - 20;
                quiv.ShootA();
                t.GetHit();
            } else {
                System.out.println("Out of arrows");
            }
        } else {
            System.out.println("Out of stamina");
        }
    }
    
    public void fillQuiv(int x)
    {
        quiv.Fill(x);
    }
    
    public void GetAtked(int dmg)
    {
        hp = hp - dmg;
        if(hp <= 0)
            System.out.println("Player is dead");
    }
    
    /**
     * Choose "HP" to heal, or "SP" to recover stamina.
     */
    public void UsePotion(String item)
    {
        int i = 0;
        boolean used = false;
        while(!used && i < bag.length) {
            if(bag[i] != null) {
                Potion p = bag[i];
                if(item == "HP" && p.GetName().equals("HP_potion")) {
                    hp = hp + p.GetValue();
                    bag[i] = null;
                    used = true;
                }
                if(item == "SP" && p.GetName().equals("SP_potion")) {
                    sp = sp + p.GetValue();
                    bag[i] = null;
                    used = true;
                }
            }
            //Avslutt med
            i++;
        }
    }
    
    public void FillBag(String name, int x)
    {
        int y = 0; //for å telle antall ganger baggen fylles.
        for(int i = 0; i < bag.length; i++)
        {
            if(y < x && bag[i] == null) {
                //For hver i (index), legg til Potion name x antall ganger.
                bag[i] = new Potion(name, 50);
                y++;
            }
        }
        
    }
    
    public void ListBag()
    {
        int count = 0;
        for(Potion item : bag) {
            if(item != null) {
                System.out.println(item.GetName()+","+item.GetValue());
            } else {
                count++;
            }
        }
        System.out.println(count == bag.length ? "Bag is empty." : "");
    }
}
