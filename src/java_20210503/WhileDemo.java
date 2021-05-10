package java_20210503;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1; // 초기값 선언
		while (i <= 10) { // 조건 선언
			sum += i;
			i++; // 증감 선언
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.%n", sum);

		int sum1 = 0;
		int j = 1;
		for (; j <= 10;) {
			sum1 += j;
			j++;

		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.%n", sum1);
		// 구구단을 이중와일루프로 짜봐라

		int first = 2;
		while (first <9) {
			System.out.printf("%d단 입니다.%n", first);
			int second = 0;
			while (second < 9) {
				second++;
				System.out.printf("%d*%d=%d%n", first, second, first * second);
			}
			first++;
		}

	}
}
