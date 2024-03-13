package Strings;

public class StringReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t= new Test();
		System.out.println(t.fun());

	}

}
class Test{
	int fun() {
		int a=125;
		return a;
	}
}
