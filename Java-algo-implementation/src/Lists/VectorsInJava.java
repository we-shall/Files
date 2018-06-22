/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author vishalsingh
 */
public class VectorsInJava 
{
    public static void main(String[] args)
    {
        //vectors versus the list
        // vectors are used when a thread safe implemenentation is needed
        // vectors are synchronised
        // array list are not synchronised..
        
        List<Employee> vec = new Vector<>();
        vec.add(new Employee(1,"ss","vv"));
        //vectore uses synchronised classes..
        
        
        
        
    }
    
}
