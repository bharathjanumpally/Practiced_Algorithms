/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author bharath
 */
public class ClassB extends ClassA {
    public void draw()
    {
        System.out.println("classb");
    }
    
    public static void main(String args[])
    {
        ClassA a = new ClassB();
        a.draw();
    }
}
