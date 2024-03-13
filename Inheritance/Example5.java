package Inheritance;

class A3{
	static void fun1() {
		System.out.println("Inside fun1 method");
	}
}
class A4 extends A3{
	void fun2() {
		fun1();
		System.out.println("Inside fun2 method");
	}
}

public class Example5 {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        A4 a = new A4();
	        a.fun2();
		}
	}


