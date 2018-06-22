/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vishalsingh
 */
public class ArrayListImple {
    
    public static void main(String[] args)
    {
        //the constructor of array list takes a size 10 as default value...
        //ArrayList arr = new ArrayList<>(input the size );
        
        
        List <Employee> emplist = new ArrayList<>();
        emplist.add(new Employee(1,"vishal1","singh"));
        emplist.add(new Employee(2,"vishal2","singh"));
        emplist.add(new Employee(3,"vishal3","singh"));
        emplist.add(new Employee(4,"vishal4","singh"));
        
        emplist.forEach(employee -> System.out.println(employee));
        
        //getting data by providing the position 
        
        System.out.println(emplist.get(0));
        
        //to check whether the list is empty or not...
        
        System.out.println(emplist.isEmpty());
        
        // to change the element in list at some postion then...
        
        emplist.set(1, new Employee(1,"vishal5","singh"));
        
        //then comes the employee list size printing
        
        int size = emplist.size();
        
        // shifting element by adding some of element at some provided position
        
        emplist.add(1,new Employee(5,"singh","sbsb"));
        
        //now converting a list to array
        
        Employee[] array = emplist.toArray(new Employee[emplist.size()]);
        for (Employee object : array) 
        {
            System.out.println(object);
        }
        
        
        //checking whether a data is present in the array or not ....
        
        System.out.println(emplist.contains(new Employee(1,"vishal1","singh")));
        
        // now for checking the index of particular entry of element in the list...
        
        System.out.println(emplist.indexOf(new Employee(1,"vishal1","singh")));
        
        //removinf element from list
        boolean e = emplist.remove(new Employee(1,"vsihal","sinfh"));
        Employee e1 = emplist.remove(0);
        
        
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
    
}