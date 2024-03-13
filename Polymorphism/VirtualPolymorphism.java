package Polymorphism;
class Company{
	public void allow(Developer d) {
		d.role();
		d.workinghours();
	}
	public void allow(Tester t) {
		t.role();
		t.workinghours();
	}
	
	
}
public class VirtualPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company();
		Developer d = new Developer();
		Tester t = new Tester();
		c.allow(d);
		c.allow(t);

	}

}
