import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;){
			System.out.print("메뉴선택[1. 사각형의 넓이, 2. 사각형의 둘레, 3. 종료]?");
			int menu = sc.nextInt() ;
			
			if(menu==3) {
				System.exit(0);
			}else {
				System.out.println("가로");
				int width = sc.nextInt();
				
				System.out.println("세로");
				int height = sc.nextInt();
				
				int result = (menu ==1)?  width*height : (width+height)*2 ;
				String msg = (menu==1)? "넓이":"둘레";

				System.out.println("사각형의 "+msg+"="+ result);
			}
		}
	}
}
