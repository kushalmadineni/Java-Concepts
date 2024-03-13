package OPPS;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add();
		int res = a.add(10,20);
		System.out.print(res);

	}

}
class Add{
	int add(int a,int b) {
		int c = a+b;
	    return c;
	}
}
