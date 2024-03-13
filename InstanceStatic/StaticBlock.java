package InstanceStatic;
import java.util.Scanner;

public class StaticBlock {
	private String name;
	private int age;
	static private String instituteName = "Codegnan";
	 public void setData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a name:");
		name = s.next();
		System.out.println("Enter a age:");
		age = s.nextInt();
		
	}
	 public void display() {
		 System.out.println("Enter a name:"+name);
		 System.out.println("Enter a age:"+age);
		 System.out.println("Enter a instituteName:"+instituteName);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb = new StaticBlock();
		sb.setData();
		sb.display();
		StaticBlock sb1 = new StaticBlock();
		sb1.setData();
		sb1.display();

	}

}
