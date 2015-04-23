/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regex;

import java.util.regex.Pattern;

/**
 *
 * @author bharath
 */
public class matches {
    public static void main (String args[])
    {
        String text    =
            "This is the text to be searched " +
            "for occurrences of the pattern.";

        String pattern = ".*is.*";

        boolean matches = Pattern.matches(pattern, text);

        System.out.println("matches = " + matches);
    }
    
}
