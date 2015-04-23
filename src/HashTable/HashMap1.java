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
public class HashMap1 {
    
    final static int TABLE_SIZE = 128;
    LinkedHashEntry[] table;
    HashMap1()
    {
        table = new LinkedHashEntry[TABLE_SIZE];
        for(int i =0;i<TABLE_SIZE;i++)
            table[i]=null;
    }
    
    public int get(int key)
    {
        int hash = key%TABLE_SIZE;
        if(table[hash]==null)
            return -1;
        else
        {
            LinkedHashEntry entry = table[hash];
            while(entry!=null&& entry.getKey()!=key)
            {
                entry =entry.getNext();
            }
            if(entry ==null)
                return -1;
            else
                return entry.getValue();
        }
    }
    
    public void put(int key, int value)
    {
        int hash=key%TABLE_SIZE;
        if(table[hash]==null)
            table[hash] = new LinkedHashEntry(key,value);
        else
        {
            LinkedHashEntry entry = table[hash];
           while(entry.getNext()!=null && entry.getKey()!=key)
               entry = entry.getNext();
           if(entry.getKey()==key)
               entry.setValue(value);
           else
               entry.setNext(new LinkedHashEntry (key,value));
    }  
 }
  public static void main(String [] args)
    {
        HashMap1 hm = new HashMap1();
        hm.put(1,10);
        hm.put(130,13);
        hm.put(2,11);
        hm.put(128, 20);
         hm.put(129, 21);
        
        int k = hm.get(1);
        System.out.println(k);
        int k1 = hm.get(2);
        System.out.println(k1);
    }   
    
}
