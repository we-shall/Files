/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heaps;
import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner (System.in);
		int test = sc.nextInt();
		
		for (int t = 0; t < test; t ++)
		{
		    
		    int n = sc.nextInt();
		    MinHeap heap = new MinHeap(n);
		    for (int i = 0; i < n; i ++)
                    {
		        heap.insert(sc.nextInt());
		    }
		    int k = sc.nextInt();
		    heap.sort(k);
                    System.out.println(heap.getHeap()[0]);
                    
		    
		    
		}
	}
}

class MinHeap {
    
    private int[] heap;
    private int size;
    
    MinHeap(int length)
    {
        heap = new int[length];
    }
    
    void sort (int tillIndex)
    {
        int lastIndex = getSize() - 1;
        for (int i = 0; i < tillIndex - 1; i++) 
        {
            int temp = getHeap()[0];
            getHeap()[0] = getHeap()[lastIndex - i];
            getHeap()[lastIndex - i] = temp;
            
            fixHeapBelow(0, lastIndex - i - 1);
            
        }
    }
    
    public void insert (int value)
    {
        if (isFull())
            throw new ArrayIndexOutOfBoundsException("array is full");
        
        getHeap()[getSize()] = value;
        fixHeapAbove(getSize());
        setSize(getSize() + 1);
    }
    
    private void fixHeapAbove(int index)
    {
        int newVal = getHeap()[index];
        while (index > 0 && newVal < getHeap()[getParent(index)])
        {
            getHeap()[index] = getHeap()[getParent(index)];
            index = getParent(index);
        }
        getHeap()[index] = newVal; 
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
                    childToswap = getHeap()[rightIndex] < getHeap()[leftIndex]? rightIndex : leftIndex;
                }
                
                if (getHeap()[index] > getHeap()[childToswap])
                {
                    int temp = getHeap()[index];
                    getHeap()[index] = getHeap()[childToswap];
                    getHeap()[childToswap] = temp;
                }
                else
                    break;
                index = childToswap;
            }
            else 
                break;
            
            
        }
        
        
    }
    
    public boolean isFull()
    {
        return getSize() == getHeap().length;
    }
    
    boolean isEmpty()
    {
        return getSize() == 0;
    }
    
    private int getParent (int index)
    {
        return (index - 1)/2;
    }
    
    int getChild (int index, boolean left)
    {
        return 2*index + (left? 1:2);      
    }

    /**
     * @return the heap
     */
    public int[] getHeap() {
        return heap;
    }

    /**
     * @param heap the heap to set
     */
    public void setHeap(int[] heap) {
        this.heap = heap;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}
