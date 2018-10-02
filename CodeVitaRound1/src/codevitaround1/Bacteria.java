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
public class Bacteria 
{
   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.next());
        for (int t = 0; t < test; t ++)
        {
        String str[] = sc.nextLine().split(" ");
            System.out.println("str" + str[0]);
            int arr1[]=new int[str.length];
            for(int i1=0;i1<str.length;i1++){
            arr1[i1]=Integer.parseInt(str[i1]);
            }
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[][] arr = new int[N][M];
       
        for (int i = 0; i < N; i ++)
        {
            char[] temp = sc.next().toCharArray();
            for (int j = 0; j < M; j ++)
            {
                arr[i][j] = (int)(temp[j] - '0');
            }
        }
        
        for(int i = 0; i < N; i ++)
        {
            for (int j = 0; j < M; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        
        }
    }

}
