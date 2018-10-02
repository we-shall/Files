/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevitamock;
import java.util.*;
/**
 *
 * @author vishalsingh
 */
public class MockVita3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String str[] = sc.next().split(",");
        //System.out.println("len:" +str.length);
        int arr[] = new int[N];
        for (int i = 0; i < N; i ++ )
        {
            arr[i] = Integer.valueOf(str[i]);
        }
       int[] cal = covertToBaseSum(arr);
       
       int count = 0;
       for (int i = 0; i < N; i ++)
       {
           for(int j = i + 1; j < N ; j ++)
           {
               if (i < j && cal[i] > cal[j])
                   count ++;
           }
       }
       System.out.println(count);
       
    }
    
    static int[] covertToBaseSum(int arr[])
    {
        int[] base6 = new int[arr.length];
        int num = 0;
        int temp;
        for (int i =0; i < arr.length; i ++)
        {
            num = 0;
            temp = arr[i];
            while (temp != 0)
            {
                num += temp - (temp/6)*6;
                temp = temp/6;
            }
            arr[i] = num;
            //System.out.println("i " + i + " temp " + arr[i]);
        }
        return arr;
    }
}
