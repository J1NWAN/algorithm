
public class multiples_Of_3_and_5 {

	public static void main(String[] args) {
		int answer = 0;

		for (int i = 0; i < 1000; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				answer += i;
			}
		}

		System.out.println("3, 5의 배수의 합: " + answer);

	}

}
