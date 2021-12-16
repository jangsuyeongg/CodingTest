import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
			//게임수 입력
			System.out.print("게임수=");
			int cnt = scan.nextInt();
			
			//입력받은 게임수 만큼 게임만들기
			for(int game=1; game<=cnt; game++) {
				//게임1개 만들기
				//로또번호+보너스를 난수로 생성하여 저장할 배열
				int lotto[] = new int[7];
				for(int i=0; i<lotto.length; i++) {
					lotto[i] = (int)(Math.random()*45) +1;
					//중복검사
					for(int c=0; c<i; c++) {
						if(lotto[i] == lotto[c]) {
							i--;
						}
					}
				}		
				//정렬
				Arrays.sort(lotto);
				//System.out.println(Arrays.toString(lotto));
				
				// 출력
				System.out.print(game+"게임=");
				for(int i=0; i<lotto.length-1; i++) {
					System.out.print(lotto[i]+", ");
				}
				System.out.println("bonus="+lotto[6]);
			}
			
			System.out.print("계속하시겠습니까[1:예, 2:아니오]?");
			int check =scan.nextInt();
			if(check==2) break;
		}while(true);
	}
}
