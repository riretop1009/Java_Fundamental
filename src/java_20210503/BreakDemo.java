package java_20210503;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		// aa for문(Lable) 이중 반복문일 때 밖으로 나가고싶을때 주로 사용.
		aa: for (int i = 1; i <= 10; i++) {
			if (i == 6)
				break aa;
			sum += i;
		}
		System.out.println("합은 : " + sum);

		outter: for (int i = 2; i <= 9; i++) {
			inner: for (int j = 1; j <= 9; j++) {
				if (i == 4 && j == 8)
					break inner;
				System.out.printf("%d*%d=%d %n", i, j, i * j);

			}
		}

	}
}

