package java_20210504;

public class LotteryDemo {

	public static void main(String[] args) {
//		 Math.random() => 0보다 크거나 같고 1보다 작은 임의 double 값을 반환.
		
		int[] lotto = new int[6];
////		int[] compare = {lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5]};
//						new int[6];
//		for(int i=0; i < lotto.length ;i++) {
////		0보다 크고 45보다 작은 double값을 반환 (int로 casting하면 0보다 크고 44보다 작은 int값을 반환 (버림)) 그래서 + 1		
//			int random = (int) (Math.random() * 45) + 1;
//			lotto[i]= random ;
//			    if (lotto[i] == compare[i]]) {
//				i--; 	j--			
//			}
//			j++
//		}
//		
//		for(int i=0; i<lotto.length; i++) {
//			System.out.print(lotto[i]+"\t");
//		}
		
		for(int i=0; i<lotto.length; i++) {
////		0보다 크고 45보다 작은 double값을 반환 (int로 casting하면 0보다 크고 44보다 작은 int값을 반환 (버림)) 그래서 + 1		
			int random = (int) (Math.random() * 45) + 1;
			boolean isExisted = false;
			for(int j=0;j<i;j++) {
				if(random == lotto[j]) {
					isExisted = true;
					break;
				}
			}
			if(isExisted) {
				i--;
			}else {
				lotto[i] = random ;
			}
		}
//		오름차순 정렬하는 코드 
		for(itn i=0; i<lotto.length;i++) {
			
		}
	}
}
