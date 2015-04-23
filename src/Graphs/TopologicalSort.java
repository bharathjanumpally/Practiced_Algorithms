/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;
import java.util.*;
/**
 *
 * @author bharath
 */
public class TopologicalSort {
    
     private static void dfs(List<Integer>[] graph, boolean[] used, List<Integer> res, int u) {
    used[u] = true;
    for(int v:graph[u])
    {
        if(!used[v])
            dfs(graph,used,res,v);
    }
    res.add(u);
    }
    public static List<Integer> topologicalSort(List<Integer>[] graph)
    {
        int n = graph.length;
        boolean[] used = new boolean[n];
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!used[i])
                dfs(graph,used,res,i);
        }
        Collections.reverse(res);
                return res;
         
    }
    
    public static void main(String args[])
    {
        int n =4;
        List<Integer>[] g = new List[n];
        
        for(int i =0 ;i<n;i++)
            g[i]= new ArrayList<>();
        g[2].add(2);
        g[2].add(1);
        g[0].add(2);
        g[3].add(3);
        
        for(int i=0;i<n;i++)
          System.out.println(g[i]);
        
        List<Integer> res = topologicalSort(g);
       System.out.println(res);
        
    }
    
      
}
