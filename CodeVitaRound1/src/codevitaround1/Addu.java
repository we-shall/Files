/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevitaround1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vishalsingh
 */
public class Addu {
    
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
         char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
         System.out.println(arr.length);
         String number = "1234";
         ArrayList<String> possibleSeq = new ArrayList<>();
         for (int i = 0; i < number.length(); i++) 
         {
            for (int j = i + 1; j <= number.length(); j ++)
            {
                String temp = number.substring(i,j);
                if (temp.length() < 3)
                    System.out.println(temp);
            }
         }
         
         
    }
    
}
