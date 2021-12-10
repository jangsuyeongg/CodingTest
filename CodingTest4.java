
public class CodingTest4 {
			

	
	public static void main(String[] args) {

		String str = "abcdef"; //문자열
		String reverse = "";
		for(int i= str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
			//charAt = String 으로 저장된 문자열 중에서 한 글자만 선택해서 char
			//타입으로 변환해주는 아이 
		}
		System.out.println(reverse);
		
	}

}
