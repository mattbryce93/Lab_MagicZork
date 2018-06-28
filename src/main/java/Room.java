import java.util.ArrayList;

public class Room {

    private ArrayList<iPlayer> players;
    private ArrayList<iEnemies> enemies;
    private int treasure;

    public Room(ArrayList<iPlayer> players, ArrayList<iEnemies> enemies, int treasure) {
        this.players = players;
        this.enemies = enemies;
        this.treasure = treasure;
    }

    public ArrayList<iPlayer> getPlayers() {
        return this.players;
    }

    public ArrayList<iEnemies> getEnemies() {
        return this.enemies;
    }

    public int getTreasure() {
        return this.treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }
}
