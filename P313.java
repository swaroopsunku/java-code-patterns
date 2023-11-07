package patterns;

public class P313 {
	public static void main(String[] args) {
		int a=1;
		for (int i = 1; i <=4; i++) {
			if (i==2) {
				a+=1;
			}
			else if(i==3) {
				a+=5;
			}
			else if(i==4) {
				a+=7;
			}
			for (int j = 1; j <=i; j++) {
				if (i==2||i==3||i==4) {
					System.out.print(a--);
				} 
				else {
					System.out.print(a++);
				}
			}
			System.out.println();
		}
	}
}
