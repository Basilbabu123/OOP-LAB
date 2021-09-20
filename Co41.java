import java.util.*;
class rect extends Thread {
int length, breadth, height;
public void run() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter length:");
length = sc.nextInt();
System.out.println("Enter breadth:");
breadth = sc.nextInt();
System.out.println("Area of rectangle:"+length * breadth);
}}

class cir implements Runnable{
int length;
public void run() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius:");
length = sc.nextInt();
System.out.println("Area of circle:"+3.14f * length);
}}
public class Co41 {
public static void main(String ...a)throws Exception{
Scanner sc = new Scanner(System.in);
rect t1 = new rect();
cir r2 = new cir();
Thread t4 = new Thread(r2);
int c;
do{
System.out.println("\n1.Area of rectangle\n2.Area of circle \n3.Exit\n enter ur option:");
c = sc.nextInt();
switch (c){
               case 1:t1.start();
               t1.join();
               break;
               case 2:t4.start();
               t4.join();
               break;
               case 3:System.exit(0);
               break;
               default:System.out.println("Invalid");
               break;
           }}while (c!=3);

}}
