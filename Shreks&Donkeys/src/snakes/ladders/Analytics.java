/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes.ladders;

/**
 *
 * @author k00225361
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 *
 * @author k00225361
 */
//Inheritance
public class Analytics extends Players{
    PlayGame p1 = new PlayGame();
    PlayGame p2 = new PlayGame();
    
    void Stats()throws FileNotFoundException{
        System.out.println("------------------------------------------------------------");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                    
        String Player1Name = p1.player1.getName();
        String Player2Name = p2.player2.getName();
        int Player1Score = p1.player1.getScore();
        int Player2Score = p2.player2.score;
        int Player1DiceRolls = p1.player1.numberofRolls;
        int Player2DiceRolls = p2.player2.numberofRolls;
        int Rounds = (p1.player1.counter + p2.player2.counter)/2;
        String winner = null;
        
        if(Player1Score > Player2Score){
            winner = "Player 1 - " + Player1Name + " is the Winner interms of Score";
        }
        else if(Player1Score < Player2Score){
            winner = "Player 2 - " + Player2Name + " is the Winner interms of Score";
        }
        
        String outputfileName = "Stats.txt";
        String inputText;
        
        PrintWriter out = new PrintWriter(outputfileName);
        
           inputText = 
           "------------------------------------------------------------" + "\n" +
           "- Player_One_Name: " + Player1Name + "\n" +
           "- Player_One_Score: " + Player1Score + "\n" +
           "- Player_One_Number_of_Dice_Rolls: " + Player1DiceRolls + "\n" +
           "------------------------------------------------------------" + "\n" +
           "- Player_Two_Name: " + Player2Name + "\n" + 
           "- Player_Two_Score: " + Player2Score + "\n" +
           "- Player_Two_Number_of_Dice_Rolls: " + Player2DiceRolls + "\n" +
           "------------------------------------------------------------" + "\n" +
           "- Amount_of_Rounds: " + Rounds + "\n" +
           "- Winner_By_Score: " + winner + "\n" +
           "------------------------------------------------------------" + "\n" +
           "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"
                   ;
           
           System.out.println(inputText);
           System.out.println("\n");
           
           out.close();
           
           System.out.println("__________________________________________________________");
           System.out.println("----------------------------------------------------------");
           System.out.println("The Stats have been written to the file " + outputfileName);
           System.out.println("----------------------------------------------------------");
           System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
           System.out.println("\n");
    }

}
