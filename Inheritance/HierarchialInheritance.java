package Inheritance;
class Animal {
	void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("bow");
	}
}
class Cat extends Animal{
	void meow() {
		System.out.println("meow");
	}
}


public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.eat();
		c.meow();
		Dog d = new Dog();
		d.bark();
		d.eat();

	}

}
