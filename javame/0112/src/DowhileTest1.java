import java.util.Scanner;
// Ctrl + shift + O 인가
// 이름붙은(Label) 반복문 멀리있는 반복문을 탈출할때 유리하다
// Loop1 : for(int i = 2; i <= 9; i++) {
// 무한반복문 if break로 반드시 빠져나와야 한다
public class DowhileTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int data;
		do {
			data = sc.nextInt();
			sum += data;
		} while(data!=0);
		
		System.out.println(sum);
	}
}
