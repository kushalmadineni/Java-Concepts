package OPPS;

public class Student {
    String name;
    String usn;
    byte sem;
    double sgpa = 8.95;
    
    double cgpa() {
    	return sgpa*9.5;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s = new Student();
        double res = s.cgpa();
        System.out.print(res);
	}

}
