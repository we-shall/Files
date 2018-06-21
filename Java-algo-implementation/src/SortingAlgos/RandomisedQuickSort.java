/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vishalsingh
 */
public class RandomisedQuickSort {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int arr[] = {99,12,13,10,9,0,-11,999};
        
        
        quickSort(arr, 0, arr.length);
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static int randomisedPartition(int arr[], int start, int end){
        Random rand = new Random();
        int p = rand.nextInt(end-start) + start;
        
        int temp = arr[start];
        arr[start] = arr[p];
        arr[p] = temp;
        
        return partition(arr,start,end);
    }
    
    
    public static void quickSort(int arr[], int start, int end){
        
        if (start < end){
            int p = randomisedPartition (arr,start,end);
            quickSort(arr,start,p);
            quickSort(arr,p+1,end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int  i = start;
        int j = end;
        
        int pivot = arr[start];
        
        while (i < j){
            
            while (i < j && arr[--j] >= pivot); // just do nothing and wait for element which is smaller than pivot
            if (i < j){
                arr[i] = arr[j];
            }
            
            while (i < j && arr[++i] <= pivot);
            if (i < j){
                arr[j] = arr[i];
            }
            
        }
        arr[j] = pivot;
        
        return j;
    }

}
