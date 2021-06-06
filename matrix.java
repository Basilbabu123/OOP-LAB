import java.util.Scanner; 
class Matrix{
	int a[][];
	int r,c;
	Matrix(int x,int y){
		this.r=x;
		this.c=y;
	}
	void read(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values for rows and coloumns");
		for(int i=0;i<r;i++){
			for (int k=0;k<c;k++){
				a[i][k]=sc.nextInt();
			}
		}
	}
	void add(Matrix m1,Matrix m2){
		for(int i=0;i<r;i++){
			for(int k=0;k<c;k++){
				this.a[i][k]=m1.a[i][k]+m2.a[i][k];
			}
		}
	}
	void display(){
		for(int i=0;i<r;i++){
			for(int k=0;k<c;k++){
				System.out.print(a[i][k]+" ");
				
			}
			System.out.println();
		}
	}
}
class My_matrix{
	public static void main(String ab[]){
		System.out.println("Enter rows and coloumns");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int z=sc.nextInt();
		Matrix m1=new Matrix(b,z);
		m1.a=new int[b][z];
		m1.read();
		Matrix m2=new Matrix(b,z);
		m2.a=new int[b][z];
		m2.read();
		Matrix m3=new Matrix(b,z);
		m3.a=new int[b][z];
		m3.add(m1,m2);
		m3.display();
		
	}
}