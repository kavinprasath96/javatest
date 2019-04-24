package com.kgisl.qs1;

import java.util.Arrays;
import java.util.List;

/**
 * Comma
 */
public class Comma {

    public static void main(String[] args) {
        
String a= "Erode,Salem,Covai";

List<String> b=Arrays.asList(a.split("\\s*,\\s*"));

System.out.println(b);


    }
}