package patterns;

public class P21 {
	public static void main(String[] args) {
		int a=1;
		char ch='A';
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				if (j%2==1) {
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
