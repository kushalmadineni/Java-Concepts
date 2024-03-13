package InstanceStatic;

public class InstanceEx {
	int age;
	{
		age =20;
		System.out.println("age is:"+age);
	}
	InstanceEx(){
		age = 21;
		System.out.println("inside constructor"+age);
	}
	InstanceEx(int x ){
		age = x;
		System.out.println("inside paramterised constructor"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceEx i = new InstanceEx();
		InstanceEx i1 = new InstanceEx(22);
	}

}
