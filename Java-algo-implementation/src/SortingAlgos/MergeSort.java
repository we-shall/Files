package SortingAlgos;


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
public class MergeSort {
    static int arr[] = {20,35,-15,7,55,1,-22};
    
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner (System.in);
     MergeSort1(0, arr.length-1);
     System.out.println(Arrays.toString(arr));
    }
    
    public static void MergeSort1 (int start, int end)
    {
        if (start < end)
        {
            int mid = (start+end)/2;
            MergeSort1 (start, mid);
            MergeSort1 (mid+1, end);
            Merge (start,mid,end);
        }
    }

    private static void Merge(int start, int mid, int end) 
    {
       int S[] = new int[mid-start+1];
       int E[] = new int[end - mid];
       
       //adding data to temperorary array...
       
        for (int i = 0; i < mid - start + 1; i++) 
        {
            S[i] = arr[i+start];
        }
        for (int i = 0; i < end - mid; i++)
        {
            E[i] = arr[i+mid+1]; 
        }
        
        //replacing data in main array by comparison
        int i = 0, j = 0, k = start;
        while (i < mid - start + 1 && j <end - mid )
        {
            if (S[i] >= E[j])
            {
                arr[k] = E[j];
                j ++;
            }
            else
            {
                arr[k] = S[i];
                i ++;
            }
            k++;
        }
        
        //now as one of array gets exausted we need to add data of other array to the array...
        while (i < mid - start + 1)
        {
            arr[k ++] = S[i++];
        }
        
        while (j < end - mid )
        {
            arr[k ++] = E[j++];
        }
        
    }
    
}
