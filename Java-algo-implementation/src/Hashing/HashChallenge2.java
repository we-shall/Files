/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author vishalsingh
 */
public class HashChallenge2 {
    
    public static void main(String[] args) 
    {
        LinkedList<Employee> ll = new LinkedList<>();
        ll.add(new Employee(1,"vishal","singh"));
        ll.add(new Employee(2,"vishal","singh"));
        ll.add(new Employee(3,"vishal","singh"));
        ll.add(new Employee(1,"vishal","singh"));
        ll.add(new Employee(3,"vishal","singh"));
         
        //ll.forEach(l -> System.out.println(l));
        
        HashMap<Integer,Employee> hash = new HashMap<>();
        List<Employee> remove = new ArrayList<>();
        
        for (Employee employee : ll) 
        {
            if (hash.containsKey(employee.getId()))
            {
                remove.add(employee);
            }
            else
            {
                hash.put(employee.getId(), employee);
            }
        }
        
        for (Employee employee : remove) {
            ll.remove(employee);
        }
        
        
        ll.forEach(l -> System.out.println(l));
  
    }
    
    
}
