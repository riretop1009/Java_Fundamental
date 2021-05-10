package java_20210504;

public class TwoArrayDemo {

	public static void main(String[] args) {
//		2차원 배열의 선언과 생성 (int 뒤에 [][] 는 위치가 아주 자유롭다.자료형 뒤라면 어디든 마음대로 해도 된다.)
		int[][] a = new int [3][2];

//		2차원 배열의 할당
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;
//		2차원 배열은 값이 할당 되어 있는 경우가 많아서 주로 이렇게 쓴다.
		int[][] b = {{10,20},{30,40},{50,60}};
		
//		2차원 배열의 출력
		for(int i=0; i< a.length ; i++) {
			for(int j=0; j < a[i].length ; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		int [] temp = {10,20,30,40,50};
		
		for(int value : temp) {
			System.out.println(value);
		}
		String[] fruits = {"banana","melon","strawberry"};
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
	}

}
