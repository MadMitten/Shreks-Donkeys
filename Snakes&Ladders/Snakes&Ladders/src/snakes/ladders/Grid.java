/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes.ladders;
import java.util.*;

/**
 *
 * @author k00225361
 * Date: 28/11/18
 * Function:
 */
public class Grid {
      String[] gridSize = new String[105];
      String empty;
      String shrek;
      String donkey;
     
     public Grid(String e,String s,String d)
     {
         empty = e;
         shrek = s;
         donkey = d;
     }
     
     public Grid() {
        empty = "_,";
        shrek = "S,";
        donkey = "D,";
    }

    public String[] getGridSize() {
        return gridSize;
    }

    public void setGridSize(String[] gridSize) {
        this.gridSize = gridSize;
    }

    public String getEmpty() {
        return empty;
    }

    public void setEmpty(String empty) {
        this.empty = empty;
    }

    public  String getShrek() {
        return shrek;
    }

    public  void setShrek(String shrek) {
        this.shrek = shrek;
    }

    public String getDonkey() {
        return donkey;
    }

    public  void setDonkey(String donkey) {
        this.donkey = donkey;
    }
     
    
    public String[] viewGrid(String shrek,String empty,String donkey)
    {
        for(int i = 0; i < gridSize.length; i++)
        {
            if (i % 15 == 0) 
            {
               System.out.println("\n");
            }
           
           if(i == 4 || i == 12 || i == 24 || i == 41)
           {
               gridSize[i] = getShrek();
           }//End if statement
           else if(i == 33 || i == 56 || i == 76){
               gridSize[i] = getDonkey();
           }//End if statement
           else{
               gridSize[i] = getEmpty();
           }
           System.out.print(gridSize[i]);
        
        }//End of for.
       
        return gridSize;
    }//End of method.
}//End of class.
