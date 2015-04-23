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
public class stringmatch {
    
   static String s1="abcen"; 
   static String s2="abcdd";
   static int counter=0, actual_computation = 0;
   static int table[][] = new int[s1.length()][s2.length()];
    public static int match(int x, int y)
    {
        counter++;
        //System.out.println(x+","+y);
        
        if(x==-1 && y==-1)
            return 0;
        if(x==-1)
            return y+1;
        if(y==-1)
            return x+1;
        if(table[x][y]==-1)
        {
            actual_computation++;
            if(s1.charAt(x)== s2.charAt(y))
                    return table[x][y]=match(x-1,y-1);
           else
                    return table[x][y]=Math.min(Math.min(1+match(x-1,y), 1+match(x,y-1)), 1+ match(x-1,y-1));
        }
        return table[x][y];
     }
    public static void main(String args[])
    {
        for(int i=0; i<s1.length();i++)
            for(int j=0;j<s2.length();j++)
                table[i][j]=-1;
        
        System.out.println(match(s1.length()-1, s2.length()-1));
        System.out.println(counter + " "+actual_computation);
        
          for(int i=0; i<s1.length();i++)
          {
            for(int j=0;j<s2.length();j++)
                                           System.out.print(table[i][j]+" ");
           System.out.println("");
                
            
          }
    }
    
}
