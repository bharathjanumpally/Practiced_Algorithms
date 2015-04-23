/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bharath
 */
public class complieregex {
    public static void main(String[] args) {

        String text    =
                "This is the text to be searched " +
                "for occurrences of the http:// pattern.";

        String patternString = ".*http://.*";

        Pattern pattern = Pattern.compile(patternString);
        System.out.println(pattern);
        Matcher matcher = pattern.matcher(text);

        boolean matches = matcher.matches();

        System.out.println("matches = " + matches);
    }
}
