import java.lang.String;
import java.util.Scanner;
class Person{
	String name,gen,address;
	Person(){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Name Gender Address");
		this.name=sc.next();
		this.gen=sc.next();
		this.address=sc.next();
	}
	void display(){
		System.out.printf("%10s%10s%10s\n","Name","Gender","Address");
		System.out.printf("%10s%10s%10s\n",name,gen,address);
	}
}
class Employee extends Person{
	int empid;
	float salary;
	String company_name,qualification;
	Employee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Empid salary Companyname Qualification");
		this.empid=sc.nextInt();
		this.salary=sc.nextFloat();
		this.company_name=sc.next();
		this.qualification=sc.next();
	}
	void display(){
		super.display();
		System.out.printf("%5s%10s%10s%10s\n","Empid","salary","Company name","Qualification");
		System.out.printf("%5d%10.0f%10s%10s\n",empid,salary,company_name,qualification);
	}
	
}
class Teacher extends Employee{
	int teacherid;
	String department,subject;
	Teacher(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter TeacherId  deaprtment subject");
		this.teacherid=sc.nextInt();
		this.department=sc.next();
		this.subject=sc.next();
	}
	void display(){
		super.display();
		System.out.printf("%5s%10s%10s\n","Teacher Id","Department","Subject");
		System.out.printf("%5d%10s%10s\n",teacherid,department,subject);
	}
}
class My_teacher{
	public static void main(String ab[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many persons details you wanted");
		int x=sc.nextInt();
		Teacher b[]=new Teacher[x];
		
		for(int i=0;i<x;i++){
			b[i]=new Teacher();
		}
		for(int i=0;i<x;i++){
			b[i].display();
		}
	}
}