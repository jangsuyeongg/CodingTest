
public class ArrayTest {

	public static void main(String[] args) {
		int[]data;
		int num[] = new int[50];
		
		String name[] = new String[5]; //
		
		num[2] = 100;
		name[1] = "홍길동";
		
	//	System.out.println("num[1]=>"+num[1]);
	//	System.out.println("name[1]=>"+ name[1]);
		
		//배열 생성시 초기값 설정하는 방법(내가원하는 초기값)
		int[] data2= new int[] {20,65,74,5,87,2};
		for(int i=0; i<data2.length;i++) {
			System.out.println("data2["+i+"]="+ data2[i]);
		}
		//배열 생성시 초기값 설정하는 방법 2
		int data3[] = {8,7,5,37,75};
		for(int i =0; i<data3.length; i++) {
			System.out.println("data3["+i+"]="+ data3[i]);
		}
	}
}
