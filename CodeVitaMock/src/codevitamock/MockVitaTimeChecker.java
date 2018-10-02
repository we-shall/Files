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
public class MockVitaTimeChecker 
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            String[] str = sc.next().split(",");
            int[] arr = new int[10];
            for (int i = 0; i < str.length; i ++)
                arr[Integer.valueOf(str[i])]++;
            
            int k = 0;
            for (int i = 0; i < 10; i ++)
            {
                while (arr[i] > 0)
                {
                    str[k ++] = String.valueOf(i);
                    arr[i] --;
                }
            }
            
            String hour = findMyMaxHour(str);
//            System.out.println(hour);
//            System.out.println(Arrays.toString(str));
//            
            String min = findMyMaxMin(hour,str);
//            
//            System.out.println(min);
//            System.out.println(Arrays.toString(str));
            
            String second = findMyMaxMin(hour,str);
            if (hour.length() < 2 || min.length() < 2 || second.length() < 2)
            {
                System.out.println("Impossible");  
            }
            else
                System.out.println(hour + ":" + min +":" + second);
            
            
            
    }

    
    
    private static String findMyMaxHour(String[] str)
    {
        // first digit
        String s = "";
        for (int i = str.length - 1 ; i >= 0; i --)
        {
            if (Integer.valueOf(str[i]) == 2 || Integer.valueOf(str[i]) == 1 || Integer.valueOf(str[i]) == 0)
            {
                s = str[i];
                str[i] = "$";
                break;
            }   
        }
        
        for (int i = str.length - 1; i >= 0; i -- )
        {
            if (s.equals("2"))
            {
                if (Integer.valueOf(str[i]) <= 4)
                {
                    s += str[i] + ":";
                    str[i] = "$";
                    break;
                }
            }
            else if (s.equals("1") || s.equals("0"))
            {
                if (Integer.valueOf(str[i]) <= 9)
                {
                    s += str[i];
                    str[i] = "$";
                    break;
                }
            }
        }
        return s;
    }

    private static String findMyMaxMin(String hour, String[] str) 
    {
        String s = "";
        
        
        for (int i = str.length - 1 ; i >= 0; i --)
        {
            if (!str[i].equals("$") && Integer.valueOf(str[i]) <= 5)
            {
                s = str[i];
                str[i] = "$";
                break;
            }   
        }
        
        for (int i = str.length - 1; i >= 0; i -- )
        {
                if (!str[i].equals("$") && Integer.valueOf(str[i]) <= 9)
                {
                    s += str[i];
                    str[i] = "$";
                    break;
                }
         
        }
        return s;
        
    }

    
}
