/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

import java.util.LinkedList;

/**
 *
 * @author vishalsingh
 */
public class ChallengeQueue 
{
    public static void main(String[] args) 
    {
        String str = "hello. olleh,";
        str = str.replaceAll("[\\s,.]", "").toLowerCase();
        System.out.println(str);
        
       LinkedList <Character> stack = new LinkedList<>();
       LinkedList <Character> queue = new LinkedList<>();
       
        for (int i = 0; i < str.length(); i++) 
        {
            stack.push(str.charAt(i));
            queue.addLast(str.charAt(i));
        }
        int flag = 0;
        while (!stack.isEmpty()){
            if (!stack.pop().equals(queue.removeFirst()))
            {
                System.out.println("Not a palindrome");
                flag = 1;
                break;
            }
                
        }
        if (flag == 0)
            System.out.println("Palindrome number");
    }
}
