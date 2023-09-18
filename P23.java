package patterns;

public class P23 {
	public static void main(String[] args) {
		int a=1;
		char ch='a';
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=5; j++) {
				if (j==3) {
					System.out.print('+');
				}
			    else if (j%2==1) {
					System.out.print(ch++);
				}
				else {
					System.out.print(a++);
				}
			}
			System.out.println();
		}
	}
}
