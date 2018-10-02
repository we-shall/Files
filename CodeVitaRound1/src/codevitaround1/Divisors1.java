/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevitaround1;

import java.util.Scanner;

/**
 *
 * @author vishalsingh
 */
public class Divisors1 
{
    
    public static int GCD(int a, int b)
    {
        if (a == 0)
          return b;
        return GCD(b%a, a);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int v;
        //System.out.println(GCD(10,15));
        for (int i = 1; i < N; i ++)
        {
           v = GCD(N,i);
           if (v == 1)
                count ++;
        }
        
        System.out.println(count);
    }
}
