package InstanceStatic;

public class Swap {
   
    public static void swap(int x,int y) {
    	
		int temp = x;
		x=y;
		y=temp;
		System.out.print(x);
		System.out.print(y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=20;
		System.out.print(a);
		System.out.println(b);
	    swap(a,b);
		

	}

}

