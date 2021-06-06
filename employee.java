import java.lang.String;
import java.util.Scanner;
class Employee{
	int empid;
	String name,address;
	float salary;
	Employee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid salary name adress ");
		this.empid=sc.nextInt();
		this.salary=sc.nextFloat();
		this.name=sc.next();
		this.address=sc.next();
	}
	void display(){
		System.out.printf("%5s%10s%10s%10s\n","empid", "salary", "name"," address");
		System.out.printf("%5d%10.0f%10s%10s",empid,salary,name,address);
	}
}
class Teacher extends Employee{
	String dept,subject;
	Teacher(){
		Scanner sc=new Scanner(System.in);
		System.out.println("dept subject");
		this.dept=sc.next();
		this.subject=sc.next();
	}
	void display(){
		
		super.display();
		System.out.println("\nDeaprtment\tSubject");
		System.out.printf("%5s%17s\n",dept,subject);
	}
	public static void main(String ab[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Employees that you wanted");
		int x=sc.nextInt();
		Teacher b[]=new Teacher[x];
		for (int i=0;i<x;i++){
			 b[i]=new Teacher();
		}
		for (int i=0;i<x;i++){
			b[i].display();
		}
		
	}
}