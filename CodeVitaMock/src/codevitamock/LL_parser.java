/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevitamock;

import java.util.HashMap;

/**
 *
 * @author vishalsingh
 */
public class LL_parser 
{
    
    void calculateFirst(String[] production)
    {
        HashMap<String,String> first = new HashMap<>();
        for (int i = 0; i < production.length; i++) 
        {
            String[] sep = production[i].split("->");
            String firstval = "";
            
            for (int j = 0; j < sep[1].split("|").length; j++) 
            {
                String[] val = sep[1].split("|");
                
                if(first.containsKey(val[i]))
                {
                    //do nothing
                    firstval += first.get(val[i]);
                    break;
                    
                    
                }
                else
                {
                    firstval += 
                            
                }
            }
        }

    }
    
    
    
    public static void main(String[] args) 
    {
       String[] production = {"A->a|b","B->Ca|c","C->d|#"};
       
    }
    
}
