class Average{

  public static void main(String[] arg)
  {
   Average ob = new Average();
   double t=ob.av(3,5,1);
   System.out.println(t);
   ob.sum(8,4);
   double a = ob.ar(2,2);
   System.out.println(a);

  }
   double av(int a,int b,int c)
    {
     double r=(a+b+c)/3;
     return r;
    }

    void sum(int a, int b)
    {
     int c=a+b;
     System.out.println(c);
    }
   
    double ar(int x,int y)
    {
    double z=(double).5*x*y;
    return z;
    }
}
