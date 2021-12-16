import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
	public HashMapTest() {
		// Map interface�� ��ӹ��� Ŭ������ key, value�� ����.
		//1. HashMap�� key�� value�����͸� �����Ѵ�.
		//2. TreeMap�� key�� value�� �����͸� �����ϰ�, key�������� ���ĵȴ�.

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,  "ȫ�浿");
		hm.put(100,"�������");
		hm.put(50,"�̼���");
		hm.put(25, "�念��");
		hm.put(33, "���·�");
	
		String name = hm.get(25); // int--> Integer
		System.out.println("25->"+ name);
		
		//HashMap���� key����� ���Ͽ� Set�� ����ش�.
		Set<Integer> keyList = hm.keySet();
		Iterator<Integer> ii = keyList.iterator();
		while(ii.hasNext()) {
			int k = ii.next();
			System.out.println("key="+k+", value="+hm.get(k));
		}
		HashMap<String , MemberVO> hm2 = new HashMap<String , MemberVO>();
		hm2.put("ȫ�浿", new MemberVO("ȫ�浿","��ȹ��","2020-10-10", 5000));
		hm2.put("�̼���", new MemberVO("�̼���","�Ѱ���","2020-01-01", 6000));
		hm2.put("�念��", new MemberVO("�念��","�ѹ���","2020-07-08", 3000));
		hm2.put("�������", new MemberVO("�������","�λ��","2020-02-01", 7000));
		hm2.put("���·�", new MemberVO("���·�","��ȹ��","2020-03-05", 6000));
	
		Set<String> memberKey= hm2.keySet();
		Iterator<String> iii = memberKey.iterator();
		while(iii.hasNext()) {
			String key = iii.next();
			MemberVO val = hm2.get(key);
			System.out.println(val.toString());
		}
	}
	
	public static void main(String[] args) {
		new HashMapTest();

	}

}
