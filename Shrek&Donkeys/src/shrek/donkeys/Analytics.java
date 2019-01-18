package shrek.donkeys;
/*
 * Name:Jordan O'Loughlin & Elijah Omotosho
 * Date: 7/11/18
 * Gets player Statistics and writes them to a file.
 * Prints players name,Score,rounds played and how many times each player rolled a dice & winner by score
 */
import java.io.*;

//Inheritance
public class Analytics extends PlayGame 
{
    //Instance of playGame.
    PlayGame p = new PlayGame();

    public Players getPlayer1() 
    {
        return p.player1;
    }

    public void setPlayer1(Players player1) 
    {
        this.p.player1 = player1;
    }

    public Players getPlayer2() 
    {
        return p.player2;
    }

    public void setPlayer2(Players player2) 
    {
        this.p.player2 = player2;
    }
    
    //Displays stats and writes it to Stats.txt.
    void Stats() throws FileNotFoundException 
    {
        System.out.println("------------------------------------------------------------");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        String Player1Name = p.player1.name;
        String Player2Name = p.player2.name;
        int Player1Score = p.player1.score;
        int Player2Score = p.player2.score;
        int Player1DiceRolls = p.player1.counter;
        int Player2DiceRolls = p.player2.counter;
        int player1AverageDice = p.player1.playerDice + p.player1.counter;
        int player2AverageDice = p.player2.playerDice + p.player2.counter;
        String winner = null;

        if (Player1Score > Player2Score) {
            
            winner = "Player 1 - " + Player1Name + " is the Winner interms of Score";
        } 
        else if (Player1Score < Player2Score)
        {
            winner = "Player 2 - " + Player2Name + " is the Winner interms of Score";
        }
        
        String outputFileName = "Stats.txt";
        String inputFileText;
        
        //Outputs stats to user.
        PrintWriter out = new PrintWriter(outputFileName);
        inputFileText = "------------------------------------------------------------" + "\n" 
                + "Game between " + Player1Name + " & " + Player2Name + "\n"
                +  Player1Name +  "Stats:" + "\n"
                + "- Score: " + Player1Score + "\n"
                + "- Dice_Rolls: " + Player1DiceRolls + "\n"
                + "- Average dice roll " +  player1AverageDice + "\n"
                + "------------------------------------------------------------" + "\n"
                + " " +  Player2Name +  "Stats:" + "\n"
                + "- Score: " + Player2Score + "\n"
                + "- Dice_Rolls: " + Player2DiceRolls + "\n"
                + "- Average dice roll " +  player2AverageDice + "\n"
                + "------------------------------------------------------------" + "\n"
                + "- Winner_By_Score: " + winner + "\n"
                + "------------------------------------------------------------" + "\n"
                + "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯";
          
        //Prints stats to Stats,txt.
        out.println("------------------------------------------------------------" + "\n");
        out.println("Game between " + Player1Name + " & " + Player2Name + "\n");
        out.println(Player1Name +  " Stats:" + "\n");
        out.println("- Score: " + Player1Score + "\n");
        out.println("- Dice_Rolls: " + Player1DiceRolls + "\n");
        out.println("- Average dice roll " +  player1AverageDice +  "\n");
        out.println("------------------------------------------------------------" + "\n");
        out.println(Player2Name +  " Stats:" + "\n");
        out.println("- Score: " + Player1Score + "\n");
        out.println("- Dice_Rolls: " + Player2DiceRolls + "\n");
        out.println("- Average dice roll " +  player2AverageDice + "\n");
        out.println("------------------------------------------------------------" + "\n");
        out.println("- Winner_By_Score: " + winner + "\n");
        out.println("------------------------------------------------------------" + "\n");
        out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        out.close();

        System.out.println(inputFileText);

        System.out.println("__________________________________________________________");
        System.out.println("----------------------------------------------------------");
        System.out.println("The Stats have been written to the file " + outputFileName);
        System.out.println("----------------------------------------------------------");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("\n");
    }//End of stats method
}//End of class.
