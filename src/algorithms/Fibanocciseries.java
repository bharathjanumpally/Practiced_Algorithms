/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Scanner;

/**
 *
 * @author bharath
 */
public class Fibanocciseries {
    
    public static int  fib (int n)
    {
        int f[] = new int [n+1];
           int i;
 
  /* 0th and 1st number of the series are 0 and 1*/
            f[0] = 0;
                f[1] = 1;
 
  for (i = 2; i <= n; i++)
  {
      /* Add the previous 2 numbers in the series
         and store it */
      f[i] = f[i-1] + f[i-2];
  }
 
  return f[n];
    }
    
 static void multiply(int F[][], int M[][])
{
  int x =  F[0][0]*M[0][0] + F[0][1]*M[1][0];
  int y =  F[0][0]*M[0][1] + F[0][1]*M[1][1];
  int z =  F[1][0]*M[0][0] + F[1][1]*M[1][0];
  int w =  F[1][0]*M[0][1] + F[1][1]*M[1][1];
 
  F[0][0] = x;
  F[0][1] = y;
  F[1][0] = z;
  F[1][1] = w;
}

static void power(int F[][], int n)
{
  if( n == 0 || n == 1)
      return ;
  int M[][] = new int [2][2];
  M[0][0] =1;M[0][1] =1;M[1][0] =1;M[1][1] =1;
   
  power(F, n/2);
  multiply(F, F);
 
  if (n%2 != 0)
     multiply(F, M);
}
 
/* function that returns nth Fibonacci number */
static int fib1(int n)
{
  int F[][] = new int [2][2];
  F[0][0] =1;F[0][1] =1;F[1][0] =1;F[1][1] =1;

  if (n == 0)
    return 0;
  power(F, n-1);
  return F[0][1];
}
 
/* Optimized version of power() in method 4 */

 

    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        
        System.out.println(fib(a));
        
        
        System.out.println(fib1(a));
        
        
    }
}
