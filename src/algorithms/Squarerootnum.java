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
public class Squarerootnum {
    
    public static void findsqroot(int num)
    {
        double out;
        double sqroot = num/2;
        do
        {
            out = sqroot;
            sqroot= (out+(num/out))/2;
        }while((out-sqroot)!=0);
        
        System.out.println(sqroot);
    }
    public static void main(String args[])
    {
        findsqroot(2);
    }
}
