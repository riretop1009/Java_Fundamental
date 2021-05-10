package java_20210430;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력 만들기 1. 1년 1월 1일은 월요일 2. 1년은 365일 이고, 윤년은 366일 - 2월 29일 3. 윤년은 4년 마다 발생하고 그
		 * 중에서 100의 배수는 제외하고 400의배수는 제외하지 않는다. 4. 2021년 4월 29일은 무슨 요일 일까요? 힌트) 2020년까지 총
		 * 일 수, 1-3월까지 총 일 수, 30을 더해서 7로 나눈 나머지가 1이면 월료일, 2이면 화요일,,,
		 */
		int year = 2021;
		int month = 4;
		int day = 30;

		/*
		 * int dayCount = 0; if (month == 1) { dayCount = 31; } else if (month == 2) {
		 * dayCount = 31+28; } else if (month == 3) { dayCount = "31"; } else if (month
		 * == 4) { dayCount = "30"; } else if (month == 5) { dayCount = "31"; } else if
		 * (month == 6) { dayCount = "30"; } else if (month == 7) { dayCount = "31"; }
		 * else if (month == 8) { dayCount = "31"; } else if (month == 9) { dayCount =
		 * "30"; } else if (month == 10) { dayCount = "31"; } else if (month == 11) {
		 * dayCount = "30"; } else { dayCount = "31"; }
		 */

		int leapYearCount = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		int totalDayCount = (year - 1) * 365 + leapYearCount + 31 + 28 + 31 + day;
		System.out.println(leapYearCount);
		System.out.println(totalDayCount);
		int date = totalDayCount % 7;
		if (date == 1) {
			System.out.println("월요일");
		} else if (date == 2) {
			System.out.println("화요일");
		} else if (date == 3) {
			System.out.println("수요일");
		} else if (date == 4) {
			System.out.println("목요일");
		} else if (date == 5) {
			System.out.println("금요일");
		} else if (date == 6) {
			System.out.println("토요일");
		} else
			System.out.println("일요일");
/////////////////////////////////////////////////////////////
		int dayOfWeek = totalDayCount % 7;
		String message = "";
		if (dayOfWeek == 1) {
			message = "월요일";
		} else if (dayOfWeek == 2) {
			message = "화요일";
		} else if (dayOfWeek == 3) {
			message = "수요일";
		} else if (dayOfWeek == 4) {
			message = "목요일";
		} else if (dayOfWeek == 5) {
			message = "금요일";
		} else if (dayOfWeek == 6) {
			message = "토요일";
		} else if (dayOfWeek == 0) {
			message = "일요일";
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month, day, message);

	}
}
