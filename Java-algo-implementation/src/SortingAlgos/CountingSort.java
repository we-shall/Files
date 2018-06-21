/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vishalsingh
 */
public class CountingSort {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int arr[] = {2,3,1,2,4,9,12,8,2,1};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
        
        
        
        
    }
    
    
    public static void countingSort(int arr[]){
        // find the max value to declare the array
        int max = -99999;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int count[] = new int[max];
        
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]-1] += 1;
        }
        int k = 0;
        for (int i = 0; i < max; i++) {
            
            while (count[i] > 0){
                arr[k ++] = i+1;
                count[i] -= 1;
            }
        }
    }
   
}
