package patterns;

public class P11 {
	public static void main(String[] args) {
		char ch='a';
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if ((i+j)==6||i==j) {
					System.out.print(ch++);
				}
				else if(i==j&& (i+j)==6) {
					ch+=2;
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
