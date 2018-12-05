/*
 * Create player object that tracks player name and has two method.
 * playerName asks for the users name and strores it in name.
 *  playerRoll rolls a random number and 
 */
package snakes.ladders;
import java.util.Scanner;
import java.util.Random;
 
/**
 *
 * @author k00225361
 */
public class Players {
    String name;
    Scanner scan = new Scanner(System.in);   
    int playerDice;
    int rollChoice;
    int position;
    Random rand = new Random();
    int counter;
    
    Grid g1 = new Grid();
        
    public Players() {
       playerName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String playerName()
    {
        System.out.println("Enter name for Player: ");
        name = scan.nextLine();
        return  name;
    }
    
    public int playerRoll()
    {
        System.out.println(name + " press 1 to roll your dice");
        rollChoice = scan.nextInt();
        playerDice = rand.nextInt(90)+ 1;
        System.out.println(getName() + " Rolled: " + playerDice);
        counter++;
        return playerDice;
    }
    
    public int movePlayer(int playerDice)
    {
        position += playerDice;
        System.out.println(name + "position: " + position);
        return position;
    }
}//End of class.
