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
public class LongestPalindrome {
    
    public static String longestPalin(String s)
    {
        if(s.isEmpty()) return null;
        if(s.length()==1) return s;
        
        String longest = s.substring(0, 1);
        
        for(int i =0;i<s.length();i++)
        {
            String tmp = helper(s,i,i);
            if(tmp.length()>longest.length())
            {
                longest=tmp;
            }
            
           tmp = helper(s,i,i+1);
            if(tmp.length()>longest.length())
            {
                longest=tmp;
            }
        }
        return longest;
    }

    private static String helper(String s, int start, int end) {
        
        if(start>=0&& end<=s.length()-1&& s.charAt(start)==s.charAt(end))
        {
            start--; end++;
        }
        
        return s.substring(start+1,end);
    }
    
    public static void main(String args[])
    {
        System.out.println(longestPalin("1221"));
    }
}
