package patterns;

public class P110 {
	public static void main(String[] args) {
		int a=1;
		char ch='a';
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				if (i==2||i==4) {
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
