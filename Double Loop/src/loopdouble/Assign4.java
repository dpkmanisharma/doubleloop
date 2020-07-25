package loopdouble;
public class Assign4 {
public static void main(String[] args) {       //Pattern using digits 1-10 
		int c=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");            // Added space using +" "
				c++;
			}
			System.out.println();
		}
}
}
