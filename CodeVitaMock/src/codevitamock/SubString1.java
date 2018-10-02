/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevitamock;

import java.util.HashSet;

/**
 *
 * @author vishalsingh
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SubString1 {

    static Set<String> s ;
    static String A ;
    static String B ;
    static String S ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = new HashSet<>();
        A = sc.next();
        B = sc.next();
        S = sc.next();
        getRes(0,S.length()-1);
        System.out.println(s.size());
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private static void getRes(int l, int r) {
        if(l>r)
            return;
        String er = S.substring(l, r+1);
        if(er.contains(A) && er.contains(B)){
            if(!s.contains(er)){
                s.add(er);
                getRes(l+1,r-1);
                getRes(l+1,r);
                getRes(l,r-1);
            }
        }
    }
    
}