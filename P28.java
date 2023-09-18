package patterns;

public class P28 {
	public static void main(String[] args) {
		int a=1;
		char ch='A';
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if ((i==3)||(j==3)) {
					System.out.print('#');
				}
				else if (j%2==1) {
					System.out.print(a++);
				}
				else {
					System.out.print(ch++);
				}
			}
			System.out.println();
		}
	}
}
