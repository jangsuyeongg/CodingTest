import java.util.ArrayList;
import java.util.List;



class Product {}
class Tv extends Product {}
class Audio extends Product {}
public class GenericTest2 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		productList.add(new Tv());
		productList.add(new Audio());
		List<Tv> tvList2 = new ArrayList<Tv>(); // 다형성  부모 - 자손 이라서 가능하다
		
		
		tvList.add(new Tv());
		//tvList.add(new Audio()); 에러
		
		printAll(productList);
		//printAll(tvList); 에러난다 왜냐면 메서드에 제너릭이 Product 이기 때문
		
		
	}
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}
}
