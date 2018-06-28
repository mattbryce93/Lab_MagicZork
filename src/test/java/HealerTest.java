import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Weapon weapon1;
    Weapon weapon2;
    ArrayList<Move> weapons;
    Healer healer1;
    Healer healer2;

    @Before
    public void setUp() throws Exception {
        weapon1 = new Weapon("biter", 20);
        weapon2 = new Weapon("sting", 50);
        weapons = new ArrayList<Move>();
        weapons.add(weapon1);
        weapons.add(weapon2);
        healer1 = new Healer("Gabriel", 100, 10, weapons, 50);
        healer2 = new Healer("Arwen", 120, 20, weapons, 60);
    }

    @Test
    public void canHeal() {
        //attack with 20
        healer2.attack(healer1);
        healer2.heal(healer1);
        //heal with 60 which is more than max
        //check that its 100
        assertEquals(100, healer1.getHealth());
    }
}
