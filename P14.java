package patterns;

public class P14 {
	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			char ch='e';
			for (int j = 1; j <=5; j++) {
				System.out.print(ch--);
			}
			System.out.println();
		}
	}
}
