/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searchings;

import static java.lang.Math.max;
import static java.lang.Math.min;
/**
 *
 * @author bharath
 */
public class MaxIndexDiff {
    
    public static int maxIndexDiff(int A[])
    {
        int maxDiff;
        int i,j;
        int n =A.length;
        int leftMins [] = new int[A.length];
        int rightMaxs[] = new int [A.length];
        
        leftMins[0]= A[0];
        
        for(i=1;i<n;i++)
            leftMins[i]= min(A[i],leftMins[i-1]);
        
        rightMaxs[n-1] = A[n-1];
        for(j=n-2;j>=0;j--)
            rightMaxs[j]= max(A[j],rightMaxs[j+1]);
        
        i=0;j=0;maxDiff =-1;
        
        while(j<n&&i<n)
        {
            if(leftMins[i]<rightMaxs[j])
            {
                System.out.println(j+","+i);
                maxDiff= max(maxDiff, j-i);
                j=j+1;
            }
            else 
                i=i+1;
        }
        
        
        return maxDiff;
    }
    
    public static void main(String args[])
    {
        int A[] ={34,8,10,3,2,80,30,33,1};
        int k =maxIndexDiff(A);
        
        System.out.println(k);
    }
    
}
