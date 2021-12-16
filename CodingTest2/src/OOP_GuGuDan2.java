import java.util.Scanner;

public class OOP_GuGuDan2 {
	int dan;
	String gugu="";
	
	int danInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("´ÜÀÔ·Â");
	return dan = sc.nextInt();
	}
	void gugudan() {
		for(int i=2; i<=9; i++) {
			gugu+= dan+"*"+i+"="+dan*i+"\n";
		}
	}
	void start() {
		danInput();
		gugudan();
		System.out.println(gugu);
	}
	
	
	public static void main(String[] args) {
		OOP_GuGuDan2 oop = new OOP_GuGuDan2();
		oop.start();
	}

}
