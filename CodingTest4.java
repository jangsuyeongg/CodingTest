
public class CodingTest4 {
			

	
	public static void main(String[] args) {

		String str = "abcdef"; //���ڿ�
		String reverse = "";
		for(int i= str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
			//charAt = String ���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� char
			//Ÿ������ ��ȯ���ִ� ���� 
		}
		System.out.println(reverse);
		
	}

}
