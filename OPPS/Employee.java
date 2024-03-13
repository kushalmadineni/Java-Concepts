package OPPS;

public class Employee {
    String id;
    String name;
    double salary;
    void Experience() {
    	System.out.println("5years");
    }
    void Location() {
    	System.out.println("Bangalore");
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.id="1";
		e1.name="Gammana";
		e1.salary=250000.0;
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
		e2.id="2";
		e2.name="Charan";
		e2.salary=250000.0;
		
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);
		
		e3.id="3";
		e3.name="Madhu";
		e3.salary=250000.0;
		
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.salary);
		
		
	}

}
