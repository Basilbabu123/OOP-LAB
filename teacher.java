
import java.util.Scanner;
class Employee
{
 int empid,salary;
 String Name,address;
   Employee()
   {   
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name Empid Salary Address");
    Name= sc.next();
    empid= sc.nextInt();
    salary=sc.nextInt();
    address=sc.next();
   }
}

class Teacher extends Employee
{
 String dept,subj;
 Teacher()
 { Scanner sc=new Scanner(System.in);
   System.out.println("Department name:");
   dept=sc.next();
   System.out.println("Subject:");
   subj= sc.next();
 }
    
void display()
{
  System.out.println("DETAILS ARE:-");
  
  System.out.println("Employee Name: "+Name);
  System.out.println("Employee ID: "+empid);
  System.out.println("Address: "+address);
  System.out.println("Subject: "+subj);
  System.out.println("Department: "+dept);
  System.out.println("Salary: "+salary);
}
}

class Myclass
{
public static void main(String ar[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the limit:");
   int n=sc.nextInt();
   Teacher tr[]=new Teacher[n];
   for (int i=0;i<n;i++)
   {
    tr[i]=new Teacher();
    tr[i].display();
   }
 }
}




