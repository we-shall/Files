/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevitamock;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author vishalsingh
 */
public class Prac5 
{
    
    public static void main(String[] args) 
    {
        String row[] = {"S","NP","VP","N","V","P","PN","D"};
        String column[] = {"championship","ball","toss","is","want","won","played","me","I","you","India","Australia","Steve","John","the","a","an"};
        String[][] entries = {{"","","","S->NP VP","S->NP VP","S->NP VP","S->NP VP","S->NP VP","S->NP VP","S->NP VP","S->NP VP","S->NP VP","S->NP VP","S->NP VP","S->NP VP","S->NP VP","S->NP VP"},
                              {"","","","","","","","","NP->P","NP->P","NP->P","NP->PN","NP->PN","NP->PN","NP->PN","NP->D N","NP->D N","NP->D N"},
                              {"","","","VP->V NP","VP->V NP","VP->V NP","VP->V NP","","","","","","","","","",""},
                              {"N->championship","N->ball","N->toss","","","","","","","","","","","","","",""},
                              {"","","","V->is","V->want","V->won","V->played","","","","","","","","","",""},
                              {"","","","","","","","P->me","P->I","P->you","","","","","","",""},
                              {"","","","","","","","","","","PN->India","PN->Australia","PN->steve","PN->John","","",""},
                              {"","","","","","","","","","","","","","","D->the","D->a","D->an"}};
    
    
        System.out.println(entries.length);
        for (int i = 0; i < entries.length; i++) 
        {
            System.out.println(entries[0].length);
        }
        
        
        HashMap<String,String> parser = new HashMap<>();
        
        //System.out.println(entries.length);
        for (int i = 0; i < entries.length; i++) 
        {
            for (int j = 0; j < entries[0].length; j++) 
            {
                parser.put(row[i] + "," + column[j], entries[i][j]);
            }
        }
        
        String inputString = "India won the championship $";
        LinkedList<String> stack = new LinkedList<>();
        stack.push("$");
        stack.push("S");
        int count = 0;
        String[] str = inputString.split(" ");
//        for (int i = 0; i < str.length ; i++) 
int i=0;

            while(i<str.length)
        {
            if(str[i].equalsIgnorseCase(stack.peek()))
            {
                i++;
                stack.pop();
            }
            else
            {
                String val = stack.pop();
                
                String getRel = parser.get(val+","+str[i]);
                String arr[] = getRel.split("->");
                if (!getRel.equals("") && arr[1].contains(" "))
                {
                String[] push = arr[1].split(" ");
                if (push.length > 1)
                    for (int j = 0; j < push.length; j++) 
                    {
                        stack.push(push[i]);
                    }
                
                
                }
                
            }
            
            
        }
        stack.pop();
        
        if(count == str.length && stack.isEmpty())
        {
            System.out.println("matcheddd");
        }
        else
        {
            System.out.println("nope!");
        }
        
        
        
        
    
    }
}
