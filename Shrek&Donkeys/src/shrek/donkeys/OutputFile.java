/*
 * Name:Jordan O'Loughlin & Elijah Omotosho
 * Date: 09/12/18
 * Function: Prints out rules from the file
 */
package shrek.donkeys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class OutputFile
{
    String st;
    
    public void viewStats() throws Exception 
    {
        File file = new File("C:\\Users\\jorda\\Desktop\\New folder\\Shrek&Donkeys\\Stats.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        while ((st = br.readLine()) != null)
        {
            System.out.println(st);
        }
        System.out.println("\n");
    }//End of viewStats method.
}//End of class.
