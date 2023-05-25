import java.util.Scanner;
public class Squared {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();
	
	if (number1 > 100) {
	System.out.printf("%d > %d%n", 100);
	}
	
	if (number1 == 100) {
	System.out.printf("%d == %d%n", 100);
	}

	if (number1 != 100) {
	System.out.printf("%d < %d%n", 100);
	}

	int square = number1 * number1;
		
		if (square > 100) {
	System.out.printf("%d > %d%n", 100);
	}
	
	if (square== 100) {
	System.out.printf("%d == %d%n", 100);
	}

	if (square != 100) {
	System.out.printf("%d < %d%n", 100);
	}
	
	}

}