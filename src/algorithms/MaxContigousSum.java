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
public class MaxContigousSum {
    
    public static int maxConSum(int A[],int n)
    {
        int M[] = new int[n];
        int maxSum=0;
        
        if(A[0]>0) M[0]=A[0];
        else 
            M[0]=0;
        for(int i=1;i<n;i++)
        {
           if(M[i-1]+A[i]>M[i])
               M[i]=M[i-1]+A[i];
           else
               M[i]=0;
        }
        
        for(int i=0;i<n;i++)
            if(M[i]>maxSum) maxSum=M[i];
        
        return maxSum;
        
    }
    
    public static void main (String args[])
    {
        int A[]={-2,11,-4,13,-5,2};
        System.out.println(maxConSum(A,A.length));
        System.out.println(maxConSumNoDp(A,A.length));
    }
    
    public static int maxConSumNoDp(int A[],int n)
    {
        int sumEndinghere =0, sumSoFar=0;
        for(int i=0;i<n;i++)
        {
            sumEndinghere = sumEndinghere+A[i];
            if(sumEndinghere<0)
            {
                sumEndinghere =0;
                continue;
            }
            if(sumSoFar<sumEndinghere)
                sumSoFar = sumEndinghere;
        }
        return sumSoFar;
    }
    
    
}
