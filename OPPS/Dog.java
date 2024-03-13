package OPPS;

public class Dog {
	String name;
	String color;
	double cost;
	
	void bark() {
		System.out.println("Dog bow bow");
	}
	void eat() {
		System.out.println("Only non-veg!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dog d = new Dog();
       d.name = "kutta";
       d.color = "All-mix";
       d.cost = 500000.0;
       System.out.println(d.name);
       System.out.println(d.color);
       System.out.println(d.cost);
       d.bark();
       d.eat();
	}

}
