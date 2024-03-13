package Inheritance;

class A1{
	void fun1() {
		System.out.println("Inside fun1 method");
	}
}
class A2 extends A1{
	void fun2() {
		fun1();
		System.out.println("Inside fun2 method");
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A2 a = new A2();
        a.fun2();
	}

}
