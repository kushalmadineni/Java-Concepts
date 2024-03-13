package Inheritance;



 class A {
	int i=10;
}
class B extends A{
	int j=20;
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            B b = new B();
            System.out.println(b.i);
            System.out.println(b.j);
            
            
}
}


