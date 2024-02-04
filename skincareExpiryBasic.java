package skincareExpiryBasic;




import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class skincareExpiryBasic {
	static Scanner scan = new Scanner(System.in);
	static String product;
	static String finalExpiryDate;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 7; i++) {  
    		productName();
		    todaysDate();
		  printExpiry();}
	}


public static void productName () {
    	
    	System.out.println("What's the name of your product?");
    	 Scanner productScanner = new Scanner(System.in);
		  product = productScanner.next();
}

public static void todaysDate() {
	
	
	Scanner dateScanner = new Scanner(System.in);
	System.out.println("Enter the little expiry number on the back of your product ");
	System.out.println("hint: it usually looks like 6M or 12M" );
	long dateAnswer = scan.nextInt();
	
	LocalDate currentDate = LocalDate.now();
	LocalDate expiryDate = currentDate.plusMonths(dateAnswer);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	finalExpiryDate = expiryDate.format(formatter);
	
	
}
public static void printExpiry() {
	System.out.println("your "+product+"expires on "+ finalExpiryDate);
}
}
