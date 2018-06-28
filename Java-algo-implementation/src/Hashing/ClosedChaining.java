/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import java.util.LinkedList;

/**
 *
 * @author vishalsingh
 */
public class ClosedChaining 
{
    public static void main(String[] args) 
    {
        ChainedHashTable hash = new ChainedHashTable(10);
        hash.put("singh1",new Employee(1,"vsihal","singh1"));
        hash.put("singh12",new Employee(2,"vsihal","singh12"));
        hash.put("singh123",new Employee(3,"vsihal","singh123"));
        hash.put("singh2",new Employee(4,"vsihal","singh2"));
        hash.put("singh3",new Employee(5,"vsihal","singh3"));
        
        hash.printHash();
        
        System.out.println("get element ::" + hash.get("singh3"));
        System.out.println("get element ::" + hash.remove("singh3"));
        
        hash.printHash();
        
        
    }
    
}

class StoredEmployee 
{
    public Employee emp;
    public String key;
    
    StoredEmployee(Employee emp, String key)
    {
        this.emp = emp;
        this.key = key;
    }
}

class ChainedHashTable
{
    private LinkedList<StoredEmployee>[] hashtable;
    
    public ChainedHashTable(int size)
    {
        hashtable = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            hashtable[i] = new LinkedList<>();
        }
    }
    
    
    private int hashKey (String key)
    {
        return key.length()%hashtable.length;
    }
    
    void put (String key, Employee emp )
    {
        int index = hashKey(key);
        hashtable[index].add(new StoredEmployee(emp, key));
    }
    
    Employee get(String key){
        LinkedList<StoredEmployee> stremp = hashtable[hashKey(key)];
        for (StoredEmployee storedEmployee : stremp) {
            if (storedEmployee.key.equals(key))
                return storedEmployee.emp;
        }
        return null;
    }
    
    Employee remove (String key)
    {
        LinkedList<StoredEmployee> stremp = hashtable[hashKey(key)];
        for (StoredEmployee storedEmployee : stremp) {
            if (storedEmployee.key.equals(key))
            {
                stremp.remove(storedEmployee);
                return storedEmployee.emp;
            }
        }
        return null;
    }
    
    void printHash(){
        for (int i = 0; i < hashtable.length; i++) {
            System.out.print("" + (i+1));
            for (int j = 0; j < hashtable[i].size(); j++) {
                System.out.print(" => " + hashtable[i].get(j).emp);
            }
            System.out.println("");
        }
    }
}

