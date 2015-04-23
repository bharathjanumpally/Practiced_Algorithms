/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;
import static java.lang.Thread.sleep;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author bharath
 */
public class Permutations1 {
    
    public static ArrayList<ArrayList<Integer>> permute(int[] num) {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	permute(num, 0, result);
	return result;
}
 
static void permute(int[] num, int start, ArrayList<ArrayList<Integer>> result) {
 
	if (start >= num.length) {
		ArrayList<Integer> item = convertArrayToList(num);
		result.add(item);
	}
 
	for (int j = start; j <= num.length - 1; j++) {
		swap(num, start, j);
		permute(num, start + 1, result);
		swap(num, start, j);
	}
}
 
private static ArrayList<Integer> convertArrayToList(int[] num) {
	ArrayList<Integer> item = new ArrayList<Integer>();
	for (int h = 0; h < num.length; h++) {
		item.add(num[h]);
	}
	return item;
}
 
private static void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
}
    public static void main(String args[])
     {
         /*int str[]={1,2,3};
         ArrayList a = permute(str);
         for(int i=0;i<a.size();i++)
             System.out.println(a.get(i));*/
         
         permutation("123");
         
    }
 ///Method2
    public static void permutation(String str) { 
        try { 
            permutation("", str);
        } catch (InterruptedException ex) {
            Logger.getLogger(Permutations1.class.getName()).log(Level.SEVERE, null, ex);
        }
}

private static void permutation(String prefix, String str) throws InterruptedException {
    int n = str.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
        {
            System.out.print(prefix + str.charAt(i)+ ",");
            System.out.print(str.substring(0, i) + str.substring(i+1, n)+" :");
            
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
      }
    }
}
