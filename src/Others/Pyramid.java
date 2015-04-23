/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

/**
 *
 * @author bharath
 */
import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s;
        int l;
        System.out.println("Enter the String : ");
        s = sc.nextLine();  // assigns the input to s
        l = s.length();
        //System.out.println(l/2+1);
        for(int i=0; i<l;i++)  // iterating through the length of the string
        {
        	for(int x = 0; x < l - i; x++) 
        	{ 
        	    System.out.print(" ");         // adds space to create the shape of pyramid  
        	}
            for(int j=0;j<i;j++)
            {
                System.out.printf("%c ",s.charAt(j));   // print the character at jth space
            }
            System.out.printf("%c\n",s.charAt(i));  // print character at ith space.
           
	}
        

}
}