import java.util.ArrayList;

public class Game {

    private ArrayList<Room> rooms;
    private ArrayList<iPlayer> players;

    public Game(ArrayList<Room> rooms, ArrayList<iPlayer> players) {
        this.rooms = rooms;
        this.players = players;
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public ArrayList<iPlayer> getPlayers() {
        return this.players;
    }
}
