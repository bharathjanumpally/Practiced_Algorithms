/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author bharath
 */
public class Node {
    
    public Node next;
    public Node random;
    public String data;
    
    public String getData()
    {
        return data;
    }
    public void setData(String data)
    {
        this.data= data;
    }
    
    public void setNext(Node next)
    {
        this.next =next;
    }
        public Node getNext()
    {
        return next;
    }
    
    public void setRandom(Node random)
    {
        this.random =random;
    }
    public Node getRandom()
    {
        return random;
    }
}
