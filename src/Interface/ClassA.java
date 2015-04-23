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
public class ClassA {
    
    public static void main(String args[])
    {
        String s ="Red rum, sir, is murder";
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
    }
    public void draw()
    {
        System.out.println("classA");
    }
}
