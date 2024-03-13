package Polymorphism;

//Flexibilty but code is lengthy.....

class Emp{
	String name;
	byte age;
	void role() {
		System.out.println("The role of employee");
	}
	void workinghours() {
		System.out.println("The woorkinghour is 8hours");
	}
	
}
class Developer extends Emp{
	void role() {
		System.out.println("The role is Developer");
	}
	void workinghours() {
		System.out.println("The workinghour is 10hours");
	}
	
}
class Tester extends Emp{
	void role() {
		System.out.println("The role is Tester");
	}
	void workinghours() {
		System.out.println("The workinghour is 6hours");
	}	
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e ;
		e = new Developer();
		e.role();
		e.workinghours();
		e=new Tester();
		e.role();
		e.workinghours();
		

	}

}
