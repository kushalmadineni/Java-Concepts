package Patterns;

public class FloydsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" "+count);
				count++;
				
			}System.out.println();
		}

	}

}
