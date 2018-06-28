/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sets;

import java.util.TreeSet;

/**
 *
 * @author vishalsingh
 */
public class SetImplementation 
{
    
    public static void main(String[] args) 
    {
        //a collection which has no duplicates...
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(0);
        
        set.forEach(action -> System.out.println(action)); 
        
    }
    
}
