package com.kgisl.qs1;

import java.util.Arrays;

/**
 * ArrayMetho
 */
public class ArrayMeth {


int empid;
String name;
float salary;


ArrayMeth(int empid,String name,float salary)
{
    this.empid=empid;
    this.name=name;
    this.salary=salary;

}
   

public int getempid()
{
    return empid;
}
public String getname()
{
return name;
}

public float getsalary()
{
    return salary;
    }

    public String toString()
     {
      return "empid"+empid +"name :"+name+"salary :"+salary;

    }

}