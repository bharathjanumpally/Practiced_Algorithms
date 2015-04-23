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
public class Maxsumsubarray {
    
    public static int maxSubArray(int [] A)
    {
        int max = A[0];
        int[] sum = new int[A.length];
        sum[0]=A[0];
        
        for(int i =1; i<A.length;i++)
        {
            sum[i]=Math.max(A[i], sum[i-1]+A[i]);
           max= Math.max(max,sum[i]);        
        }
        
        return max;
    }
    
    public static void main(String args[])
    {
        int A[] = {1,5,-2,4,-4};
        System.out.println(maxSubArray(A));
    }
    
}
