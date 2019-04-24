package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Arraystring
 */
public class Arraystring {

        public static void main(String[] args) {

        ArrayList<String>  a=new ArrayList<String>();
        a.add("a");
        a.add("b");
        a.add("c");

        String array[] = new String[a.size()]; 
        for(int j =0;j<a.size();j++)
        {
            array[j] = a.get(j);
          }
  
       
          for(String k: array)
          {
              System.out.println(k);
          }
      }
  }