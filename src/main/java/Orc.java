import java.util.ArrayList;

    public class Orc extends Sprite implements iEnemies {

    public Orc(String name, int balance, ArrayList<Move> moves) {
        super(name, 100, balance, moves);
    }
}
