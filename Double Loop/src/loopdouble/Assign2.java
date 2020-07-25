package loopdouble;
public class Assign2 {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {                               //  * Pattern 2
		for(int j=5;j>i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
