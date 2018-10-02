/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevitamock;

import java.util.Scanner;

/**
 *
 * @author vishalsingh
 */
public class Product 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner (System.in);
        String[] npq = sc.next().split(",");
        int p = Integer.valueOf(npq[1]);
        int n = Integer.valueOf(npq[0]);
        int q = Integer.valueOf(npq[2]);
        String[] s = sc.next().split(",");
        int set[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            set[i] = Integer.valueOf(s[i]);
        }
        System.out.println(printSubsets(set, p, q));
    }
    
    static int printSubsets(int set[],int p, int q)
    {
        int n = set.length;
        int multiply = 1;
        int count = 0;
        for (int i = 0; i < (1<<n); i++)
        {
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0)
                {
                    multiply *= set[j];
                }
            if (multiply % (p*q) == 0)
                count ++;
            multiply = 1;
        }
        return count;
    }
}
