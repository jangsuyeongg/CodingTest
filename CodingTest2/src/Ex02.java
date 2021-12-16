import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("양의정수입력=");
		
		int data = scan.nextInt();
		
		int result = (data>=100 && data<=200)? data : 0;
		
		System.out.println(result);	
	}
}