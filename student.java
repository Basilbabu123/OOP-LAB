import java.util.Scanner;
class Student{
	int roll;
	String name;
	String dept;
	Student(int x,String a,String b){
		this.roll=x;
		this.name=a;
		this.dept=b;
	}
	
}
class Sports extends Student{
	String category;
	int points;
	Sports(int x,String a,String b,String c,int y){
		super( x, a, b);
		this.points=y;
		this.category= c;
	}
	
}
class Result extends Sports{
	Result(int x,String a,String b,String c,int y){
			super(x,a,b,c,y);
	}
	 void display(){
		System.out.println("Roll  Name  Dept  Category  Points");
		System.out.printf("%2d%8s%5s%8s%9d",roll,name,dept,category,points);
	 }
	public static void main(String ab[]){
		Result b=new Result(19,"basil","mca","broad jump",500);
		b.display();
	}
}