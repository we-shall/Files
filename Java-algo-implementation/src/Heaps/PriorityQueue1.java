/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heaps;

import java.util.PriorityQueue;

/**
 *
 * @author vishalsingh
 */
public class PriorityQueue1
{
    public static void main(String[] args) 
    {
        //priority queue are backed using heapss
        //priority queue uses min heap..
        
        //for using user defined class in pq then we need to implement comparator 
        // now if we want to the queue to behave differently i.e max heap then change comparator as required..
        
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        
        pq.add(10);
        pq.add(11);
        pq.add(0);
        pq.add(-11);
        
        pq.forEach(queue -> System.out.print(" " + queue ));
        
        
        System.out.println("peek " + pq.peek());
        System.out.println("removed" + pq.remove());
        System.out.println("peek " + pq.peek());
        System.out.println("poll: " + pq.poll());
        System.out.println("peek " + pq.peek());
        
        
        
    }
}
