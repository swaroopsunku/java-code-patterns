package patterns;

public class P42 {
	public static void main(String[] args) {
		int star=9, space=0;
		for (int i = 0; i <=4; i++) {
			star-=2;
			space++;
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
