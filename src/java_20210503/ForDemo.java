package java_20210503;

public class ForDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);
		// 안좋은 코드 왜? 짝수면 5번만 구하면되는거라 그렇다.
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.printf("1부터 10까지 짝수의 합은 %d 입니다.%n", sum);

		sum = 0;
		for (int i = 2; i <= 10; i += 2) {
			sum = sum + i;
		}
		System.out.printf("1부터 10까지 짝수의 합은 %d 입니다.%n", sum);

		for (int first = 2; first <= 9; first++) {
			System.out.printf("%d단 입니다.%n", first);
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d %n", first, second, first * second);
			}
		}
		int totalCountOfPrimeNumber = 0;
		int totalIndex = 0;

		for (int i = 2; i <= 100; i++) {
			int count = 0;

			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
				totalIndex++;
			}
			if (count == 0) {
				totalCountOfPrimeNumber++;
				System.out.print(i + "\t");
			}
			totalIndex++;
		}
		System.out.println();
		System.out.println(totalCountOfPrimeNumber);
		System.out.println(totalIndex);
		/*
		 * } }
		 */
		//별 그리기 놀이 
		for (int k = 1; k < 5; k++) {
			if (k == 1) {
				System.out.println("*");
			} else if (k == 2) {
				System.out.println("**");
			} else if (k == 3) {
				System.out.println("***");
			} else {
				System.out.println("****");
			}
		}
		String star = "";
		int j = 4;
		for (int k = 1; k < 9; k++) {
			if (k % j == 1) {
				star = "****";
			} else if (k % j == 2) {
				star = "***";
			} else if (k % j == 3) {
				star = "**";
			} else {
				star = "*";
			}
			System.out.printf("%s %n", star);
		}
	}
}