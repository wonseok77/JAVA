class MyClass3 {
	static int[] narr = new int[10];
	static {
		// static block
		// 프로그램 실행 클래스 로드 스테틱 메모리에 할당될때 초기화
		// 잘 모르겠다
		// 클래스 활용하는 코드, 제약조건도 있다, 수업안에서 했던 내용을 완벽하게 이해해서 실제 시험문제처럼
		// 상속(기반) -> 다형성
		// 인터페이스 - 클래스의 특징 가지고 있다(상속, 다형성)
		for(int i=0; i<narr.length; i++) {
			narr[i] = (int)(Math.random()*100)+1;
		}
	}
	
	
	{	//인스턴스 블럭
	}
	
}


public class StaticTest3 {

	public static void main(String[] args) {
	}
}
