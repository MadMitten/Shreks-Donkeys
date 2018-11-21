/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maths.project;
import java.util.Scanner;

/**
 * @author k00225361
 * Date:19/11/18
 * Function: Demonstrate the Extended Euclidean Algorithm
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ExtendedEuclidean {
    int vecOut[];
    
    public int extendEucl(int a,int b)
    {   
        vecOut = gcd(a,b);
        System.out.println("Gcd of " + a + " & " + b + " = " + vecOut[0]);
        System.out.println(a + "( " + vecOut[1] + ") + " + b + "(" + vecOut[2] + ") =" + vecOut[0]);
        return vecOut[0];
    }//End of extendEucl method.
    
   private int[] gcd(int a, int b) 
   {
      int vecIn [];
      
      if (b == 0)
      {
         vecIn =new int []{ a, 1, 0 };
      }//End of if statement
     else
     {
        vecIn = gcd(b,a%b);
        int d  = vecIn[0];
        int a2 = vecIn[2];
        int b2 = vecIn[1] - (a / b) * vecIn[2];
        vecIn = new int[]{d,a2,b2};
     }//End of else statement.
      return vecIn;
    }//End of gcd method

    
   /* public static void main(String[] args)
    {
         Remove commets to test individual files.
        int a;
        int b;
         
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a value for A:");
        a = scan.nextInt();
        
        System.out.print("Please enter a value for B:");
        b = scan.nextInt();
        
        System.out.println("The common divisor of " + a + " & " + b + " = "  + extendEucl(a,b));
        
    }//End of main method.
*/
}//End of class.
