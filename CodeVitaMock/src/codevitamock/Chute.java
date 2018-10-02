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
public class Chute {
    
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        String[] mn = sc.next().split(",");
        int m = Integer.valueOf(mn[0]);
        int n = Integer.valueOf(mn[1]);
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) 
        {
            String[] temp = sc.next().split(",");
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = Integer.valueOf(temp[j]);
            }
        }
        
        
        String num = "";
          for (int i = 0; i < m; i++) 
          {
              for (int j = 0; j < n; j++) 
              {
                  num += findMax(arr,m,n);
              }
        }
          System.out.println(num);
          
//          for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("");
//        }
        
    }
    
    static String findMax (int arr[][],int m, int n)
    {
        int max = -9999, index = -1;
        for (int i = 0; i < m; i++) 
        {
            if (max < arr[i][n-1])
            {
                max = arr[i][n-1];
                index = i;
            }
        }
        for (int i = n-1; i >= 0; i--) 
         {
             if (i > 0)
                arr[index][i] = arr[index][i-1];
             else
                 arr[index][i] = -999;
        }
        
        return Integer.toString(max);
    }
}
