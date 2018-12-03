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
public class PlayGame {

    Grid g1 = new Grid();
    Players player1 = new Players(); //Instance of the object.
    Players player2 = new Players();


    public void playGame() {
        
        g1.viewGrid(g1.empty, g1.shrek, g1.donkey);
      
    }
}
