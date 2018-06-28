/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingAlgos;

import java.util.Arrays;

/**
 *
 * @author vishalsingh
 */
public class BinarySearch 
{
    public static void main(String[] args) 
    {
        int arr[] = {2,5,1,3,6,9,10};
        Arrays.sort(arr);
        
        int search = 5;
        System.out.println(binarysearch(arr, search, 0, arr.length-1));
        
        
    }
    
    
    public static int binarysearch (int arr[], int num, int start, int end)
    {
        
        if (start < end)
        {
            int mid = (start + end)/2;
            if (arr[mid] == num)
            {
                return mid;
            }
            else if (arr[mid] > num)
            {
                binarysearch(arr, num, start, mid);
            }
            else
                binarysearch(arr, num, mid+1, end);
        
        }
        
        return -1;
    }
    
    
}
