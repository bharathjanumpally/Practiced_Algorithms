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
public class MinCostPath {
    
    public static int minCost(int cost[][],int m, int n)
    {
        int tc[][] = new int[3][3];
        tc[0][0] = cost[0][0];
        
        for(int i=1;i<=m;i++)
            tc[i][0]=tc[i-1][0]+cost[i][0];
     
        
        for(int j = 1;j<=n;j++)
            tc[0][j] = tc[0][j-1]+cost[0][j];
        
        for(int i =1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                tc[i][j]= Math.min(Math.min(tc[i-1][j-1], tc[i-1][j]), tc[i][j-1])+cost[i][j];
            }
            
        }
        
        return tc[m][n];
    }
    
    public static void main(String args[])
    {
        int cost[][] = new int [] [] { {1, 2, 3}, {4, 8, 2},
                      {1, 5, 3} };
  
        System.out.println(minCost(cost, 2, 2));
    }
}
