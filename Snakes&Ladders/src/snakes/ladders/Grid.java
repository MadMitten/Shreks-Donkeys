/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes.ladders;

/**
 *
 * @author k00225361
 * Date: 28/11/18
 * Function:
 */
public class Grid {
      String[] gridSize = new String[105];
      int player1;
      int player2;
      String empty;
      String shrek;
      String donkey;
      String fiona;
      String puss;
     
     public Grid(String e,String s,String d, String f, String p)
     {
         empty = e;
         shrek = s;
         donkey = d;
         fiona = f;
         puss = p;
     }
     
     public Grid() {
        empty = "_ ";
        shrek = "S ";
        donkey = "D ";
        fiona = "F ";
        puss = "P ";
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
    
    public String getFiona() {
        return fiona;
    }

    public void setFiona(String fiona) {
        this.fiona = fiona;
    }

    public String getPuss() {
        return puss;
    }

    public void setPuss(String puss) {
        this.puss = puss;
    }
     
    //Popluates the array with shreks,donkeys,fions and puss. 
    //Theses are the items that will affect the player if they land on them 
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
           else if(i == 69)
           {
               gridSize[i] = getFiona();
           }
           else if(i == 63 && i == 27)
           {
               gridSize[i] = getPuss();
           }
                    
           else{
               gridSize[i] = getEmpty();
           }
           System.out.print(gridSize[i]);
        
        }//End of for.
        
        System.out.println("\n");
        return gridSize;
    }//End of method.
  
}//End of class.
