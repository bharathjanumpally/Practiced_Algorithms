/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
 
public class DFS {
 
    // recursive dfs
    private static void dfs_rec(ArrayList<ArrayList<Integer>> adjLists, boolean[] visited, int v){
        visited[v] = true;
        System.out.print(v + " ");
        for(int w : adjLists.get(v)){
            if(!visited[w]){
                dfs_rec(adjLists, visited, w);
            }
        }
    }
     
    // Usually dfs_rec() would be sufficient. However, if we don't want to pass
    // a boolean array to our function, we can use another function dfs().
    // We only have to pass the adjacency list and the source node to dfs(), 
    // as opposed to dfs_rec(), where we have to pass the boolean array additionally.
    public static void dfs(ArrayList<ArrayList<Integer>> adjLists, int s){
        int n = adjLists.size();
        boolean[] visited = new boolean[n];
        dfs_rec(adjLists, visited, s);
    }
 
    public static void dfsIterative (ArrayList<ArrayList<Integer>> adjLists, int s)
    {
        boolean[] visited = new boolean[adjLists.size()];
        Stack<Integer> st = new Stack<Integer>();
        st.push(s);
        while(!st.isEmpty())
        {
            int v = st.pop();
            
            
            if(!visited[v])
            {
                System.out.print(v+" ");
                visited[v] =true;
                
                Stack<Integer> auxStack = new Stack<Integer>();
                
                for(int w: adjLists.get(v))
                {
                    if (!visited[w]) {
                        
                        auxStack.push(w);
                        
                    }
                }
                
                while(!auxStack.isEmpty())
                {
                    st.push(auxStack.pop());
                }
            }
            
        }
        
    }
    
    
    
    public static void bfs(ArrayList<ArrayList<Integer>> adjList, int s)
    {
        boolean [] visited = new boolean[adjList.size()];
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        visited[s]=true;
        q.add(s);
        
        while(!q.isEmpty())
        {
            int v = q.poll();
             System.out.print(v+" ");
            for(int w :adjList.get(v))
            {
                if(!visited[w])
                {
                    visited[w]=true;
                    q.add(w);   
                }
            }
        }
    }
    public static void main(String[] args) 
    
    {
         
        // Create adjacency list representation
        ArrayList<ArrayList<Integer>> adjLists = new ArrayList<ArrayList<Integer>>();
        final int n = 7;
         
        // Add an empty adjacency list for each vertex
        for(int v=0; v<n; v++){
            adjLists.add(new ArrayList<Integer>());
        }
         
        // insert neighbors of vertex 0 into adjacency list for vertex 0
        adjLists.get(0).add(1);
        adjLists.get(0).add(2);
        adjLists.get(0).add(3);
         
        // insert neighbors of vertex 1 into adjacency list for vertex 1
        adjLists.get(1).add(5);
        adjLists.get(1).add(6);
         
        // insert neighbors of vertex 2 into adjacency list for vertex 2
        adjLists.get(2).add(4);
     
        // insert neighbors of vertex 3 into adjacency list for vertex 3
        adjLists.get(3).add(2);
        adjLists.get(3).add(4);
 
        // insert neighbors of vertex 4 into adjacency list for vertex 4
        adjLists.get(4).add(1);
 
        // insert neighbors of vertex 5 into adjacency list for vertex 5
        // -> nothing to do since vertex 5 has no neighbors
         
        // insert neighbors of vertex 6 into adjacency list for vertex 5
        adjLists.get(6).add(4);
         
        // Print vertices in the order in which they are visited by dfs()
       dfsIterative(adjLists, 0);
        //dfs(adjLists, 0);
        //System.out.println("hello");
       System.out.println(" ");
       bfs(adjLists,0);
 
    }
 
}