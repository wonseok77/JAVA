package pac;

public class Person {
	private int age;
	private String name;
	
	// private은 class내에서만 써라
	// 메서드도 private 붙을 수 있다
	// default 앞에 아무것도 안쓴것 같은 package안에 다른 class도 가져다 써라
	// protect default + 상속 (기본기능 + 추가, 변경 [오버라이딩]) 구글링해서 갖다쓰기도
	// 내 자식들은 마음대로 갖다써
	// private은 자식들도 갖다쓰지못한다
	// public >> protected >> default >> private (★중요★)
	// 클래스는 public인데 생성자가 public이 아니면 쓸 수 없다(같은 접근자를 가져야한다)
	
	
	public int getAge() {
		return age;
	}
	
	
	
	public void setAge(int age) {
		if(age>=0)
			this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	

}
