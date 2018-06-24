/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author vishalsingh
 */
public class StackChallenge {
    
    //whether a string palindrome or not using stack....
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a string to find whether it is a palindrome or not");
        
        String str = "E car race!!" ;        
        StackLinkedList1 stack = new StackLinkedList1();
        StringBuilder nopunct = new StringBuilder(str.length());
        str = str.toLowerCase();
        
        
        for (int i = 0; i < str.length(); i ++)
        {
            char c = str.charAt(i);
            if (c  >= 'a' && c <= 'z'){
                stack.push(c);
                nopunct.append(c);
            }
            
        }
        
        String s = nopunct.toString();
        int flag = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != stack.pop()){
                System.out.println("Not a palindrome");
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println("palindrome number");
        }
        
        
    }
    
}

 class StackLinkedList1 {
    private LinkedList<Character> emp;

    public StackLinkedList1() {
        emp = new LinkedList<>();
    }
    
    void push(char e){
        emp.push(e);
    }
    
    char pop (){
        return emp.pop();
    }
    
    char peek(){
        return emp.peek();
    }
    
    boolean isEmpty(){
        return emp.isEmpty();
    }
    
    void printAll (){
        Iterator<Character> itr = emp.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
        
    }
    
    
    
}
