/*
 * Name:Jordan O'Loughlin & Elijah Omotosho
 * Date: 28/11/18
 * Function: Run game
 */
package snakes.ladders;

import java.util.*;

/**
 *
 * @author k00225361
 */
public class PlayGame {
    
     //Instance of the object
    Grid g1 = new Grid();
    
    //Aggregation & composition. Game has a players but players dont have a game.
    Players player1 = new Players();
    Players player2 = new Players();
    
    boolean isPlayer1; // Used in the checkSpace method to see if the player is player 1 or 2.
    boolean winner = false; //Used to tell when the game has ended.
    boolean inBounds;

    public void playGame() //Prints grid then lets players roll their dice while no one has fun.
    {
        g1.viewGrid(g1.shrek, g1.empty, g1.donkey,g1.puss); //Creates a grid for the players to see.
        
        //Uses the playername method to ask both players for their name.
        player1.playerName();
        player2.playerName();
        
        //Both players roll dice and after the game checks if they not exceeded the grid then it check if they landed on one of the 4 characters.
        //Repeats till someone wins.a
        while (winner != true) {
            player1.movePlayer(player1.playerRoll());
            player2.movePlayer(player2.playerRoll());
            
            //Passes the player position into inBounds to see if they have exceeded.
            //If they do then they win.
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
            
            //If the player has not passed the end of the grid then check their position
            else 
            {
                checkSpace(player1.position,true); // Pass in through true to show it is player 1.
                checkSpace(player2.position,false);
                
            }//End else
        }//End of while.\
        if (winner == true) {
            Scanner sc = new Scanner(System.in);
            WinnerRevealed(sc);
        }
    }//End of playGame.
    
    public void checkSpace(int position,boolean isPlayer1) //Checks if a player wins or if they land on one of the items.
    {
        Random rand1 = new Random();
        
        //Is used to located a position in the array and get its first char so we can compare it with a switch statement.
        char d = g1.gridSize[position].charAt(0); 
        int x = rand1.nextInt(2) + 6;// Used for increment or decrement the player position.

        switch (d) {
            case 'S':
                    if(isPlayer1 = true)
                    {
                        x = x * 2;
                        player1.position = player1.position + x;
                        player1.score += player1.score + 20;
                        System.out.println(player1.name + " hit a shrek.You've moved an extra " + x + " space.");
                        System.out.println("\n");
                    }
                    else
                    {
                        x = x * 2;
                        player2.position = player2.position + x;
                        player2.score += player2.score + 20;
                        System.out.println(player2.name + " hit a shrek.You've moved an extra " + x + " space.");
                        System.out.println("\n");      
                    }
                break;
            case 'D':
                    if(isPlayer1 = true)
                    {
                        player1.position = player1.position - x;
                        player1.score += player1.score - 25;
                        System.out.println(player1.name + " hit a shrek.You've been pushed back " + x + " space.");
                        System.out.println("\n");
                    }
                    else
                    {
                       player2.position = player2.position - x;
                        player2.score += player2.score -25;
                        System.out.println(player1.name + " hit a shrek.You've been pushed back " + x + " space.");
                        System.out.println("\n");
                    }
                break;
            case 'F':
                    if(isPlayer1 == true)
                    {
                        System.out.println(player1.name + " found the princess you win."); 
                        player1.score += player1.score -+ 250;
                        winner = true;
                    }
                    else
                    {
                        System.out.println(player2.name + " found the princess you win.");
                        player2.score += player1.score - 250;
                        winner = true;
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
    
    //Ensures that if the plyer postion exceeds the grid that it will not throw an exception
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
    
    //Enums
     public enum Decision{
        y,yes,n,no;
        
        public static Decision getDecision(String decision){
            for(Decision d : values()){
                if(d.name().equalsIgnoreCase(decision)){
                    return d;
                }
            }//end of for
            return null;
        }//end of getDecision
    }//end of enum
    
    private void WinnerRevealed(Scanner sc) {
         Analytics a = new Analytics();
        System.out.println("____________________________________________________________________");
        System.out.println("--------------------------------------------------------------------");
         
        System.out.println("press a number to continue ");
        int i = Integer.parseInt(sc.nextLine()); //to help avoid doing next int the next line
        System.out.println("Do you want to see the Stats of the the game? 'y'/'yes' or 'n'/'no'");
        System.out.print("Input: ");
        Decision decision = Decision.getDecision(sc.nextLine());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        
        
        while(decision == null){
            System.out.println("____________________________________________________________________");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Invalid Entry");
            System.out.println("Do you want to see the Stats of the the game? 'y'/'yes' or 'n'/'no' ");
            System.out.print("Input: ");
            decision = Decision.getDecision(sc.nextLine());
            System.out.println("--------------------------------------------------------------------");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        }//end of while
        
        switch(decision){
            case y:
            case yes:
                System.out.println("___________________________________________________________________");
                System.out.println("-------------------------------------------------------------------");
                System.out.println("You have have choosen 'y'/'yes' press 1 to continue");
                System.out.print("Input: ");
                int x = sc.nextInt();
                System.out.println("-------------------------------------------------------------------");
                System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");


                if(x == 1){
                    System.out.println("____________________________________________________________");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("----------------------Welcome to Stats----------------------");
                    a.Stats();
                }//end of if

            break;

            case n:
            case no:
                 System.out.println("You have have choosen 'n'/'no' press 1 to continue");
                 int z = sc.nextInt();
            break;
            default:
                System.out.println("Invalid Entry");
            break;

        }//end of switch

    }//Winner Revealed 
        
}//End of class.
