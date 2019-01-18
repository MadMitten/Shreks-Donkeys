/*
 * Name:Jordan O'Loughlin & Elijah Omotosho
 * Date: 28/11/18
 * Function: * Creates a grid object and fills it with values for the game
 */
package shrek.donkeys;

public class Grid 
{

    String[] gridSize = new String[105]; //Grid array we will fill.
    String empty;
    String shrek;
    String donkey;
    String fiona;
    String puss;

    public Grid(String e, String s, String d, String f, String p)
    {
        empty = e;
        shrek = s;
        donkey = d;
        fiona = f;
        puss = p;
    }

    public Grid() 
    {
        empty = "_ ";
        shrek = "S ";
        donkey = "D ";
        fiona = "F ";
        puss = "P ";
    }

    public String[] getGridSize() 
    {
        return gridSize;
    }

    public void setGridSize(String[] gridSize)
    {
        this.gridSize = gridSize;
    }

    public String getEmpty()
    {
        return empty;
    }

    public String getShrek()
    {
        return shrek;
    }

    public String getDonkey()
    {
        return donkey;
    }

    public String getFiona()
    {
        return fiona;
    }

    public String getPuss() 
    {
        return puss;
    }

    //Popluates the array with shreks,donkeys,fions and puss. 
    //Theses are the items that will affect the player if they land on them 
    public String[] viewGrid(String shrek, String empty, String donkey, String puss) {
        System.out.println("____________________________________________________________");
        System.out.println("------------------------------------------------------------");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        for (int i = 0; i < gridSize.length; i++)//Skips to the next line every 15 spaces.
        {
            if (i % 15 == 0) {
                System.out.println("\n");
            }

            if (i == 4 || i == 12 || i == 24 || i == 41) {
                gridSize[i] = getShrek();
            }//End if statement
            else if (i == 33 || i == 56 || i == 76)
            {
                gridSize[i] = getDonkey();
            } 
            
            else if (i == 69) 
            {
                gridSize[i] = getFiona();
            } else if (i == 55 || i == 89 ||i == 17) 
            {
                gridSize[i] = getPuss();
            } 
            else 
            { 
                gridSize[i] = getEmpty();
            }
            System.out.print(gridSize[i]);
        }//End of for.
        System.out.println("");
        System.out.println("____________________________________________________________");
        System.out.println("------------------------------------------------------------");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("\n");
        return gridSize;
    }//End of method.

}//End of class.
