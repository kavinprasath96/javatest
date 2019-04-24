package com.kgisl.qs1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ArrayMetho
 */
public class ArrayMetho {

    public static void main(String[] args) {

        List<ArrayMeth> a=Arrays.asList(new ArrayMeth(1, "a", 100),new ArrayMeth(2,"b",200),
        new ArrayMeth(3, "c", 300));


        System.out.println(Arrays.asList(a)); 
        

     
    }
}