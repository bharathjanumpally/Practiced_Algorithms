/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crackingthecodinginterview.ArraysandStrings;
import java.lang.String;
/**
 *
 * @author bharath
 */
public class CompressString {
    
     public static int countCompression(String str)
    {
        if(str==null||str.isEmpty()) return 0;
        char last= str.charAt(0);
        int size=0;
        int count = 1;
        
        for(int i =1;i<str.length();i++)
        {
            if(str.charAt(i)==last)
                count++;
            else
            {
                last=str.charAt(i);
                size+=1+ String.valueOf(count).length();
                count =1;
            }
        }
        
        size +=1+ String.valueOf(count).length();
        return size;
    }
    public static String compressAlternate(String str)
    {
     
        int size= countCompression(str);
        if(size>str.length())
            return str;
        
        char[] array = new char[size];
        int index =0;
        
        char last = str.charAt(0);
        int count =1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==last)
                count++;
            else
            {
                index=setChar(array,last,index,count);
                last=str.charAt(i);
                count=1;
            }
        }
        
        index= setChar(array,last,index,count);
        return String.valueOf(array);
    }

    private static int setChar(char[] array, char c, int index, int count) {
        array[index]=c;
    
        char[]cnt=String.valueOf(count).toCharArray();
        
        for(char x:cnt )
        {
            array[index]=x;
            index++;
        }
        
        return index;
    }
    
   
 }
