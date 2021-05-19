//3.Add two complex number
import java.util.Scanner;
class Complex
{
 double r,i;
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  Complex c1=new Complex();
  Complex c2=new Complex();
  System.out.println("Enter the complex number a:");
  c1.r=sc.nextDouble();
  c1.i=sc.nextDouble();
  System.out.println("Enter the complex number b:");
  c2.r=sc.nextDouble();
  c2.i=sc.nextDouble();
  double sr=c1.r+c2.r;
  double si=c1.i+c2.i;
  System.out.println("Sum:"+sr+"+"+si+"i");
 }
}

OUTPUT
------
C:\Program Files\Java\jdk-16.0.1\bin>javac Complex.java

C:\Program Files\Java\jdk-16.0.1\bin>java Complex
Enter the complex number a:
8
5
Enter the complex number b:
1
3
Sum:9.0+8.0i