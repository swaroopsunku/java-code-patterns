package patterns;

public class P22 {
	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				if (j%2==1) {
					System.out.print('1');
				}
				else {
					System.out.print('a');
				}
			}
			System.out.println();
		}
	}
}
