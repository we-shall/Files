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
public class SortingUsingJDK {
    
    
    public static void main(String[] args)
    {
        int arr[] = {22,1,23,11,14,9,11};
        
        //sorting using arrays.sort
        // Arrays.sort library uses quicksort with double pivot....
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
        
        
        //now lets uses parallelsort method of arrays which uses merge sort for breaking array into small chunks
        // once a threshold length is crossed arrays.sort is applied on the array...
        // this is usally for larger arrays..
        // it uses threads also
        
       Arrays.parallelSort(arr);
       System.out.println(Arrays.toString(arr));
        
        
        
        
    }
    
}
