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
public class EditDistance {
    
    public static int editDistance(String s1, String s2)
    {
        int m = s1.length();
        int n = s2.length();
        
        int [][]d = new int [m+1][n+1];
        
        for(int i =0;i<=m;i++)
            d[i][0]=i;
        for(int j=0;j<n;j++)
            d[0][j]=j;
        
        for(int j =1; j<=n;j++)
        {
            for (int i=1;i<=m;i++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    d[i][j]=d[i-1][j-1];
                }
                else
                {
                    d[i][j]=min((d[i-1][j]+1),(d[i][j-1]+1),(d[i-1][j-1]+1));
                    
                }
            }
        }
        
        return d[m][n];
    }

    private static int min(int a, int b, int c) {
    
    return(Math.min(Math.min(a,b),c));
    }
    
    public static void main(String args[])
    {
        int a = editDistance("cab","abcd");
        
        System.out.println(a);
    }
    
}
