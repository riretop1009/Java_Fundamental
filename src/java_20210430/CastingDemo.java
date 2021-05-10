package java_20210430;

public class CastingDemo {
	public static void main(String[] args) {
		// overflow 발생하여 컴파일 에러
		// byte b1 = 129;

		// circuit 발생 (권장하지 않음)
		byte b1 = (byte) 129;
		System.out.println(b1);

		// cut 발생
		int i1 = (int) 129.25;
		System.out.println(i1);

		// auto-casting(자동 형변환)
		double d1 = 124.5f;
		System.out.println(d1);

		byte b2 = 10;
		byte b3 = 20;
		// 산술 연산자 '+'의 반환값은 int
		// byte b4 = b2 + b3;
		// 오류해결을 위해서 int결과 값을 따로 byte로 캐스팅을 해준다.
		byte b4 = (byte) (b2 + b3);
		// 위의 과정을 가장 올바르게 하기 위해서는 byte를 int로 변환
		int b5 = b2 + b3;

		System.out.println(b4);
		System.out.println(b5);

		// 연결연산자
		// 1. 문자열 + 숫자(정수,실수 모두 포함) => 문자열
		// 2. 숫자 + 문자열 => 문자열
		// 3. 문자열 + 문자열 => 문자열
		// 피연산자의 값들을 보고 연산자가 산술연산자인지 연결연산자인지 파악할 수 있다.
		String str1 = "abc" + 1 + 2;
		String str2 = 1 + 2 + "abc";

		System.out.println(str1);
		System.out.println(str2);
	}
}
