import java.util.ArrayList;

public class Dragon extends Sprite implements iCreature {

    public Dragon(String name, int health, ArrayList<Move> moves) {
        super(name, health, 0, moves);
    }
}
