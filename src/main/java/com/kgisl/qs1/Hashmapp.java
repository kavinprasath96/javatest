package com.kgisl.qs1;

import java.util.HashMap;
import java.util.Map;

/**
 * Hashmapp
 */
public class Hashmapp {

    public static void main(String[] args) {
        HashMap<String,Integer> a=new HashMap<String,Integer>();
        a.put("a",1);
        a.put("b", 2);
        a.put("c", 3);
        a.put("d", 1);
        a.put("e", 5);
        a.put(" ", 8);
        a.put("f", 9);
        for(Map.Entry c:a.entrySet()){
            System.out.println(c.getKey()+ " "+c.getValue());
        }
        
        
        
        System.out.println(a);


        
        //add values to hashmapp    

        HashMap<String,String> b=new HashMap<String,String>();
        b.put(" "," ");
        b.put("g", " ");
        b.put("j", " ");

        for(Map.Entry c:b.entrySet()){
            System.out.println(c.getKey()+ " "+c.getValue());
        }
        System.out.println(b);
        }
        
    }