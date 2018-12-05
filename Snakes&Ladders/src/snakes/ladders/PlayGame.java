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
    int holdingnumber1;
    boolean winner = false;
    

    public void playGame() //Prints grid then lets players roll their dice while no one has fun.
    { 
       g1.viewGrid(g1.empty, g1.shrek, g1.donkey);
       
       //If the player has not passed the end of the grid then roll the dice
       while(player1.position < 104 || player2.position < 104 || winner != true)
       {
        player1.movePlayer(player1.playerRoll());
        checkSpace(player1.position,true);
        
        player2.movePlayer(player2.playerRoll());
        checkSpace(player2.position,false);   
       }//End while.position
       
    }//End of playGame.

    private void checkSpace(int position,boolean isPlayer1) //Checks if a player wins or if they land on one of the items.
    {
        Random rand = new Random();
        char d = g1.gridSize[position].charAt(0);
        int x = rand.nextInt(2) + 6;
        
        if(player1.position > 104 )
        {
            System.out.println("Player 1 wins");
        }
        
        else if(player2.position > 104)
        {
            System.out.println("Player 2 wins");
        }      
        else
        {
            switch (d) 
            {
                case 'S':
                    x = x*2;  
                    if(isPlayer1 == true)
                    {
                        player1.position = player1.position + x;
                        System.out.println("Player 1 hit a shrek.You've moved an extra " + x + " space.");
                    }
                    else
                    {
                        player1.position = player1.position + x;
                        System.out.println("Player 2 hit a shrek.You've moved an extra " + x + " space.");
                    }    
                   break;
                case 'D':
                    if(isPlayer1 == true)
                    {
                        player1.position = player1.position - x;
                        System.out.println("Player 1 hit a shrek.You've been pushed back " + x + " space.");
                    }
                    else
                    {
                        player1.position = player1.position + -1;
                        System.out.println("Player 2 hit a shrek.You've been pushed back " + x + " space.");
                    }
                    
                   break;
                case 'F':  if(isPlayer1 == true)
                    {
                        System.out.println("You found the princess you win.");  
                        winner = true;
                    }
                    else
                    {
                        System.out.println("You found the princess you win.");  
                        winner = true;
                    }
                   break;
                case 'P':
                    if(isPlayer1 == true)
                    {
                        player1.position = 0;
                    }
                    else
                    {
                        player2.position = 0;
                    }
                    break;
                default:
            }//End of class.
        }//End of else.
    }//End of checkSpace method.
    

            
}//End of class.
