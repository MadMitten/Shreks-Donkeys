/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    int player1Dice;
    int player2Dice;
    String player1;
    Random rand = new Random();
        
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
        System.out.println("Player 1 press 1 to roll your dice");
        player1Dice = rand.nextInt(6)+ 1;
        System.out.println(getName() + " Rolled: " + player1Dice);
        return player1Dice;
    }
    
}//End of class.
