import java.util.Scanner;
class Student
{
  int regno;
  String name;
  String dept;

 Student(int x,String a,String b)
   {
    this.regno=x;
    this.name=a;
    this.dept=b;
   }
}

class Sports extends Student
{
 String item;
 int points;
 int rank;
 
 Sports(int x,String a,String b,String c,int y,int r)
{
  super( x, a, b);
  this.points=y;
  this.item= c;
  this.rank=r;
}
	
}

class Result extends Sports
{  int mark;
  
Result(int x,String a,String b,String c,int y,int r)
{ 
  super(x,a,b,c,y,r);
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter marks");
  mark=sc.nextInt();
}
    
void display()
{
   
   System.out.println("RegNo: "+regno);
   System.out.println("Name: "+name);
   System.out.println("Department: "+dept);
    System.out.println("Marks: "+mark);
   System.out.println("SportsItem: "+item);
   System.out.println("Points: "+points);
   System.out.println("Rank: "+rank);
 
}
}

class Myclass
{
public static void main(String ar[])
{ 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter student details-");
  Result b=new Result(3,"BASIL","MCA","Long Jump",210,1);
  b.display();
}
}



