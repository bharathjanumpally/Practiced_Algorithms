/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivideandConquer;

/**
 *
 * @author bharath
 */
public class ArrayShuffling {
 static String A[]={"a1","a2","a3","b1","b2","b3"};
    public static void ShuffleArray(String A[], int l, int r)
    {
        int c = (l+r)/2; 
        int q=1+(l+c)/2;
        
        if(l==r)
            return;
        for(int k=1,i=q;i<=c;i++,k++)
        {
            String temp =A[i];
            A[i]=A[c+k];
            A[c+k]=temp;
        }
        
        ShuffleArray(A,l,c);
        ShuffleArray(A,c+1,r);
    }
    
    public static void  main(String args[])
    {
        ShuffleArray(A,0,A.length);
        for(int i=0;i<A.length;i++)
            System.out.print(A[i]);
    }
}
