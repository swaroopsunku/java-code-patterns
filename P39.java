package patterns;

public class P39 {
	public static void main(String[] args) {
		char ch='a';
		int a=1;
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				if (j%2==0) {
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
