import java.util.Scanner;
class Overload
{
 Scanner sc=new Scanner(System.in);
 int length,breath;

void init()
{
  System.out.println("Enter length and breath of rectangle:");
  length=sc.nextInt();
  breath=sc.nextInt();
}

void area()
{
 System.out.println("Area of rectangle: "+(length*breath));
}
void area(int side)
{
 System.out.println("Area of square: "+(side*side));
}
void area(double r)
{
 double area = 3.14*r*r;
 System.out.println("Area of the circle: "+(3.14*r*r));
}
}

class Classa 
{
 public static void main(String ar[])
 {
 Overload Over = new Overload();
 Over.init();
 Over.area();
 Over.area(10);
 Over.area(3.2);
 }
}


