class Employee 
{ 
static int a=10;
public static void main(String arg[])
  {
 int b= Employee.increment();
 System.out.println(b);
 Employee ob=new Employee();
 int c= ob.decrement();
System.out.println(c);
  }

   static int increment()
   {
    a=a+1;
return a;
   } 
   
    static int decrement()
   {
   a=a-1;
return a;
   }
}