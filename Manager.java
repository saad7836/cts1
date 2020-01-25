class Manager{
 public static void main(String[] arg)
{
Member ob=new Member();
ob.input("MOHAMMAD SAAD",1234,"Saving",21700);
ob.display();

}
}
   class Member
{  
    String name;
    int acNo;
    String type;
    int balance;

    void input(String name,int acNo,String type,int balance)
   {
    this.name=name;
    this.acNo=acNo;
    this.type=type;
    this.balance=balance;
   }
  
   void display()
   {
    System.out.println("Name is " + name);
    System.out.println("Ac.no. is " + acNo);
    System.out.println("Type of ac is " + type);
    System.out.println("Your balance is "+ balance);
   }


}

