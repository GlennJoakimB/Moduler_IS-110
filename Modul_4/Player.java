import java.util.ArrayList;
import java.util.Iterator;
/**
 * Player has a bag of potions, and a bow.
 * The bow requires arrows, held in a quiver-object.
 * The bow is also hevy to pull back, so it depletes some stamina each use.
 *
 * @author (Glenn Joakim)
 * @version (11/02/2022)
 */
public class Player
{
    private ArrayList<Potion> bag;
    private Quiver quiv;
    private int hp;
    private int sp;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        // initialise instance variables
        bag = new ArrayList<>();
        hp = 100;
        sp = 100;
        quiv = new Quiver();
    }

    /**
     * Shoot an arrow 
     */
    public void ShootArrow(Target t)
    {
        if(sp > 20) {
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
        //
        if(bag.size() > 0) {
            boolean used = false;
            Iterator<Potion> it = bag.iterator();
            while(!used && it.hasNext()) {
                Potion p = it.next();
                String ptitle = p.GetName();
                if(item == "HP" && ptitle.equals("HP_potion")) {
                    hp = hp + p.GetValue();
                    it.remove();
                    used = true;
                }
                if(item == "SP" && ptitle.equals("SP_potion")) {
                    sp = sp + p.GetValue();
                    it.remove();
                    used = true;
                }
            }
        }
    }
    
    public void FillBag(String name, int x)
    {
        //
        for(int i = 0; i < x; i++)
        {
            bag.add(new Potion(name, 50));
        }
    }
    
    public void ListBag()
    {
        //
        if(bag.size() > 0) {
            for(Potion item : bag) {
                System.out.println(item.GetName()+","+item.GetValue());
            }
        }
    }
}
