import java.util.Random;

public class ArraySelectionSort {

	public static void main(String[] args) {
		Random r = new Random();
		int rInt[] = new int[10];
		
		for(int i=0; i<rInt.length; i++) {
			rInt[i] = r.nextInt(100)+1;
		}
		for(int point=0; point<rInt.length-1; point++) {
			for(int i=point+1;i<rInt.length;i++) {
				if(rInt[point] > rInt[i]) {
					int temp = rInt[point];
					rInt[point] = rInt[i];
					rInt[i] = temp;
				}
			}
		}
		//Ãâ·Â
		for(int data: rInt) {
			System.out.print(data+"\t");
		}
		System.out.println();
		}

	}


