package Inheritance;
class Ex8{
	int i,j;
	Ex8(){
		System.out.println("Inside default constructor");
	}
}
class Exm8 extends Ex8{
	Exm8(int i,int j){
		super();
		this.i = i;
		this.j = j;
	}
	void display() {
		System.out.println(i);
		System.out.println(j);
	}
}

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exm8 ex = new Exm8(10,20);
		ex.display();
		

	}

}
