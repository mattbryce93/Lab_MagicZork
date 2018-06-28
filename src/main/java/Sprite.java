import java.util.ArrayList;

public abstract class Sprite {

    private String name;
    private int health;
    private int maxHealth;
    private int balance;
    private ArrayList<Move> moves;
    private Move currentMove;

    public Sprite(String name, int health, int balance, ArrayList<Move> moves) {
        this.name = name;
        this.health = health;
        this.balance = balance;
        this.moves = moves;
        this.currentMove = this.moves.get(0);
        this.maxHealth = this.health;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getBalance() {
        return this.balance;
    }

    public ArrayList<Move> getMoves() {
        return this.moves;
    }

    public void addHealth(int value){
        this.health += value;
    }

    public void removeHealth(int value){
        this.health -= value;
    }

    public boolean checkHealth(){
        if(this.health < this.maxHealth){
            return true;
        }
        return false;
    }

    public void changeBalance(int value){
        this.balance += value;
    }

    public int emptyBalance(){
        int amount = this.balance;
        this.balance = 0;
        return amount;
    }

    public Move getCurrentMove(){
        return this.currentMove;
    }

    public void attack(Sprite sprite) {
        sprite.removeHealth(getCurrentMove().getAttackValue());
    }

    public int getMaxHealth(){
        return this.maxHealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
