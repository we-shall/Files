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
public class InsertionSort {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        //this sorting algorithm is stable sorting algo..
        //backward referencing algo...
        
        
        int a[] = {2,1,4,11,3,6,7,8};
        
        for (int i = 0; i < a.length; i++) 
        {
            int j = i - 1;
            int temp = a[j + 1];
            while (j >= 0 && a[j] > temp )
            {
                a[j + 1] = a [ j ];
                j--;
            }
            a[j+1] = temp;
        }
        System.out.println(Arrays.toString(a));
        
        
    }
    
}
