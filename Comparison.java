import java.util.Scanner;

public class Comparison {
	public static void main(String[] args){
	Scanner Glory =new Scanner(System.in);
	
	System.out.print("Enter fierst integer: ");
	int number1 = Glory.nextInt();
	
	System.out.print("Enter secnd number: ");
	int number2 = Glory.nextInt();
	
	if (number1 == number2){
	System.out.printf("%d == %d%n", number1, number2);
	}
	
	 if (number1 != number2){
	 System.out.printf("%d != %d%n", number1, number2);
	 }
	 if (number1 < number2) {
	 System.out.printf("%d < %d%n", number1, number2);
	}
	
	if (number1 > number2) {
	System.out.printf("%d > %d%n", number1, number2);
	}
	
	if (number1 <= number2) {
	System.out.printf("%d <= %d%n", number1, number2);
	}
	
	if (number1 >= number2) {
	System.out.printf("%d >= %d%n", number1, number2);
	}
     }
}
