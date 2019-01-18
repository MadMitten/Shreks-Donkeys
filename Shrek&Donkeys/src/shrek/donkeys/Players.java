/*
 * Name:Jordan O'Loughlin & Elijah Omotosho
 * Date: 28/11/18
 * Function: Create player object that tracks player named,dice roll and movement.
 * playerName asks for the users name and strores it in name.
 * playerRoll rolls a random number and 
 */
package shrek.donkeys;

import java.util.Scanner;
import java.util.Random;

public class Players implements PlayerBehaviour
{
    String name;
    Scanner scan = new Scanner(System.in);
    int playerDice;
    int rollChoice;
    int position;
    Random rand = new Random();
    int counter;
    int score;
    int numberofRolls;

    //Encapsulation
    public int getCounter() 
    {
        return counter;
    }

    public void setCounter(int counter) 
    {
        this.counter = counter;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getNumberofRolls()
    {
        return numberofRolls;
    }

    public void setNumberofRolls(int numberofRolls)
    {
        this.numberofRolls = numberofRolls;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String playerName()
    {
        System.out.println("___________________________________");
        System.out.println("-----------------------------------");
        System.out.println("Enter name for Player: ");
        System.out.print("Input: ");
        name = scan.nextLine();
        System.out.println("-----------------------------------");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("\n");
        return name;
    }//End of playerName method.

    public int playerRoll() {
        System.out.println("___________________________________");
        System.out.println("-----------------------------------");
        System.out.println(name + " press 1 to roll your dice");
        System.out.print("Input: ");
        rollChoice = scan.nextInt();
        playerDice = rand.nextInt(6) + 1;
        System.out.println(getName() + " Rolled: " + playerDice);
        counter++;
        score++;
        return playerDice;
    }//End of playerRoll method.

    public int movePlayer(int playerDice) {
        position = position + playerDice;
        System.out.println(getName() + " position: " + position);
        System.out.println("-----------------------------------");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("\n");
        return position;
    }//End of movePlayer method.

    @Override
    public int movePlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//End of class.
