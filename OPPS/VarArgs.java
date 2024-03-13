package OPPS;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Var t = new Var();
       System.out.println(t.add(1.1f,2.2f));
       System.out.println(t.add(10.0f,20.0f));
       System.out.println(t.add(10,20));
       
	}

}
class Var{
	float Sum= 0.0f;
	float add(float... a) {
		for(float f : a) {
			Sum = Sum + f;
		}
		return Sum;
	}
	
}

