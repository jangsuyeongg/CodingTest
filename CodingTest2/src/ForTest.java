import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("´ÜÀÔ·Â=");
		int dan = sc.nextInt();
		
	for(int b=2; b<=9; b++) {
		int result = dan * b;
		System.out.printf("%d*%d=%d\n", dan, b, result);
	}
	}

}
