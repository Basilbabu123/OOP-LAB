class Shapes{
	void area(int x){
		System.out.println("Area  circle is = "+(3.14*x*x));
	}
	void area(int x, int y){
		System.out.println("Area  Rectangle is = "+(x*y));
	}
	void area(int x,int y,int z){
		System.out.println("Area  Trapezoid is = "+.5*(x+y)*z);
	}
public static void main(String ab[]){
	Shapes bc=new Shapes();
	bc.area(5);
	bc.area(8,5);
	bc.area(5,4,7);
}
}