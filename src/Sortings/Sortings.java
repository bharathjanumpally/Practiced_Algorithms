/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortings;

/**
 *
 * @author bharath
 */
import java.util.*;
public class Sortings {
 
    public static void printarr(int output[])
    {
        for(int i =0;i<output.length;i++)
        {
            System.out.print(output[i]+" ");
        }
    }
    public static void bubbleSort(int input[])
    {
        System.out.println("before sorting");
        for(int i=0; i< input.length;i++)
        {
            System.out.print(input[i]+" ");
        }
        
        for(int i = (input.length -1);i >= 0;i--)
        {
            for (int j = 1; j<=i;j++)
            {
                if(input[j-1]> input[j])
                {
                    int temp = input[j-1];
                    input[j-1] = input[j];
                    input[j]=temp;
                }
            }
        }
        System.out.println("\nAfter bubble sorting");
        printarr(input);
        
    }
    
    public  static void selectionSort(int in[])
    {
           System.out.println("before sorting");
        for(int i=0; i< in.length;i++)
        {
            System.out.print(in[i]+" ");
        }
        for (int i =0; i<in.length;i++)
        {
           int min =i;
           for (int j =i+1; j<in.length;j++)
           {
               if (in[j]<in[min])
                   min = j;
           }
           
           int temp = in[i];
            in[i] = in[min];
            in[min]=temp;
        }
        
        System.out.println("\nAfter bubble sorting");
        printarr(in);
        
        
    }
    
    public static void insertionSort(int in[])
    {
        
    }
    public static void main(String args[])
    {
        int arr[]={2,8,10,5,6,11,9};
        
        
        System.out.println("\nEnter the sorting technique");
        Scanner read = new Scanner(System.in);
        int s = read.nextInt();
        switch(s)
                {
                    case 1:
                        bubbleSort(arr);break;
                    case 2:
                        selectionSort(arr); break;
                    case 3:
                        insertionSort(arr);break;
    }
}
}