/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author vishalsingh
 */
public class StackImplementationLL 
{
    
    public static void main(String[] args) 
    {
        StackLinkedList stack = new StackLinkedList();
        stack.push(new Employee(1,"vsihak","singh"));
        stack.push(new Employee(2,"vsihak","singh"));
        stack.push(new Employee(3,"vsihak","singh"));
        stack.push(new Employee(4,"vsihak","singh"));
        
        Employee pop = stack.pop();
        Employee peek = stack.peek();
        System.out.println("pop:" + pop.toString() + " peek " + peek.toString());
        stack.printAll();
        
        
    }
    
}


class StackLinkedList {
    private LinkedList<Employee> emp;

    public StackLinkedList() {
        emp = new LinkedList<>();
    }
    
    void push(Employee e){
        emp.push(e);
    }
    
    Employee pop (){
        return emp.pop();
    }
    
    Employee peek(){
        return emp.peek();
    }
    
    boolean isEmpty(){
        return emp.isEmpty();
    }
    
    void printAll (){
        Iterator<Employee> itr = emp.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
        
    }
    
    
    
}