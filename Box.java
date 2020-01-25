public class Box{
public static void main(String[] arg)
{
 Box ob= new Box();
double x=ob.volcube(2.999);
System.out.println(x);
ob.volcuboid(5.66,4.22,.54);
}
  double volcube(double a)
  {
   double v=a*a*a;
   return v;
  }

  void volcuboid(double a,double b,double c)
  {
   double v=a*b*c;
   System.out.println(v);
  }

}