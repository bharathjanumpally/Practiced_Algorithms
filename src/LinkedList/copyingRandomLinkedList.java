/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bharath
 */
public class copyingRandomLinkedList {
    
    public Node deepCopy(Node head)
    {
        Map<Node,Node> map = new HashMap<Node,Node>();
        Node x =head,y;
        while(x!=null)
        {
            y = new Node();
            y.setData(new String(x.getData()));
            y.setNext(null);
            y.setRandom(null);
            map.put(x,y);
            x=x.getNext();
        }
        
        while(x!=null)
        {
            y= map.get(x);
            y.setNext(map.get(x.getNext()));
            y.setRandom(map.get(x.getRandom()));
            x=x.getNext();
        }
        return map.get(head);
    }
    
}
