import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title[] = {"국어", "영어", "수학","과학","물리","한국사","도덕"};
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
		System.out.println("총점="+tot);
		System.out.println("평균="+ ave);
	
	}

}
