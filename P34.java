package patterns;

public class P34 {
	public static void main(String[] args) {
		int space=5,star=0;
		for (int i = 1; i <=4; i++) {
			star++;
			space--;
			for (int j = 1; j <=space; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <=star; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}