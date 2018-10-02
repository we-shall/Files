/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevitamock;

/**
 *
 * @author vishalsingh
 */
public class Sanj 
{
    
    static int maxL(int[][] arr)
    {
        
        //auxillary arrays ...
        int vertical[][] = new int[arr.length][arr[0].length];
        int horizontal[][] = new int[arr.length][arr[0].length];
        
        for(int i = 0; i < arr.length; i ++)
        {
            vertical[i][0] = arr[i][0];    
        }
        
        for(int i = 0; i < arr[0].length; i ++)
        {
            horizontal[0][i] = arr[0][i];    
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 1; j < arr[0].length; j++) 
            {
                if (arr[i][j] == 1)
                {
                    horizontal[i][j] = horizontal[i][j-1] + 1;
                }
                else
                {
                    horizontal[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < arr[0].length; i++)
        {
            for (int j = 1; j < arr.length; j++) 
            {
                if (arr[j][i] == 1)
                {
                    vertical[j][i] = vertical[j-1][i] + 1;
                }
                else
                {
                    vertical[j][i] = 0;
                }
        
            }
        }
        int min = -999999;
        for(int i = 0; i < arr.length; i ++)
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                min = Math.max(min, Math.min(vertical[i][j], horizontal[i][j]));
            }
        }
        
        if (min > 0)
        {
            return 2*(min-1) + 4;
        }
        
        
        
        
        
        return 0;
    }
    
    public static void main(String[] args) 
    {
        int mat[][] = {{1,0,0,1,0},{1,1,0,1,0},{1,0,0,1,1},{1,1,0,0,0},{0,0,0,0,0},{1,0,1,1,1},{1,0,1,0,0},{1,1,0,1,1}};
        System.out.println("  " + maxL(mat));
       
        
    }
    
}
