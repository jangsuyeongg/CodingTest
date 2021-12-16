import java.util.Scanner;

public class OOP_GuGuDan {
	public OOP_GuGuDan() {
		int dan = danInput();
		String result = gugudan(dan);
		System.out.println(result);
	}
	
	int danInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("´ÜÀÔ·Â=");
		return scan.nextInt();
	}
	
	String gugudan(int dan) {
		String gugu="";
		for(int i=2; i<=9; i++) {
			gugu+= dan+"*"+i+"="+dan*i+"\n";
		}
		return gugu;
	}
	
	public static void main(String[] args) {
		OOP_GuGuDan oop = new OOP_GuGuDan();

	}

}
