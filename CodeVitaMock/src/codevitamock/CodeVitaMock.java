/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevitamock;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vishalsingh
 *
 */
public class CodeVitaMock {

    public static void main(String[] args) 
    {
     Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();
     int lines1[] = new int[n];
     int lines2[] = new int[n];
     int lines3[] = new int[n];
     for (int i = 0; i < n; i ++)
     {
         lines1[i] = sc.nextInt();
         lines2[i] = lines3[i] = lines1[i];
      }
     //aim to find number of parallel lines
//     for (int i = 0; i < n; i ++)
//     {
//         if (lines[i] != 1000)
//         for (int j = i + 1; j < n; j++) 
//         {
//             if (lines[i] == lines[j])
//                 lines[i] = 1000;
//         }
//     }
//     
//     Arrays.sort(lines);
//     int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (lines[i] == 1000)
//            {
//                break;
//            }
//            count ++;
//        }
//        
//     System.out.println (combination(count,3));
        int[] nw = new int[3*n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (lines1[i] != lines2[j] && lines2[j] != lines2[k] && lines3[k] != lines1[i])
                    {
                        count ++;
                        lines1[i] = lines2[j] = lines3[k] = 1000;
                    }
                }
            }
            
        }
        System.out.println(count);
     
     
    }
    
    static int combination (int n, int r)
    {
        if (n < r)
            return 0;
        if (n == r)
            return 1;
        return factorial(n)/(factorial(r)*factorial(n-r));
        
    }
    
    static int factorial (int num)
    {
        int f = 1;
        if (num == 0 || num == 1)
            return 1;
        for (int i = 1; i <= num; i++) 
        {
            f *= i;
        }
        return f;
    }
    
}
