package patterns;

public class P16 {
	public static void main(String[] args) {
		char ch='i';
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				if (ch=='`') {
					ch='i';
				}
				System.out.print(ch--);
			}
			System.out.println();
		}
	}
}
