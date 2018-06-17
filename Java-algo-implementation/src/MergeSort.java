
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
    }
    
    public static void MergeSort1 (int start, int end)
    {
        if (start > end)
        {
            int mid = (start+end)/2;
            MergeSort1 (start, mid);
            MergeSort1 (mid+1, end);
            Merge (start,mid,end);
        }
    }

    private static void Merge(int start, int mid, int end) 
    {
        int temp [] = new int[end - start];
        for (int i = start; i <= mid; i++) {
            if (arr[i] )
        }
        
        for (int i = mid+1; i <= end; i++) {
            
        }
        
    }
    
}
