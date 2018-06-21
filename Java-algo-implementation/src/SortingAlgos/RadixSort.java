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
public class RadixSort {
    
    public static void main(String[] args)
    {
        int arr[] = {4725,4586,1330,8792,1594,5729};
        //counting sort is an unstable sort method so first we need to sort the digits according 
        // counting sort in stable manner
        // In radix sort the number or string of same length is sorted according 0's position 10's position etc.
        radixSort(arr, 10, 4);
        System.out.println(Arrays.toString(arr));
    
    }
    public static void radixSort (int arr[], int radix, int width)
    {
        //traverse for each place of digit
        
       
        for (int i = 0; i < width; i++) 
        {
            radixSingleDigitSort(arr,i,radix);
        }
        
        
        
    }

    private static void radixSingleDigitSort(int[] arr, int position, int radix) 
    {
        int[] countarray = new int[radix];
        
        for (int j = 0; j < arr.length; j++) 
        {
            countarray[getdigit(arr[j], position,radix)] ++;
        }
        
        //now need to add previous count value...
        for (int i = 1; i < radix; i++) 
        {
            countarray[i] += countarray[i-1];
        }
        
        //declare an array temp for maintaining the stability of the algorithm..
        int temp[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i --)
        {
            temp[--countarray[getdigit(arr[i], position, radix)]] = arr[i];
        }
        
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = temp[i];
        }
        
        
    }

    private static int getdigit(int val, int position, int radix) 
    {
        return val/(int)Math.pow(radix, position)%radix;
    }
}
