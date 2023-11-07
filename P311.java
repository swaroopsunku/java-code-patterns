package patterns;

public class P311 {
	public static void main(String[] args) {
		int space=-1,star=6;
		for (int i = 1; i <=5; i++) {
			star--;
			space++;
			char ch='a';
			int a=5;
			for (int j = 1; j <=star; j++) {
				if (i%2==0) {
					System.out.print(ch++);
				} 
				else {
					System.out.print(a--);
				}
			}
			for (int j = 1; j <=space; j++) {
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}
