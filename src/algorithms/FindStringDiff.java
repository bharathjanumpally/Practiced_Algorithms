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
public class FindStringDiff {
    
    public static boolean FinddiffString (String s1, String s2)
    {
       String longer = s1.length()>s2.length() ?s1:s2;
       String smaller = s1.length()<s2.length()?s1:s2;
       
       boolean stalled = s1.length()!=s2.length();
       
       for(int i=0;i<smaller.length();i++)
       {
                          
           if(smaller.charAt(i)!=longer.charAt(i))
           {
               int offset= stalled?1:0;
               return smaller.substring(i+1).equals(longer.substring(i+1+offset));
           }
           if((i+1)==smaller.length() && (longer.length()-smaller.length() ==1))
                return true;
        }
       return false;
       
    }
    public static void main(String args[])
    {
        System.out.print(FinddiffString("abc","abcd"));
    }
    
}
