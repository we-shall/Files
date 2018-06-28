/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

/**
 *
 * @author vishalsingh
 */
public class CircularQueue {
    
    public static void main(String[] args) throws Exception 
    {
        ArrayCircularQueue queue = new ArrayCircularQueue(10);
        queue.enqueue(new Employee(1,"vishal","singh"));
        queue.enqueue(new Employee(2,"vishal","singh"));
        queue.enqueue(new Employee(3,"vishal","singh"));
        queue.enqueue(new Employee(4,"vishal","singh"));
        
        //queue.printAll();
        
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        
        
        queue.enqueue(new Employee(1,"vishal","singh"));
        queue.enqueue(new Employee(2,"vishal","singh"));
        queue.printAll();
        
        
        
    }
    
}


class ArrayCircularQueue{
    
    private Employee[] queue;
    private int front;
    private int back;
    
    ArrayCircularQueue (int size)
    {
        queue = new Employee[size];
    }
    
    void enqueue (Employee e)
    {
        
        //modifying the code for circul
        if (getCount() == queue.length-1){
            //expand the array
            int numItems = getCount();
            Employee[] newArray = new Employee[2*queue.length];
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length-front, back);
            queue = newArray;
            front = 0;
            back = numItems;
            
        } 
        queue[back] = e;
        
        if (queue.length - 1 > back)
            back++;
        else
            back = 0;
    }
    
    Employee dequeue () throws Exception
    {
        //removing element from the front
        
        if (getCount()== 0){
            throw new Exception();
        }
        Employee ele = queue[front];
        queue[front++] = null;
        if (getCount() ==0 ) {
            front = 0;
            back = 0;
        }
        else if (front == queue.length){
            front = 0;
        }
        return ele;
    }
    
    int getCount ()
    {
        if (front <= back)
            return back - front;
        
        return back - front + queue.length;
    }
    
    void printAll ()
    {
        if (front <= back)
            for (int i = front; i < back; i++) {
                System.out.print("  " + queue[i]);
            }   
        else{
            for (int i = front; i < queue.length; i++) {
                System.out.print("  " + queue[i]);
            } 
            for (int i = 0; i < back; i++) {
                System.out.print("  " + queue[i]);
            } 
            
        }
        
    }
}























