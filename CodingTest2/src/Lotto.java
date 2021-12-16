import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
			//���Ӽ� �Է�
			System.out.print("���Ӽ�=");
			int cnt = scan.nextInt();
			
			//�Է¹��� ���Ӽ� ��ŭ ���Ӹ����
			for(int game=1; game<=cnt; game++) {
				//����1�� �����
				//�ζǹ�ȣ+���ʽ��� ������ �����Ͽ� ������ �迭
				int lotto[] = new int[7];
				for(int i=0; i<lotto.length; i++) {
					lotto[i] = (int)(Math.random()*45) +1;
					//�ߺ��˻�
					for(int c=0; c<i; c++) {
						if(lotto[i] == lotto[c]) {
							i--;
						}
					}
				}		
				//����
				Arrays.sort(lotto);
				//System.out.println(Arrays.toString(lotto));
				
				// ���
				System.out.print(game+"����=");
				for(int i=0; i<lotto.length-1; i++) {
					System.out.print(lotto[i]+", ");
				}
				System.out.println("bonus="+lotto[6]);
			}
			
			System.out.print("����Ͻðڽ��ϱ�[1:��, 2:�ƴϿ�]?");
			int check =scan.nextInt();
			if(check==2) break;
		}while(true);
	}
}
