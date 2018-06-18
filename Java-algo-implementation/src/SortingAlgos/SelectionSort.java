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
public class SelectionSort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int data[] = {1,2,111,4,5,3,7,0};
        
        for (int i = 0; i < data.length; i++) 
        {
            int index = minimumOfData(data,i);
            
            if (index != -1 && data[i] > data[index] ){
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
        }
        
        System.out.println(Arrays.toString(data));
    }

    private static int minimumOfData(int[] data, int i) {
        int min = 99999,m=-1;
        for (int j = i+1; j < data.length; j++) {
            if (data[j] < min){
                min = data[i];
                m = j;
            }
        }
    return m;
    }
    
}
