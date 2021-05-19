//create class Employe have eno,ename,esalary.read n employ info and search for an employe given eno use concept of
 array of objects.
import java.util.Scanner;
class Employe
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
		int enumb=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(em[i].eno==enumb)
			{
				System.out.println("Employee found");
                                System.out.println("Employee name is "+ em[i].ename+" and Employee salary is "+ em[i].esalary);
				break;
			}
			if(i==n-1)
			{
				System.out.println("Employee not founded:");
			}
		}


 }

}
 
                 OUTPUT:

C:\Program Files\Java\jdk-16.0.1\bin>javac Employe.java

C:\Program Files\Java\jdk-16.0.1\bin>java Employ
enter the Limit
3
Enter te details:
1
3000
basil
Enter the details:
2
4000
alias
Enter the details:
3
6000
aju
Enter the eno:
2
Employee found
Emploee name is alias and Employee salary is 4000
