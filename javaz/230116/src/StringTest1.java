import java.util.StringTokenizer;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = "string";		// 메모리 data - ReadOnly 영역에 저장
		String str2 = "string"; 	// 문자열이 같으면 메모리 레퍼런스도 같음
		String str3 = new String("string");		// 메모리 heap 영역에 저장
		String str4 = new String("string");
		
//		System.out.println(str1 == str2);
//		System.out.println(str3 == str4);
		
		System.out.println(str1.charAt(5));
		System.out.println(str1.toUpperCase());
		
		String rstr = str1.replace('i', 'o');
		System.out.println(str1);		// 원본은 안바뀜
		System.out.println(rstr);		// return 받아서 쓸 것
		
//		String animals = "monkey, dog, cat";
//		String[] animalArr = animals.split(", ");
//		for(String ani : animalArr) {
//			System.out.println(ani);
//		}
		
		String animals = "monkey,dog-cat";
		StringTokenizer stk = new StringTokenizer(animals, ",-"); 
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
	}

}
