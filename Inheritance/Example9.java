package Inheritance;
class Ex9{
	int a,b;
	int i,j;
	Ex9(int a,int b){
		super();
		this.a=a;
		this.b=b;
			
		}
		
}
class Exm9 extends Ex9{
	Exm9(int i, int j){
		super(30,40);
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(a);
		System.out.println(b);
	}
}


public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exm9 ex = new Exm9(10,20);
		ex.display();

	}

}
