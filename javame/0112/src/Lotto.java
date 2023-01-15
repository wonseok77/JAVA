
public class Lotto {

	public static void main(String[] args) {
		int [] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i + 1;
		}
		
		for(int j=0; j	<1000; j++) {
			int idx1 = (int)(Math.random()*45);
			int idx2 = (int)(Math.random()*45);
			if(idx1!=idx2) {
				int temp = ball[idx1];
				ball[idx1] = ball[idx2];
				ball[idx2] = temp;
			}
		}
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+"\t");
		}
	}
}

// 클래스도 하나의 자료형이라고 이해하자
// Class 4byte (주소가 할당된다), 자료형이긴하지만 메모리 저장 형태가 다르다
// new Person < - 객체
// 붕어빵틀 = 클래스, 붕어빵 = 객체의 관계, 객체를 다른말로 인스턴스라고 하기도 한다
// 속성 = 변수, 기능 = 메서드