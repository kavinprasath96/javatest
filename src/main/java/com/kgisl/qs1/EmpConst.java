package com.kgisl.qs1;

/**
 * Construct
 */
public class EmpConst {

    public   int empid;
    public String name;
    public double salary;

    
   public  EmpConst(int empid,String name, double salary) {
       this.empid = empid;
       this.name = name;
       this.salary = salary;
    }

    public EmpConst()
    {
        this(1);
        System.out.println("present");
    }
    public EmpConst(int empid) {

        this(empid, 10);
        System.out.println("Absent");
 
    }
 
    public EmpConst(int empid, double salary) {
        this(empid, "A", salary);
    }

    void display(){
  
        System.out.println("Emp id :"+empid +"Name :"+name+ "Salary :"+salary);
    }
    public static void main(String[] args) {
        EmpConst s = new EmpConst();
        s.display();
    }
}