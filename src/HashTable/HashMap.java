/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

/**
 *
 * @author bharath
 */
public class HashMap {
    
    private final static int TABLE_SIZE =128;
    HashEntry [] table;
    HashMap()
    {
        table = new HashEntry[TABLE_SIZE];
        for (int i =0; i<TABLE_SIZE;i++)
            table[i]=null;
    }
    
    public int get(int key)
    {
        int hash = (key%TABLE_SIZE );
        System.out.println(hash);
        while(table[hash]!=null&& table[hash].getKey()!=key)
        {
            hash = (hash+1)%TABLE_SIZE;
            System.out.println(hash);
        }
        if(table[hash]==null)
            return -1;
        else 
            return table[hash].getValue();
    }
    
    public void put(int key, int value)
    {
      int hash = key%TABLE_SIZE;
      
      while(table[hash]!=null && table[hash].getKey() !=key)
          hash = (hash+1)%TABLE_SIZE;
     table[hash]= new HashEntry(key,value);
    }
    
    public static void main(String [] args)
    {
        HashMap hm = new HashMap();
        hm.put(1,10);
        hm.put(2,11);
        hm.put(128, 20);
        
        int k = hm.get(1);
        System.out.println(k);
        int k1 = hm.get(129);
        System.out.println(k1);
    }
  }
