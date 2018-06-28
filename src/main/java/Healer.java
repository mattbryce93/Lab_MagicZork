import java.util.ArrayList;

public class Healer extends Sprite implements iPlayer {

    private int healValue;

    public Healer(String name, int health, int balance, ArrayList<Move> moves, int healValue) {
        super(name, health, balance, moves);
        this.healValue = healValue;
    }

    public void heal(Sprite sprite){

        if(sprite.getHealth() + this.healValue >= sprite.getMaxHealth()){
            sprite.setHealth(sprite.getMaxHealth());
        } else {
            sprite.addHealth(this.healValue);
        }

    }

}
