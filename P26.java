package patterns;

public class P26 {
	public static void main(String[] args) {
		int a=1;
		char ch='z';
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=4; j++) {
				if (j%2==1) {
					System.out.print(a++);
				}
				else {
					System.out.print(ch--);
				}
				if(a==10) {
					a=1;
				}
				
			}
			System.out.println();
		}
	}
}
