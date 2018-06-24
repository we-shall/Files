/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.EmptyStackException;

/**
 *
 * @author vishalsingh
 */
public class StackUsingArray {
    
    
    public static void main(String[] args) 
    {
        
        ArrayStack stack  = new ArrayStack(20);
        stack.push(new Employee(1,"vsihak","singh"));
        stack.push(new Employee(2,"vsihak","singh"));
        stack.push(new Employee(3,"vsihak","singh"));
        stack.push(new Employee(4,"vsihak","singh"));
        
        stack.printStack();
        
        
        Employee poppedElement = stack.pop();
        System.out.println("popped element ::: " + poppedElement.toString());
        
        Employee peekElement = stack.peek();
        System.out.println("peek element ::: " + peekElement.toString());
        
    }
    
    
    
}



class ArrayStack {
    private int top;
    Employee stack[];
    
    ArrayStack(int capacity)
    {
        stack = new Employee[capacity];
        top = -1;
    }
    
    boolean isEmpty ()
    {
        return top == -1;
    }
    
    void push (Employee element)
    {
        if (stack.length == top){
            //then we need to reinitialise an array
            Employee[] newStack = new Employee[2*stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        
        stack[++top] = element;
    }
    
    Employee pop ()
    {
        if (top == -1){
            System.out.println("no element in the stack");
            throw new EmptyStackException();
        }
        
        Employee re = stack[top];
        stack[top--] = null;
        return re;
    }
    
    Employee peek()
    {
        if (top == -1){
             System.out.println("no element in the stack");
            return null;
        }
        return stack[top];
    }
    
    int getTop()
    {
        return top;
    }
    
    void printStack ()
    {
        for (int i = 0; i <= top; i++) {
            System.out.print(" " + stack[i]);
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