/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import java.util.Arrays;

/**
 *
 * @author vishalsingh
 */
public class HashChallenge1 
{
    
    public static void main(String[] args) 
    {
        int hashtable[] = new int[10];
        int input[] = {59382,43,6894,500,99,-58};
        
        for (int i = 0; i < input.length; i++) 
        {
            hashtable[gethash(input[i])] = input[i];
            System.out.println(gethash(input[i]));
        }
        System.out.println("hashtable" + Arrays.toString(hashtable));
    }
    
    private static int gethash(int num){
        return Math.abs(num%10);
    }
    
}
