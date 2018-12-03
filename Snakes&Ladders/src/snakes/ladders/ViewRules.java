package snakes.ladders;

/**
 *
 * @author k00225361
 */

import java.io.*;

public class ViewRules {
    
    public void viewRules()throws Exception{
        File file;
        
        file = new File("C:\\Users\\eomot\\OneDrive\\Desktop\\GameDesign\\Year2\\Semester3\\Object_Orientend_Theory_and_Programming\\Snakes and Ladders\\SnakeAndLadders\\src\\snakeandladders\\RulesforShrekandDonkey.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
    
        String st;

        while((st = br.readLine()) != null){
            System.out.println(st);
        }
        
        System.out.println("/n");
    }
    
}
