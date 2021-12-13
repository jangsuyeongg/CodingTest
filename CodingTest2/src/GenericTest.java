import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer i = (Integer)list.get(2); //컴파일 OK  ClassCastException - 형변환에러 , 컴파일러의 한계임 , 실행시 발생하는 에러
		//String ii = (String)list.get(0);
		//그래서 사용하는게 제네릭!! 인티저밖에 못들어간다고 위에 표시해줌. 왜냐면 컴파일에러 잡는게 실행시 에러보다 나으니까!! 
		// 그리고 이미 인티저 밖에 안되니까 형변환을 (Integer) 라고 안해도 된다.
		//만약에 int 랑 String 이랑 둘다 적고 싶으면 object 로 제네릭 하고, 형변환할때 String 이라고 써주면 된다. 
		System.out.println(list);
		System.out.println(i);
	}
//지네릭스 - 타입체크 강화!!! 타입의 안정성을 제공한다. 
//타입체크와 형변환을 생략할 수 있으므로 코드가 간결해진다.
}
