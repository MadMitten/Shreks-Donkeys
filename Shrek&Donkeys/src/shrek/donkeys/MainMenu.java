/*
 * Name:Jordan O'Loughlin & Elijah Omotosho
 * Date: 28/11/18
 * Function: Displays a menu to the player and based on their choice will go into 1 of 3 classes or exit.
 */
package shrek.donkeys;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) throws FileNotFoundException, Exception {
        //Variables
        Scanner scan = new Scanner(System.in);
        int menuChoice = 0;

        while (menuChoice != 4 & menuChoice != 1) {
            System.out.println("__________________");
            System.out.println("------------------");
            System.out.println(" Snakes & Ladders ");
            System.out.println("------------------");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("1.Play Game");
            System.out.println("2.View Rules.");
            System.out.println("3.Stats");
            System.out.println("4.Exit Game");
            System.out.println("__________________");
            System.out.println("------------------");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

            System.out.print("Input: ");
            menuChoice = scan.nextInt();
            System.out.println("\n");

            switch (menuChoice) 
            {
                case 1:
                    PlayGame pg1 = new PlayGame();
                    pg1.playGame();//Calling the playGame method in the PlayGame class
                    break;
                case 2:
                    ViewRules VR1 = new ViewRules();
                    VR1.viewRules();
                    break;
                case 3:
                    OutputFile of1 = new OutputFile();
                    of1.viewStats();
                    break;
                case 4:
                    System.out.println("________________________________________________");
                    System.out.println("------------------------------------------------");
                    System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                    System.out.println("Thank You for Playing, Please Come Back and Play");
                    System.out.println("________________________________________________");
                    System.out.println("------------------------------------------------");
                    System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

                    System.exit(0);

                    break;
                default:
                    System.out.println("___________________________");
                    System.out.println("---------------------------");
                    System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                    System.out.println("This is not a valid option.");
                    System.out.println("___________________________");
                    System.out.println("---------------------------");
                    System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                    System.out.println("\n");
            }//End of menuChoice switch/
        }//End of while loop.
    }//End of main method.
}//End of class.
