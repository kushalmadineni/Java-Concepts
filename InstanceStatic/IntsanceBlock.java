package InstanceStatic;

public class IntsanceBlock {
	int a = 10, b=20;
	{
	System.out.println("First Instance BLock");
	}
	IntsanceBlock(){
		System.out.println("Inside constructor");
		
	}
	IntsanceBlock(int x){
		System.out.println("Inside paramterised constructor");
		
	}
	{
		System.out.println("Second Instance BLock");
		}
	void add() {
		int c = a+b;
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntsanceBlock i = new IntsanceBlock();
		IntsanceBlock i1 = new IntsanceBlock(10);
		System.out.println(i.a);
		System.out.println(i1.b);
		i.add();
	}

}
