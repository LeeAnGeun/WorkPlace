import java.util.Scanner;

public class Work4 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println("x = " + x + " y = " + y);
		
	}
}
