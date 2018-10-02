/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgos;

import java.util.Arrays;

/**
 *
 * @author vishalsingh
 */
public class QuickSort2 {
    static int count = 0;
 
    public static void main(String[] args) 
    {
        int arr[] = {4 ,3 ,1 ,2};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println (count);
    }
    
    
    
    private static int partition (int arr[], int start, int end)
    {
        int i = start, j = end, pivot = start;
        
        while (i < j)
        {
            while (arr[i] <= arr[pivot] && i < end)
                i ++;
            while (arr[j] > arr[pivot])
                j --;
            
            if (j > i)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                count ++;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        count ++;
        
        return j;
    }
    
    static void sort (int arr[], int start, int end)
    {
        if (start < end)
        {
            int p = partition(arr, start, end);
            sort (arr,start,p-1);
            sort (arr,p+1, end);
            
        }
    }
}
