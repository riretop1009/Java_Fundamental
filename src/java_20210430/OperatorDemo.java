package java_20210430;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0.0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		c = a * b;
		System.out.println(c);

		c = b / a;
		System.out.println(c);

		d = (double) b / (double) a;
		System.out.println(d);

		// case 1. d = (double)(b/ a);
		// case 2. d = (double)((double) b/ (double)a);

		// 가장 좋은 해답 큰 쪽에 맞춰서 자동으로 casting이 진행 되기 때문에 double로 알아서 전체 연산값이 변환된다.
		d = (double) b / a;
		System.out.println(d);

		// 나머지를 어다 씁니까? 내가 이게 짝수 인지 홀수 인지 알고 싶어 그러면 어떻게 하면 돼??
		// 2로 나누면 알 수 있다. 이처럼 나머지를 통해서 분류할 때 이점을 가져올 수 있다.
		c = b % a;
		System.out.println(c);

		if (a % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

		// 복합대입 연산자

		a += b; // a= a + b;

		System.out.println(a);

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// sum = sum +i;
			sum += i; // <- 위의 내용보다 이렇게 적을 수 있는 역량(뇌)이 필요하다.
		}
		System.out.println(sum);

		// 증감 연산자 단독으로 쓸 때는 앞에 붙든 뒤에 붙든 차이가 없으나 다른 식에 들어가서 쓰면 차이가 있다.
		a++;
		++b;

		System.out.println(a);
		System.out.println(b);

		a = 10;
		// 대입 후 증가
		// c = a;
		// a++;
		c = a++;
		System.out.println(c);
		System.out.println(a);

		a = 10; // a를 10으로 초기화한다. (초기화 = 값을 설정 한다.)
		// 증가 후 대입
		// a++;
		// c = a;
		c = ++a;
		System.out.println(c);
		System.out.println(a);

		a = 10;
		b = 20;

		boolean isSuccess = a > b;
		System.out.println(isSuccess);
		// 두 줄 코딩은 좋지 않다.
		if (a > b) {
			System.out.println("a가 b보다 크다.");
		} else {
			System.out.println("a가 b보다 작다.");
		}

		d = 10.0;
		isSuccess = a == d;
		System.out.println(isSuccess);

		// 논리연산자
		a = 10;
		b = 20;
		// A && B => A가 false이면 B를 연산하지 않음 (short circuit 발생)
		// A || B => A가 True이면 B를 연산하지 않음 (short circuit 발생)
		isSuccess = (a == b) || (++a == b++); // 괄호는 없어도 된다 헷갈리까봐 적어둔거
		// isSuccess = (a==b) && (++a == b++);
		// short-circuit이 발생하기에 a=10,b=20으로 나온다.
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
	}
}
