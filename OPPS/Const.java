package OPPS;

public class Const {
	 private String name;
	 private int age;
	public Const(){
		 super();
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("age"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Const c = new Const() ;
      c.name="sudha";
      c.age=22;
      c.display();
    	  
      
	}

}
