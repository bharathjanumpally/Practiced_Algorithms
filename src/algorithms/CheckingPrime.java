/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author bharath
 */
public class CheckingPrime {
    
    public static boolean isPrime(int n)
    {
        int divisor =2;
        while(n>divisor)
        {
            if(n%divisor==0)
                return false;
            else
                divisor++;
        }
        return true;
    }
    
    public static void main (String args[])
    {
        System.out.println(isPrime(138));
     }
    
}
