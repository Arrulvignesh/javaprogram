package primenumber;
import java.util.Scanner;

public class PRIMENUMBER {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		boolean prime = true;
		for(int i =2;i<a/2;i++) {
			if(a%i==0) {
				prime = false;
				break;
			}
		}
		if(prime) {
			System.out.println("it is prime");
		}else {
			System.out.println("it is not a prime");
		}
	}

}
