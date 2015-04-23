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
public class LinkedHashEntry {
    
    int key; int value;
    LinkedHashEntry next;
    
    LinkedHashEntry(int key, int value)
    {
        this.key= key;
        this.value= value;
        this.next = null;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void setValue(int value)
    {
        this.value= value;
    }
    
    public int getKey()
    {
        return key;
    }
    
    public LinkedHashEntry getNext()
    {
        return next;
    }
    
    public void setNext(LinkedHashEntry next)
    {
        this.next=next;
    }
}
