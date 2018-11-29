/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes.ladders;
import java.util.Scanner;
 
/**
 *
 * @author k00225361
 */
public class Players {
    String name;
    Scanner scan = new Scanner(System.in);    

    public Players(String name) {
        this.name = name;
    }

    Players() {
        name = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void playerName()
    {
        System.out.println("Please enter your name");
        name = scan.nextLine();
       // return name;
    }


}
