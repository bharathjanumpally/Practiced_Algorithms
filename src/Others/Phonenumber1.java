/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author bharath
 */
public class Phonenumber1 {
   
    private final static char [] DIGITS = "0123456789".toCharArray();

   public static void generate(int length, Set<Character> disallowedDigits) {
    Set<Character> allowedDigits = new TreeSet<Character>();

    for ( Character digit : DIGITS ) {
        if ( ! disallowedDigits.contains(digit) ) {
            allowedDigits.add(digit);
        }
    }

    if ( allowedDigits.contains('4') ) {
        printNumbers("4", allowedDigits, length);
        allowedDigits.remove('4');
    }

    for ( Character digit : allowedDigits ) {
        printNumbers("" + digit, allowedDigits, length);
    }
}

private static void printNumbers(String soFar, Set<Character> allowedDigits, int length) {
    int lengthSoFar = soFar.length();

    if ( lengthSoFar < length ) {
        Character last = soFar.charAt(lengthSoFar - 1);

        for ( Character digit : allowedDigits ) {
            if ( ! digit.equals(last) ) {
                printNumbers(soFar + digit, allowedDigits, length);
            }
        }
    } else {
        System.out.println(soFar);
    }
}

public static void main(String args[])
{
    Set<Character> disallowed= new TreeSet<Character>();
    disallowed.add('3');disallowed.add('7');disallowed.add('5');
    
    generate(4,disallowed);
}
}
