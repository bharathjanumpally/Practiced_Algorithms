/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;
import java.util.*;
/**
 *
 * @author bharath
 */
public class Sumof4indexes {
    public static void findABequalsCDindexes(int vals[])
    {
        int sum=0;
        HashMap<Integer,ArrayList<Integer>> sumMap= new HashMap<Integer,ArrayList<Integer>>();
        ArrayList<Integer> temp;
        int [][] sums = new int[vals.length][vals.length];
        
        for(int i=0;i<vals.length;i++)
        {
            for(int j=i+1;j<vals.length;j++)
            {
                if(sumMap.containsKey(vals[i]+vals[j]))
                {
                    temp = sumMap.get(vals[i]+vals[j]);
                    if(temp.contains(j)||temp.contains(i))
                        continue;
                    else{
                        temp.add(j);
                        temp.add(i);
                    }
                  }
                else
                {
                    temp=new ArrayList<Integer>();
                    temp.add(i);
                    temp.add(j);
                    sumMap.put(vals[i]+vals[j], temp);
                }
            }
        }
        
        for(Integer i:sumMap.keySet())
        {
            temp=sumMap.get(i);
            if (temp.size() == 4) {
                System.out.println(temp + " = " + i);
            }
            else if (temp.size() > 4) {
                for (int k = 0; k < temp.size() - 2;) {
                    for (int j = k + 2; j < temp.size();) {
                        System.out.println("[" + temp.get(k) + ", " + temp.get(k + 1) + ", " + temp.get(j) + ", " + temp.get(j + 1) + "] = " + i);
                        j = j + 2;
                    }
                    k = k + 2;
                }
            }
        }
        }
    
    public static void main(String args[])
    {
        int a[]={3,4,7,1,2,9,8};
        findABequalsCDindexes(a);
    }
    }
   

