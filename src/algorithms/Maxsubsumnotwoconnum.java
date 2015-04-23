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
public class Maxsubsumnotwoconnum {
    
    public static int Maxsum(int A[], int n)
    {
        int M[]=new int[n+1];
        M[0]=A[0];
        M[1]=A[0]>A[1]?A[0]:A[1];
        
        for(int i=2;i<n;i++)
        {
            M[i]=(M[i-1])>A[i]+M[i-2]?M[i-1]:A[i]+M[i-1];
        }
        
        return M[n-1];
    }
    
    public static void main (String args[])
    {
        int A[]={-2,11,-4,13,-5,2};
        System.out.println(Maxsum(A,A.length));
    }
}
