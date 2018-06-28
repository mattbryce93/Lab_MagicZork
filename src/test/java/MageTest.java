import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MageTest {

    Mage mage1;
    Mage mage2;
    Spell move1;
    Spell move2;
    iCreature creature1;
    iCreature creature2;
    ArrayList<Move> moves;
    ArrayList<iCreature> creatures;

    @Before
    public void setUp() throws Exception {
        moves = new ArrayList<Move>();
        move1 = new Spell("Fireblast", 20);
        move2 = new Spell("Bolt", 5);
        moves.add(move1);
        moves.add(move2);
        creature1 = new Dragon("Smaug", 100, moves);
        creature2 = new Dragon("Wun-Wun", 100, moves);
        creatures = new ArrayList<iCreature>();
        creatures.add(creature1);
        creatures.add(creature2);
        mage1 = new Mage("Gandalf", 100, 50, moves, creatures);
        mage2 = new Mage("Saroman", 80, 100, moves, creatures);
    }

    @Test
    public void canAttack() {
        mage1.attack(mage2);
        assertEquals(60, mage2.getHealth());
    }

    @Test
    public void hasCreatures() {
        assertEquals(2, mage1.getCreatures().size());
    }

    @Test
    public void canAttackWithCreature() {
        mage1.attackWithCreature(mage2, creature1);
        assertEquals(60, mage2.getHealth());
    }
}
