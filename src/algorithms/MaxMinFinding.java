/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.*;
/**
 *
 * @author bharath
 */
public class MaxMinFinding {
    
    public static void main(String args[])
    {
       // int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
         int b= sc.nextInt();
          int c = sc.nextInt();
        Ascending(a,b,c);
       
    }

    private static void Ascending(int a, int b, int c) {
        int max= Math.max(a, Math.max(b, c));
        int min= Math.min(a, Math.min(b, c));
        int mid= a+b+c-max-min;
        
        System.out.print(min+" "+ mid+" "+max);
     
    }
    
}

  
