 class Overloading{
 public static void main(String[] arg)
  {
 Example ob = new Example();
 ob.detail("Mohammad saad",22,86,'B');
 ob.detail(844263,21700);
  }
 }
  class Example
 {
     String name;
     int age;
     int roll;
     char sec;
     int empId;
     int salary;
      void detail(String name,int age,int roll,char sec)
     {
      this.name=name;
      this.age=age;
      this.roll=roll;
      this.sec=sec;
      System.out.println("Name is "+ name + "age is "+ age +"Roll no.is "+ roll +"section is "+ sec);  
     }
     void detail(int emId,int salary)
     {
      empId=emId;
      this.salary=salary;
      System.out.println("salary = "+ salary + "Employee ID = " +empId);
     }
 }