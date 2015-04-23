/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bharath
 */
public class Regexexam1 {
    public static void main (String args[])
    {
   String text    =
        "This is the text which is to be searched " +
        "for occurrences of the word 'is'.";

String patternString = "is";

Pattern pattern = Pattern.compile(patternString);
System.out.println(pattern);
Matcher matcher = pattern.matcher(text);

int count = 0;
while(matcher.find()) {
    count++;
    System.out.println("found: " + count + " : "
            + matcher.start() + " - " + matcher.end());
}
    }
}
