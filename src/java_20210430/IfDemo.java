package java_20210430;

public class IfDemo {
	public static void main(String[] args) {
		int month = 12;
		// 매개변수 args
		// Run Configurations-> Arguments-> Program aguments
		// int month = Integer.parseInt(args[0]);
		String season = "";

		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
			// else if (month>=3 && month<=5) { 비교연산자를 통해서도 문장을 만들 수 있다.
		} else if (month == 3 || month == 4 || month == 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		} else {
			season = "없는 계절";
		}
		System.out.println(month + "월은 " + season + " 입니다.");

		int a = 125900;
		double d = 125234.789;
		String name = "성영한";
		// printf를 쓸 때는 항상 문장 마지막에 %n으로 개행을 해줘야한다.
		System.out.printf("a는 %,d 입니다. %n", a);
		System.out.printf("b는 %,.2f 입니다. %n", d);
		System.out.printf("저는 %s, %d, %f 입니다.%n", name, a, d);

		int a1 = 100;
		String msg = "";
		if (a1 % 2 == 0) {
			msg = "짝수";
		} else {
			msg = "홀수";
		}
		System.out.println(msg);

		// if문 대신 깔끔하게 조건연산자(삼항연산자)를 이용해서 코딩할 수 있다.
		msg = (a1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(msg);
	}
}
