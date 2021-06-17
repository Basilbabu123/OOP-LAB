import java.util.Scanner;
public class Employe
 {
	int eno,esalary;
	String ename;
	public static void main(String args[]) 
             {
		Scanner sc=new Scanner(System.in);
		Employe em[]=new Employe[3];
		System.out.println(" enter the Limit");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details:");
			em[i]=new Employe();
			em[i].eno=sc.nextInt();
			em[i].esalary=sc.nextInt();
			em[i].ename=sc.next();
		}
		System.out.println("Enter the eno:");
		int enoo=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(em[i].eno==enoo)
			{
				System.out.println("Employee found");

	  System.out.println("Employee name is "+ em[i].ename+ " and Employee salary is "+ em[i].esalary);
				break;
			}
			if(i==n-1)
			{
				System.out.println("Employee not founded:");
			}
		}


 }

}
