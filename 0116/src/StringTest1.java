import java.util.StringTokenizer;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "string";
		String str2 = "string";
		String str3 = new String("string");
		String str4 = new String("string");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		
//		Person p1 = new Person(10, "hong");
//		Person p2 = new Person(10, "hong");
//		Person p3 = p1;
//		System.out.println(p1==p2); False
//		System.out.println(p1==p3); True
		
		
		System.out.println(str1.charAt(5));
		String rstr = str1.replace('i','o');
		System.out.println(rstr);
		System.out.println(str1);
		
		String animals = "monkey, dog-cat";
		String[] animalArr = animals.split(",");
		for(String ani : animalArr) {
			System.out.println(ani);
		}
		
		
		StringTokenizer stk = new StringTokenizer(animals, ",-"); //default는 space
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		
		// INFRAAAAA, 수요일날 JAVA만 금요일날 DataBase 목금 Servlet, JSP
		// 실기 JAVA 6개, 필기 JAVA + DB 20개
	}

}
