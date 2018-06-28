/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author vishalsingh
 */
public class HashtableJava 
{
    public static void main(String[] args)
    {
        HashMap<String,Employee> hash = new HashMap<>();
        
        hash.put("singh1",new Employee(1,"vsihal","singh1"));
        hash.put("singh12",new Employee(2,"vsihal","singh12"));
        hash.put("singh123",new Employee(3,"vsihal","singh123"));
        hash.put("singh2",new Employee(4,"vsihal","singh2"));
        hash.put("singh3",new Employee(5,"vsihal","singh3"));
        
//        Iterator<Employee> itr = hash.values().iterator();
//        while (itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }
//        

        hash.forEach((key,value) -> System.out.println("key:: " + key + ", value " + value ));
        System.out.println(hash.get("hell"));
        //getting the default value..
        System.out.println(hash.getOrDefault("hell",new Employee(5,"vsihal","singh3") ));
        
        
        //now to check whether a hash consist of number or not...
        System.out.println("contains ? " + hash.containsKey("singh1"));
        System.out.println("contains ? " + hash.containsValue(new Employee(5,"vsihal","singh3")));
        
        
        System.out.println("removinggg" + hash.remove("singh2"));
        hash.forEach((key,value) -> System.out.println("key:: " + key + ", value " + value ));

        // then we have a replace classs...
        
    }
}
