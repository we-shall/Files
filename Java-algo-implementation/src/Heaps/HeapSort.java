/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heaps;

/**
 *
 * @author vishalsingh
 */
public class HeapSort 
{
    public static void main(String[] args) 
    {
        
        //in place algorithm ... 
        
        // algorithm will have a comlexity of nlogn..
        // disadvanatge 
        // once we sort the data the heap is no longer a heap it is just a sorted data
        // so for again making a heap we need to apply heapify to all element present 
        // making it more complex...
        Heap heap = new Heap(20);
        int arr[] = {3,2,4,5,1,7,8,10};
        for (int i = 0; i < arr.length; i++) 
        {
            heap.insert(arr[i]);
        }
        heap.printHeap();
        System.out.println("++++++++++++++++");
        heap.sort();
        heap.printHeap();
         
    }
    
}
