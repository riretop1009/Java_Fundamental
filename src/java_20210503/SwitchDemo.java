package java_20210503;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Run Configurations-> Arguments-> Program aguments
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch (month) {
		// 이렇게도 표현 할 수 있다.
		case 12, 1, 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;

		default:
			season = "없는 계절";

		}
		System.out.println(month + "월은 " + season + " 입니다.");

	}
}
