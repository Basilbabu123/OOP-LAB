import java.util.Scanner;
class Publisher{
	String publisher;
	Publisher(){
	System.out.println("Enter Publisher name");
	Scanner sc=new Scanner(System.in);
	publisher=sc.next();
	}
	
}
class Book extends Publisher{
	String book;
	Book(){
		System.out.println("Enter book name");
		Scanner sc=new Scanner(System.in);
		book=sc.next();
	}
}
class Literature extends Book{
	String authorname;
	Literature(){
		System.out.println("author name");
		Scanner sc=new Scanner(System.in);
		authorname=sc.next();
		
	}
	void dipslay(){
		System.out.println("Publishername    Book   Authorname");
		System.out.printf("%2s%15s%10s",publisher,book,authorname);
	}
}
class Fiction extends Book{
	String theme;
	Fiction(){
		System.out.println("Enter theme");
		Scanner sc =new Scanner(System.in);
		theme=sc.next();
	}
	void display(){
		System.out.println("Publishername   Book   theme");
		System.out.printf("%2s%15s%10s",publisher,book,theme);
	}
}
class Myclass{
	public static void main(String ab[]){
		Literature b1=new Literature();
		Fiction b2=new Fiction();
		b2.display();
	}
}