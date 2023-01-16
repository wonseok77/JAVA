import java.util.ArrayList;
import java.util.Iterator;


class Person{
	int age;
	String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String info() {
		return "이름 :" + name + ", 나이"+ age;
	}
}
public class ListTest1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hong");
		list.add("park");
		list.add("song");
		list.add(0,"lee");
		for(Object s: list) {
			System.out.println(s);
		}
		
		ArrayList list2 = new ArrayList();
		list2.add(100);
		list2.add(200);
		
		ArrayList list3 = new ArrayList();
		list3.add(new Person(20, "홍길동"));
		list3.add(new Person(20, "고길동"));
		list3.add(new Person(40, "하길동"));
		
		for(Object p:list3) {
			System.out.println(((Person)p).info());
		}
		
		ArrayList<Person> list4 = new ArrayList(); //제너릭 타입을 지정하는것
		list4.add(new Person(20, "홍길동"));
		list4.add(new Person(30, "고길동"));
		list4.add(new Person(40, "하길동"));
		
		for(Person p:list4) {
			System.out.println(p.info());
		}
		
		Iterator<Person> it = list4.iterator();
		if(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
