package Inheritance;
class B1{
	int i;
	int j;
	B1(){
		super();
		i=111;
		j=222;
	}
}
class B2 extends B1{
	B2(){
		super();
	}
	void display()
	{
		System.out.println(i);
		System.out.println(j);
	}
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b2 = new B2();
		b2.display();

	}

}
