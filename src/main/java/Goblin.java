import java.util.ArrayList;

public class Goblin extends Sprite implements iEnemies {
    public Goblin(String name, int balance, ArrayList<Move> moves) {
        super(name, 60, balance, moves);
    }
}
