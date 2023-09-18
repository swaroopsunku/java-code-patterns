package patterns;

public class P25 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			int a=1;
			char ch='a';
			for (int j = 1; j <=5; j++) {
				if (i==1||i==5) {
					System.out.print(a++);
				}
				else if(i==3) {
					System.out.print('+');
				}
				else {
					System.out.print(ch++);
				}
			}
			System.out.println();
		}
	}
}
