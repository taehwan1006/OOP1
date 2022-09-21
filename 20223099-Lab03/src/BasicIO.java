import java.util.*;
import java.time.LocalDate;

// An exploration of basic input and output.
class BasicIO {
	// Reads and processes string input.
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		LocalDate now = LocalDate.now();
		// get first input
		
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		
		System.out.print("Enter your age: ");
		String  age = stdin.nextLine();
		
		System.out.print("Enter your height: ");
		String Height = stdin.nextLine();
		
		int height = Integer.parseInt(Height);
		int year = now.getYear();
		int month = now.getMonthValue();
		int date = now.getDayOfMonth();
		
		// display output on console
		System.out.println("your name is " + name);
		System.out.println("you live for " +  365 * Integer.parseInt(age) + " days");
		System.out.printf("%d년 %d월 %d일 현재 %s(%d)의 키는 %d cm입니다.", year, month, date, name, Integer.parseInt(age), height);
	} // method main

} // class BASIC_IO