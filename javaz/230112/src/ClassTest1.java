
public class ClassTest1 {

	public static void personinfo(Person p) {
		p.age = 40;
		System.out.println(p.info());
	}
	
	public static void main(String[] args) {
		Person p = new Person(20, "박지수", 185.3);
//		Person p2 = p;
//		p2.age = 30;
//		
//		System.out.println(p.info());
//		System.out.println(p2.info());
		
		personinfo(p);
		System.out.println(p.info());
	}

}

class Person {
	int age;
	String name;
	double height;
	
	Person(int age, String name, double height) {
		this.age = age;
		this.name = name;
		this.height = height;
	}
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height;
	}
}