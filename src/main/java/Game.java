import java.lang.reflect.Array;
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

    public ArrayList<Sprite> getWounded(){
        ArrayList<Sprite> wounded = new ArrayList<Sprite>();
        for (iPlayer player : players){
            if(((Sprite) player).checkHealth()){
                wounded.add((Sprite) player);
            }
        }
        return wounded;
    }

    public void takeTurn(){

        // loop through each room
        for(Room room : rooms){
            //if room has any enemies continue to attack
            if (room.getEnemies().size() > 0){
                //loop through player turns
                for (iPlayer player : players) {

                    //check players health and remove anyone that has died
                    if (((Sprite) player).getHealth() <= 0) {
                        players.remove(player);

                        //if player hasn't died let them attack the rooms enemy
                    } else {

                        if (player instanceof Mage){
                            ((Mage) player).attackWithCreature((Sprite) room.getEnemies().get(0), ((Mage) player).getCreatures().get(0));
                        } else {
                            ((Sprite) player).attack((Sprite) room.getEnemies().get(0));
                        }
                        //check the enemies health if health is 0
                        if (((Sprite) room.getEnemies().get(0)).getHealth() <= 0) {

                            //give enemies treasure to the player that killed them
                            ((Sprite) player).changeBalance(((Sprite) room.getEnemies().get(0)).emptyBalance());

                            //remove dead enemy
                            room.getEnemies().remove(0);
                        } else {

                            //if enemy didn't die, attack the player that just hit them
                            ((Sprite) room.getEnemies().get(0)).attack((Sprite) player);
                        }

                        //allow player to heal any wounded player if a healer
                    } if (player instanceof Healer) {
                        if (getWounded().size() > 0 ){
                            ((Healer) player).heal(getWounded().get(0));
                        }
                    }

                    //if no enemies present divvy up the rooms treasure
            } for (iPlayer player : players) {
                ((Sprite) player).changeBalance(room.getTreasure()/players.size());
                }
                room.setTreasure(0);
            }
        }
    }
}
