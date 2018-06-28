/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vishalsingh
 */
public class BucketSort {
    //time required is linear time...
    
    public static void main(String[] args) 
    {
     int [] array = {33,22,11,24,13,23,16,88,99};
     
        System.out.println("unsorted array::" + Arrays.toString(array));
        
        List<Integer>[] buckets = new ArrayList[10];
        
        for (int i = 0; i < buckets.length; i++) 
        {
            buckets[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < array.length; i++) 
        {
            buckets[hashvalue(array[i])].add(array[i]);
        }
        
        for (int i = 0; i < buckets.length; i++) 
        {
            Collections.sort(buckets[i]);
            //collections.sort is backed by mergesort...
            
            // for normal use back it by insertion sort....
        }
        
        int k = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) 
            {
                array[k ++] = buckets[i].get(j);
            }
        }
        
        
        System.out.println("sorted array::" + Arrays.toString(array));
        
    }
    
    private static int hashvalue (int num){
        return num/10%10;
    }
}
