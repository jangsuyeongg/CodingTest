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
		List<Tv> tvList2 = new ArrayList<Tv>(); // ������  �θ� - �ڼ� �̶� �����ϴ�
		
		
		tvList.add(new Tv());
		//tvList.add(new Audio()); ����
		
		printAll(productList);
		//printAll(tvList); �������� �ֳĸ� �޼��忡 ���ʸ��� Product �̱� ����
		
		
	}
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}
}
