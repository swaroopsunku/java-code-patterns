package patterns;

public class P38 {
	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			char ch='a';
			int a=1;
			for (int j = 1; j <=i; j++) {
				if (i%2==0) {
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
