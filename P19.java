package patterns;

public class P19 {
	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			int a=1;
			char ch='A';
			for (int j = 1; j <=4; j++) {
				if (i==2||i==4) {
					System.out.print(a++);
				}
				else {
					System.out.print(ch++);
				}
			}
			System.out.println();
		}
	}
}
