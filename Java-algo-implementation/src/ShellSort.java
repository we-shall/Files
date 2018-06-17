
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishalsingh
 */
public class ShellSort {
    
    public static void main(String[] args) {
        //the gap value will be upper bound of length of array...
        //unstable algorithmmm..
        //also it is better than insertion and selection and bubble
        
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,66,3,4,44,2,77,8,9,13};
        int gap = arr.length;
        gap = gap/2;
        while (gap > 0)
        {
            for (int i = 0; i < arr.length; i++) 
            {
                int j = i - gap;
                int temp = arr[i];
                while (j > 0 && arr[j] > temp )
                {
                    arr[j+gap] = arr[j];
                    j = j - gap;
                }
                arr[j + gap] = temp;
            }
            gap = gap/2;
        }
        System.out.println(Arrays.toString(arr));
        
        
        
    }
    
}
