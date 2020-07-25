package loopdouble;
public class Assign1 {                       //* pattern
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
