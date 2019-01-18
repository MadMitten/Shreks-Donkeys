/*
 * Name:Jordan O'Loughlin & Elijah Omotosho
 * Date : 09/12/18
 * Prints out the info from the file.
 */
package shrek.donkeys;
import java.io.*;

public class ViewRules 
{
    String st;
    
    public void viewRules() throws Exception 
    {
        //Changed depending on where you store the game.
        File file = new File("C:\\Users\\jorda\\Desktop\\New folder\\Shrek&Donkeys\\src\\shrek\\donkeys\\RulesforShrekandDonkey.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        
        while ((st = br.readLine()) != null)
        {
            System.out.println(st);
        }
        System.out.println("\n");
    }//End of viewRules.
}//End of class.
