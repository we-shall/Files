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
public class LinearProbing
{
    public static void main(String[] args) 
    {
        LinearTable hash = new LinearTable(10);
        hash.put("singh1",new Employee(1,"vsihal","singh1"));
        hash.put("singh12",new Employee(2,"vsihal","singh12"));
        hash.put("singh123",new Employee(3,"vsihal","singh123"));
        hash.put("singh2",new Employee(4,"vsihal","singh2"));
        hash.put("singh3",new Employee(5,"vsihal","singh3"));
        
        hash.printHashTable();
        
        System.out.println("retrieve element.." + hash.retrieve("singh3"));
    }
}


class LinearTable {
    
    //backing the hash function with an array..
    
    Employee[] hashtable;

    public LinearTable(int size) {
        hashtable = new Employee[size];
    }
    
    void put (String key, Employee e)
    {  
        int hashedkey = hashKey(key);
        
        if (occupied(hashedkey))
        {
            int stopindex = hashedkey;
            if (hashedkey == hashtable.length-1){
                hashedkey = 0;
            }
            else
            {
                hashedkey ++;
            }
            
            while (occupied(hashedkey) && stopindex != hashedkey)
                hashedkey = (hashedkey + 1) % hashtable.length;
        }

        if (occupied(hashedkey))
        {
            System.out.println("no room present for the element!!! ");
        }
        else
        {
           hashtable[hashedkey] = e;
        }  
    }
    
    boolean occupied (int hashedkey)
    {
        return hashtable[hashedkey] != null;
    }
    
    
    private int hashKey (String key)
    {
        return key.length()%hashtable.length;
    }
    
    
    Employee retrieve (String key)
    {
        if (findKey(key) == -1)
            return null;
        return hashtable[findKey(key)];
    }
    
    int findKey (String key)
    {
        //returns the index where data is present...
        int index = hashKey(key);
        int count = 0;
        while (hashtable[index] != null && !hashtable[index].getLname().equals(key))
        {
            index = (index+1)%hashtable.length;
            count ++;
            if (count == hashtable.length)
                return -1;
        }
        return index;
    }
    
    void printHashTable ()
    {
        for (Employee employee : hashtable) 
        {
            System.out.println(employee);
        }
    }    
}