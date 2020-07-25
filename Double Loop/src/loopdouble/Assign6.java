package loopdouble;
public class Assign6 {
public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");              // Star pyramid
			}
			for(int y=1;y<=i;y++) {
				System.out.print("*");
			}
			for(int x=1;x<i;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
}
