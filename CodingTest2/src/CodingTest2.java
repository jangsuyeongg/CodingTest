import java.util.HashSet;

public class CodingTest2 {
	public static int[] solution(int[] numbers) {
		HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length;j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

	public static void main(String[] args) {
		int[] numbers = {0,2,5,7};
		int[] result = solution(numbers);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}

	}
}
