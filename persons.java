import java.util.Scanner;
class Person
{ int age;
  String gender,address,name;    
Person()
 {  Scanner sc=new Scanner(System.in);
    System.out.println("PERSONAL DETAILS:");
    System.out.println("Enter Name, Address, Gender, Age");
    name=sc.next();
    address=sc.next();
    gender=sc.next();
    age= sc.nextInt();
 }
}
class Employee extends Person
{
 int empid,salary;
 String company,qualification;
Employee()
{  Scanner sc=new Scanner(System.in);
   System.out.println("EMPLOYEE DETAILS:");
   System.out.println("Enter CompanyName, EmployeeID, Qualification, Salary ");
   company=sc.next();
   empid=sc.nextInt();
   qualification=sc.next();
   salary=sc.nextInt();
}
}
class Teacher extends Employee
{   Scanner sc=new Scanner(System.in);
    String dept,sub;
    int teacherID;
Teacher()
{ System.out.println(" TEACHER DETAILS:");
  System.out.println("Enter Department name, Subject, TeacherID");
  dept=sc.next();
  sub= sc.next();
  teacherID= sc.nextInt();
}
   void display()
     {
        System.out.println("DETAILS ARE:");
        System.out.println(name );
        System.out.println(address);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(company);
        System.out.println(empid);
        System.out.println(qualification);
        System.out.println(salary);
        System.out.println(teacherID);
        System.out.println(sub);
        System.out.println(dept);
        
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



