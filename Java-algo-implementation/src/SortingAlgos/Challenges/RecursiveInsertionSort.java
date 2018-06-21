/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgos.Challenges;

import java.util.Arrays;

/**
 *
 * @author vishalsingh
 */
public class RecursiveInsertionSort {
    
    public static void main(String[] args) 
    {
        int arr[] = {1,11,2,3,13,-1,22};
        insertionSort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void insertionSort(int arr[], int num)
    {
        
        if (num < 2)
            return;
        
        insertionSort(arr, num-1);
        
        int j = num - 1;
        int temp = arr[j + 1];
        while (j >= 0 && arr[j] > temp )
            {
                arr[j + 1] = arr [ j ];
                j--;
            }
            arr[j+1] = temp;
            
    }
    
    
}
