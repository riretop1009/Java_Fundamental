package java_20210430;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int month = 12;
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
		System.out.println(month + "월은 " + season + " 입니다."); */
		// Run Configurations-> Arguments-> Program aguments
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch(month) {
		case 12 : 
		case 1 :
		case 2 :
			season	= "겨울";break;
		case 3 : 
		case 4 :
		case 5 :
			season	= "봄";break;
		case 6 : 
		case 7 :
		case 8 :
			season	= "여름";break;
		case 9 : 
		case 10 :
		case 11 :
			season	= "가을";break;
		
		default: season = "없는 계절";
		
		}
		System.out.println(month + "월은 " + season +" 입니다.");
	
	}

}
