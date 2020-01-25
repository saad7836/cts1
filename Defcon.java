class Defcon{
public static void main(String[] arg)
{
Employee ob=new Employee();
Employee ob2=new Employee();
ob2.display(123,"MOHAMMAD SAAD");
}

}
class Employee
{
int id;
String name;
Employee()
{
System.out.println("hello saad");
}
void display(int x,String name)
{
id=x;
this.name=name;
System.out.println(id);
System.out.println(name);
}

}