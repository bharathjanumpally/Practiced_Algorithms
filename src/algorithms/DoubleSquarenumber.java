/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.lang.Math.*;
import static java.lang.Math.floor;

/**
 *
 * @author bharath
 */
public class DoubleSquarenumber {
    
    public static void checkDouble(int num)
    {
      double n = Math.sqrt(num);
      
      int i =0;
      int j =(int)n;
      
      while (i<=j)
      {
          int sqnum = i*i+j*j;
          if(sqnum==num)
          {
              System.out.println(i+","+j);
              i=i+1;
              j=j-1;                   
          }
          else if(sqnum>num)
              j=j-1;
          else
              i=i+1;
      }
      
    }
    
    public static void main(String args[])
    {
        checkDouble(100);
    }
}
