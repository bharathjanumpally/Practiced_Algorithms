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
public class MergeSort {
    private int [] numbers;
    private int [] temparr;
  
    private int length;
    
    public void sort1(int [] values)
    {
        this.numbers= values;
        print();
        length = values.length;
        this.temparr= new int[length];
        mergeSort(0,length-1);
    }
    
    public void mergeSort(int low, int high)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            mergeSort(low,mid);
            mergeSort(mid+1,high);
            
            merge(low,mid,high);
        }
        
      }
    
    public void merge(int low, int mid, int high)
    {
        for(int i =low;i<high;i++)
            temparr[i]=numbers[i];
        int i = low;
        int j = mid + 1;
        int k = low;
        
        // Copy the smallest values from either the left or the right side back
    // to the original array
        
        while(i<=mid&&j<=high)
        {
            if(temparr[i]<=temparr[j])
            {
                numbers[k]=temparr[i];
                i++;
            }
            else
            {
                numbers[k]=temparr[j];
                j++;
            }
            k++;
        }
        
        // Copy the rest of the left side of the array into the target array
        while (i <= mid) {
            numbers[k] = temparr[i];
            k++;
           i++;
    }
    }
    
    public void print()
    {
        for(int i =0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
    }
    
     public static void main(String args[])
     {
         int arr[]={2,8,10,5,6,11,9};
         MergeSort mr= new MergeSort();
         mr.sort1(arr);
         mr.print();
     }
    
}
