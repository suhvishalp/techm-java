import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int age;                                                         
		System.out.println("Enter your age:");
		age = scanner.nextInt();
		
		System.out.println("Your Age = " + age);
	}

}
