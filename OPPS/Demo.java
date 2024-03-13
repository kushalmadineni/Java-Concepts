package OPPS;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cred c = new Cred();
       c.setun ( "kushal");
       c.setpwd ("kushal123");
       c.setage(21);
       
       System.out.println(c.getun());
       System.out.println(c.getpsd());
       System.out.println(c.getage());
     
	}

}
class Cred {
	private String username;
	private String psd;
	private int age;
	void setun(String un) {
		username = un;
	}
	void setpwd(String pwd) {
		psd = pwd;
	}
     void setage(int a) {
		age = a;
	}
	
	String getun() {
		return username;
	}
	String getpsd() {
		return psd;
	}
	int getage() {
		return age;
	}
}
