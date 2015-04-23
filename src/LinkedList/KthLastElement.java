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
public class KthLastElement {
    //Recursive
    public static int nthToLastRec(Node head, int k)
    {
        if(head == null)
            return 0;
        int i = nthToLastRec(head.next,k)+1;
        if(i==k)
            System.out.println(head.data);
        
        return i;
    }
   //Iterative
    
    public static Node nthToLastItr(Node head, int k)
    {
        if(k<=0) return null;
        
        Node p1=head;
        Node p2=head;
        
        for(int i=0;i<k-1;i++)
        {
            if(p2==null) return null;
            
            p2=p2.next;
        }
        
        if(p2==null) return null;
        
        while(p2.next!=null)
        {
            p1=p1.next;
            p2=p2.next;
        }
        
        return p1;
    }
    
}
