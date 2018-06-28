/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingAlgos;

/**
 *
 * @author vishalsingh
 */
public class LinearSearch {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6,7,8};
        System.out.println("index ::" + findindex(5, arr));
        
        
    }
    
    public static int findindex(int num, int[] arry){
        for (int i = 0; i < arry.length; i++) {
            if (num == arry[i])
                return i;
        }
        return -1;
    }
}
