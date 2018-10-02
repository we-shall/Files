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
public class Sequence 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = sc.next().split(",");
        int arr[] = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) 
        {
            count = 0;
            String temp  = Integer.toBinaryString(Integer.valueOf(str[i]));
            for (int j = 0; j < temp.length(); j++)
                if (temp.charAt(j) == '1')
                    count ++;
            arr[i] = count;
        }
        count = 0;
        for (int i = 0; i < N; i++) 
        {
            for(int j = 0; j < N; j ++)
            {
                if (i < j && arr[i] > arr[j])
                    count ++;
            }
        }
        System.out.println(count);
        
    }
    
}
