package patterns;

public class P316 {
	public static void main(String[] args) {
		int star=5,space=-1;
		for (int i = 1; i <=4; i++) {
			star--;
			space++;
			for (int j = 1; j <=star; j++) {
				System.out.print('*');
			}
			for (int j = 1; j <=space; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
