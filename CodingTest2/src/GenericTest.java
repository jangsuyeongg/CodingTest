import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer i = (Integer)list.get(2); //������ OK  ClassCastException - ����ȯ���� , �����Ϸ��� �Ѱ��� , ����� �߻��ϴ� ����
		//String ii = (String)list.get(0);
		//�׷��� ����ϴ°� ���׸�!! ��Ƽ���ۿ� �����ٰ� ���� ǥ������. �ֳĸ� �����Ͽ��� ��°� ����� �������� �����ϱ�!! 
		// �׸��� �̹� ��Ƽ�� �ۿ� �ȵǴϱ� ����ȯ�� (Integer) ��� ���ص� �ȴ�.
		//���࿡ int �� String �̶� �Ѵ� ���� ������ object �� ���׸� �ϰ�, ����ȯ�Ҷ� String �̶�� ���ָ� �ȴ�. 
		System.out.println(list);
		System.out.println(i);
	}
//���׸��� - Ÿ��üũ ��ȭ!!! Ÿ���� �������� �����Ѵ�. 
//Ÿ��üũ�� ����ȯ�� ������ �� �����Ƿ� �ڵ尡 ����������.
}
