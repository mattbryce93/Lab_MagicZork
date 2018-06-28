import java.util.ArrayList;

public class Troll extends Sprite implements iEnemies{

    public Troll(String name, int balance, ArrayList<Move> moves) {
        super(name, 500, balance, moves);
    }
}
