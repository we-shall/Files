/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevitamock;


import java.util.*;
import java.lang.*;
/**
 *
 * @author vishalsingh
 */
public class Sum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String line1[] = sc.next().split(",");
        int N = Integer.valueOf(line1[0]);
        int K = Integer.valueOf(line1[1]);
        
        String line2[] = sc.next().split(",");
        int arr[] = new int[N];
        for (int i = 0; i < N; i ++)
        {
            arr[i] = Integer.valueOf(line2[i]);
        }
        
        
        int count = 0;
        for (int i = 0; i < N; i++) 
        {
            for (int j = i + 1; j < N; j++) 
            {
                for (int k = j + 1; k < N; k++) 
                {
                    if ((arr[i] + arr[j] + arr[k])%K == 0)
                        count ++;
                }
            }
        }
        System.out.println(count);
        
    }
}
