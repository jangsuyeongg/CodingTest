import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title[] = {"����", "����", "����","����","����","�ѱ���","����"};
		int[] jumsu = new int[7];
		
		for(int i=0; i<title.length; i++) {
			System.out.println(title[i]);
			jumsu[i]=sc.nextInt();
		}
		int tot = 0;
		for(int i=0; i<title.length; i++) {
			tot = tot + jumsu[i];
		}
		int ave = tot/7;
		System.out.println("����="+tot);
		System.out.println("���="+ ave);
	
	}

}
