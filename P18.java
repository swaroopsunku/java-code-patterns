package patterns;

public class P18 {
	public static void main(String[] args) {
		char a='A';
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
	}
}
