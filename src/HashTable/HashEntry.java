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
public class HashEntry {
   
    
    int key; int value;
    
    HashEntry(int key, int value)
    {
        this.key= key;
        this.value= value;
        
    }
        
    public int getKey()
    {
        return key;
    }
    public void setKey(int key)
    {
         this.key = key;
    }
    
    
    public int getValue()
    {
        return value;
    }
    public void setValue(int value)
    {
         this.value = value;
    }
}

