
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishalsingh
 */
public class BubbleSort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {3,2,12,45,67,11,13};
        
        //In bubble sort the largest element in the array bubbles up...
       
        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex --) {
            
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            
        }
        System.out.println(Arrays.toString(arr));   
    }
    
}
