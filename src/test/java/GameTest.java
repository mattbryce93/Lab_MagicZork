import org.junit.Before;

import java.util.ArrayList;

public class GameTest {

    Game game;
    iPlayer player1;
    iPlayer player2;
    iPlayer player3;
    iPlayer player4;
    Room room1;
    Room room2;
    Room room3;
    Room room4;
    Room room5;
    iEnemies enemy1;
    iEnemies enemy2;
    iEnemies enemy3;
    iEnemies enemy4;
    iEnemies enemy5;
    iCreature creature1;
    iCreature creature2;
    Move weapon1;
    Move weapon2;
    Move weapon3;
    Move weapon4;
    Move weapon5;
    Move spell1;
    Move spell2;
    Move spell3;
    Move spell4;
    Move spell5;
    ArrayList<Move> spells;
    ArrayList<Move> weapons;
    ArrayList<iCreature> creatures;
    ArrayList<iEnemies> enemies1;
    ArrayList<iEnemies> enemies2;
    ArrayList<iEnemies> enemies3;
    ArrayList<iEnemies> enemies4;
    ArrayList<iEnemies> enemies5;
    ArrayList<Room> rooms;
    ArrayList<iPlayer> players;

    @Before
    public void setUp() throws Exception {
        creature1 = new Dragon("Smaug", 100, moves);
        creature2 = new Dragon("Wun-Wun", 100, moves);
        creatures = new ArrayList<iCreature>();
        creatures.add(creature1);
        creatures.add(creature2);

        weapon1 = new Weapon("club", 20);
        weapon2 = new Weapon("hammer", 50);
        weapon3 = new Weapon("sword", 30);
        weapon4 = new Weapon("dagger", 10);
        weapon5 = new Weapon("axe", 60);
        weapons = new ArrayList<Move>();
        weapons.add(weapon1);
        weapons.add(weapon2);
        weapons.add(weapon3);
        weapons.add(weapon4);
        weapons.add(weapon5);

        player1 = new Fighter("Conan", 100, 20, weapons, 50);
        player2 = new Fighter("Spartacus", 120, 10, weapons, 10);
        player3 = new Mage("Conan", 100, 20, weapons, creatures);
        player4 = new Healer("Spartacus", 120, 10, weapons, 10);

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        enemy1 = new Orc("Grog", 5, weapons);
        enemy2 = new Troll("Horse-eater", 10, weapons);
        enemy3 = new Orc("Grag", 5, weapons);
        enemy4 = new Goblin("Feasel", 2, weapons);
        enemy5 = new Goblin("Snatch", 2, weapons);

        enemies1 = new ArrayList<iEnemies>();
        enemies2 = new ArrayList<iEnemies>();
        enemies3 = new ArrayList<iEnemies>();
        enemies4 = new ArrayList<iEnemies>();
        enemies5 = new ArrayList<iEnemies>();

        enemies1.add(enemy1);
        enemies2.add(enemy2);
        enemies3.add(enemy3);
        enemies4.add(enemy4);
        enemies5.add(enemy5);

        room1 = new Room(players, enemies1, 100);
        room2 = new Room(players, enemies2, 100);
        room3 = new Room(players, enemies3, 100);
        room4 = new Room(players, enemies4, 100);
        room5 = new Room(players, enemies5, 100);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);

        game = new Game(rooms, players);
        
    }
}
