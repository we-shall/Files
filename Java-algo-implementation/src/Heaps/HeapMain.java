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
public class HeapMain {
    
    // a heap is special type of  binary tree...
    // a complete binary tree is heap...
    //backing the heap with array...
    
    public static void main(String[] args) 
    {
        Heap heap = new Heap(10);
        heap.insert(10);
        heap.insert(11);
        heap.insert(12);
        heap.insert(9);
        heap.insert(8);
        heap.insert(13);
        
        heap.printHeap();
        System.out.println("peek element" + heap.peek());
        System.out.println("");
        heap.delete(5);
        heap.delete(0);
        
        heap.printHeap(); 
        
        
        System.out.println("peek element" + heap.peek());
        
        
    }
    
    
}


class Heap 
{
    private int[] heap;
    private int size;
    
    Heap(int size)
    {
        heap = new int[size];
    }    
    
    void sort (){
        int lastIndex = size - 1;
        for (int i = 0; i < lastIndex; i++) 
        {
            int temp = heap[0];
            heap[0] = heap[lastIndex - i];
            heap[lastIndex - i] = temp;
            
            fixHeapBelow(0, lastIndex - i - 1);
            
        }
    }
    
    void printHeap()
    {
        for (int i = 0; i < size; i++) 
        {
            System.out.print("  " + heap[i]);
        }
    }
    
    void insert (int val)
    {
        if (isFull())
            throw new ArrayIndexOutOfBoundsException("heap is fulll");
        
        heap[size] = val;
        fixHeapAbove(size);
        size ++;
    }
    
    
    int delete (int index)
    {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("heap is empty");
        
        int parentIndex = getParent(index);
        int deleteValue = heap[index];
        
        heap[index] = heap[size-1];
        
        if (index == 0 || heap[index] < heap[parentIndex])
            fixHeapBelow(index, size -1);
        else
            fixHeapAbove(index);
      
        
        size --;
        return deleteValue;
    }
    
    
    int peek (){
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("heap is empty");
        
        return heap[0];
    }
    
    
    private void fixHeapBelow (int index, int lastHeapIndex)
    {
        int childToswap;
        
        while (index <= lastHeapIndex)
        {
            int leftIndex = getChild(index, true);
            int rightIndex = getChild (index, false);
            
            if (leftIndex <= lastHeapIndex)
            {
                if (rightIndex > lastHeapIndex)
                {
                    childToswap = leftIndex;
                }
                else
                {
                    childToswap = heap[rightIndex] > heap[leftIndex]? rightIndex : leftIndex;
                }
                
                if (heap[index] < heap[childToswap])
                {
                    int temp = heap[index];
                    heap[index] = heap[childToswap];
                    heap[childToswap] = temp;
                }
                else
                    break;
                index = childToswap;
            }
            else 
                break;
            
            
        }
        
        
    }
    
    
    private void fixHeapAbove(int index)
    {
        int newVal = heap[index];
        while (index > 0 && newVal > heap[getParent(index)])
        {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newVal; 
    }
  
    boolean isFull()
    {
        return size == heap.length;
    }
    
    boolean isEmpty()
    {
        return size == 0;
    }
    
    private int getParent (int index)
    {
        return (index - 1)/2;
    }
    
    int getChild (int index, boolean left)
    {
        return 2*index + (left? 1:2);      
    }
    
    
}
