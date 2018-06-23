/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import static java.util.Collections.list;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author vishalsingh
 */
public class LInkedLIstJDK {
    
    public static void main(String[] args) 
    {
        
        //the java jdk uses doubly linked list ...
        // linked list is not synchronised...
        
        LinkedList <Employee> ll = new LinkedList<>();
        //addfirst methods adds employee in starting of the array..
        ll.addFirst(new Employee(1,"vishla","singh"));
        ll.addFirst(new Employee(2,"vishla","singh"));
        ll.addFirst(new Employee(3,"vishla","singh"));
        ll.addFirst(new Employee(4,"vishla","singh"));
        
        ll.forEach(list -> System.out.println(list.toString()));
        
        //the next method is iterator....
        Iterator itr = ll.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
            System.out.print(" <==> ");
        }
        
        //lets add employee from tail for that there is simple method add
        ll.add(new Employee(5,"end","end"));
        ll.forEach(list -> System.out.println(list.toString()));
        
        //removing element from the linked list..
        ll.remove();
        ll.forEach(list -> System.out.println(list.toString()));
        System.out.println(ll.size());
        
        
    }
    
}
