package com.kgisl.qs1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Employee1
 */
public class Employee1 {

    public static void main(String[] args) {

        List<Employee> details= Arrays.asList(new Employee(2, "Kavin", 100),new Employee(1, "Prasath", 200),
        new Employee(3, "Gowtham", 50));

        List<Employee> s = details.stream().sorted(Comparator.comparing(Employee::getempid))
        .collect(Collectors.toList());
        
        s.forEach(System.out::println);
        

        
    }
}