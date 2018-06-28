import java.util.ArrayList;

public class Mage extends Sprite implements iPlayer {

    private ArrayList<iCreature> creatures;

    public Mage(String name, int health, int balance, ArrayList<Move> moves, ArrayList<iCreature> creatures) {
        super(name, health, balance, moves);
        this.creatures = creatures;
    }

    public ArrayList<iCreature> getCreatures() {
        return this.creatures;
    }

    public void attackWithCreature(Sprite sprite, iCreature creature){
        ((Sprite)creature).attack(sprite);
    }

}
