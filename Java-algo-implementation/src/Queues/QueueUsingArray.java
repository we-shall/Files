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
public class QueueUsingArray 
{    
    public static void main(String[] args) throws Exception 
    {
        ArrayQueue queue = new ArrayQueue(10);
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

class ArrayQueue{
    
    private Employee[] queue;
    private int front;
    private int back;
    
    ArrayQueue (int size){
        queue = new Employee[size];
    }
    
    void enqueue (Employee e){
        
        //modifying the code for circul
        if (back == queue.length){
            //expand the array
            Employee[] newArray = new Employee[2*queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        } 
        queue[back ++] = e;
    }
    
    Employee dequeue () throws Exception{
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
        return ele;
    }
    
    int getCount (){
        return back - front;
    }
    
    void printAll (){
        for (int i = front; i < back; i++) {
            System.out.print("  " + queue[i]);
        }
    }
}



























class Employee {
    
    private int id;
    private String fname;
    private String lname;
    
    Employee (int id, String fname, String lname)
    {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
    @Override
    public String toString()
    {
        return id + "  " + fname + "  " + lname;
    }
    
    public boolean equals (Object o){
        if (o == this)
            return true;
        if (!(o instanceof Employee))
            return false;
        
        Employee e = (Employee) o;
        
        return e.fname == fname && e.lname == lname && e.id == id;
    }
    
}
