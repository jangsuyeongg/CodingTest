import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;){
			System.out.print("�޴�����[1. �簢���� ����, 2. �簢���� �ѷ�, 3. ����]?");
			int menu = sc.nextInt() ;
			
			if(menu==3) {
				System.exit(0);
			}else {
				System.out.println("����");
				int width = sc.nextInt();
				
				System.out.println("����");
				int height = sc.nextInt();
				
				int result = (menu ==1)?  width*height : (width+height)*2 ;
				String msg = (menu==1)? "����":"�ѷ�";

				System.out.println("�簢���� "+msg+"="+ result);
			}
		}
	}
}
