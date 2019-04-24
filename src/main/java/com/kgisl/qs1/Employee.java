package com.kgisl.qs1;

/**
 * Sort
 */
public class Employee {

        int empid;
        String name;
        float salary;
        

    
    Employee(int empid,String name,float salary){

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
  public float salary()
  {
      return salary;

  }
  public String toString()
  {
      return "Emp id" +empid +"Name"+name+"Salary :"+salary;
  }

}