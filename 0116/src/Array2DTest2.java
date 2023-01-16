
public class Array2DTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arry4 = new int[][] {
			{10,20,30,40,0},
			{1,2,3,4,0},
			{100,200,300,400,0},
			{0,0,0,0,0},
		};
		
		for(int i=0; i<arry4.length-1; i++) {
			int rtot = 0;
			for(int j=0; j<arry4[0].length-1; j++) {
				rtot += arry4[i][j]; //행별 합계
				arry4[3][4] += arry4[i][j]; // 총합계
			}
			arry4[i][4] = rtot;
//			System.out.println(rtot); 바로 밑에랑 값 똑같음
			System.out.println(arry4[i][4]); //행별합계 i마다 출력
		}
		System.out.println(arry4[3][4]); //총 합계출력
		
		
		for(int i = 0; i<arry4.length; i++) {
			int rtot = 0;
			for(int j=0; j<arry4.length; j++) {
				rtot += arry4[j][i]; // j (각 행의 첫번째 원소 고정하고 i가 변경되면서 열의 합 차례대로 출력
			}
			arry4[3][i] = rtot; // 3행에 저장 (3행의 각 열에)
			System.out.println(rtot); //반복문 실행될때마다 출력
		}
		
		
		for(int i = 0; i<arry4.length-1; i++) {
			for(int j = 0; j<arry4.length-1; j++) {
				System.out.println(arry4[i][j] +'\t'); 
			} // '\t'을 하니까 값이 이상해진다 무슨의미일까 ??
			System.out.println();
		}
	}
	
	

}
