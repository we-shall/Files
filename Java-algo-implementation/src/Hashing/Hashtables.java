/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

/**
 *
 * @author vishalsingh
 */
public class Hashtables {
    
    public static void main(String[] args) {
        
        
        // hash tables are abstract datatypes 
        //abstract data types are those datatypes which are backed up by
        // some or other primary datastructures like arrays, linkedlist.. etc
        
        
        //other names of hashtables is lookup table, hashmaps, dictionary and
        //associative ds...
        
        SimpleHashTable hash = new SimpleHashTable(10);
        hash.put("singh1",new Employee(1,"vsihal","singh1"));
        hash.put("singh12",new Employee(2,"vsihal","singh12"));
        hash.put("singh123",new Employee(3,"vsihal","singh123"));
        hash.put("singh2",new Employee(4,"vsihal","singh2"));
        
        hash.printHashTable();
        
        System.out.println("get singh1 " + hash.retrieve("singh1"));
    }
    
}


class SimpleHashTable {
    
    //backing the hash function with an array..
    
    Employee[] hashtable;

    public SimpleHashTable(int size) {
        hashtable = new Employee[size];
    }
    
    void put (String key, Employee e)
    {  
        if (hashtable[hashKey(key)] != null)
        {
            System.out.println("Element present!!! ");
        }
        else
        {
           hashtable[hashKey(key)] = e;
        }  
    }
    
    
    private int hashKey (String key)
    {
        return key.length()%hashtable.length;
    }
    
    
    Employee retrieve (String key)
    {
        return hashtable[hashKey(key)];
    }
    
    
    
    void printHashTable ()
    {
        for (Employee employee : hashtable) {
            System.out.println(employee);
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