/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes.ladders;

import java.util.Random;

/**
 *
 * @author k00225361
 */
public class PlayGame {

    Grid g1 = new Grid();
    
    Players player1 = new Players(); //Instance of the object.
    Players player2 = new Players();
    boolean isPlayer1;
    boolean winner = false;
    boolean inBounds;

    public void playGame() //Prints grid then lets players roll their dice while no one has fun.
    {
        g1.viewGrid(g1.empty, g1.shrek, g1.donkey);

        while (winner != true) {
            player1.movePlayer(player1.playerRoll());
            player2.movePlayer(player2.playerRoll());

            if (inBound(player1.position)) 
            {
                if (inBound(player1.position) == true) 
                {
                    System.out.println(player1.name + " wins");
                    System.out.println("Counter: " + player1.counter);
                    winner = true;
                }
            }
            
            else if (inBound(player2.position)) 
            {
                if (inBound(player2.position) == true) 
                {
                    System.out.println(player1.name + " wins");
                    System.out.println("Counter: " + player1.counter);
                    winner = true;
                }
            }
            
            //If the player has not passed the end of the grid then roll the dice.
            else 
            {
               
                checkSpace(player1.position,true);
                checkSpace(player2.position,false);
                
            }//End else
        }//End of while.
    }//End of playGame.
    
    public void checkSpace(int position,boolean isPlayer1) //Checks if a player wins or if they land on one of the items.
    {
        Random rand = new Random();
        char d = g1.gridSize[position].charAt(0);
        int x = rand.nextInt(2) + 6;

        switch (d) {
            case 'S':
                    if(isPlayer1 = true)
                    {
                        x = x * 2;
                        position = position + x;
                        player1.score += player1.score + player1.playerDice * 2;
                        System.out.println(player1.name + " hit a shrek.You've moved an extra " + x + " space.");
                        System.out.println("\n");
                    }
                    else
                    {
                        x = x * 2;
                        position = position + x;
                        player2.score += player2.score + player2.playerDice * 2;
                        System.out.println(player2.name + " hit a shrek.You've moved an extra " + x + " space.");
                        System.out.println("\n");      
                    }
                break;
            case 'D':
                    if(isPlayer1 = true)
                    {
                        position = position - x;
                        player1.score += player1.score - player1.playerDice * 2;
                        System.out.println(player1.name + " hit a shrek.You've been pushed back " + x + " space.");
                        System.out.println("\n");
                    }
                    else
                    {
                        position = position - x;
                        player2.score += player2.score - player2.playerDice*2;
                        System.out.println(player1.name + " hit a shrek.You've been pushed back " + x + " space.");
                        System.out.println("\n");
                    }
                break;
            case 'F':
                    if(isPlayer1 == true)
                    {
                        System.out.println(player1.name + " found the princess you win.");    
                    }
                    else
                    {
                        System.out.println(player2.name + " found the princess you win.");
                    }
                break;
            case 'P':
                if(isPlayer1 = true)
                {
                    System.out.println(player1.name + " engages Puss in Boot, he replies " + "Fight me if you dare...you lost.");
                    player1.position = 0;
                }
                else
                {
                    System.out.println(player2.name + " engages Puss in Boot, he replies " + "Fight me if you dare...you lost.");
                    player2.position = 0;
                }
                break;
            default:
        }//End of class.
    }//End of checkSpace method.

    private boolean inBound(int position) {
        if (position > g1.gridSize.length) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }//End of inBounds method.   
}//End of class.
