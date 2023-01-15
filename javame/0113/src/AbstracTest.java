abstract class Shape{
	String color;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	Shape() {}
	Shape(String color) {
		this.color = color;
	}
	abstract void draw();
}

class Circle extends Shape{
	int x, y, r;
	Circle(String color, int x, int y ,int r){
		super(color);
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	int radius;
	@Override
	void draw() {
		System.out.println("[원:색-"+getColor()+", 중심점-("+x+","+y+"), 반지름-"+r+"]");
		// TODO Auto-generated method stub
		
	}
	
}

class Rectangle extends Shape{
	int width, height;
	Rectangle(String color, int width, int height){
		super(color);
		this.width=width;
		this.height=height;
	}
	@Override
	void draw() {
		System.out.println("[사각형:색-"+getColor()+", 넓이-("+width+","+"), 높이-"+height+"]");
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstracTest {
	static Shape [] ss = new Shape[5];
	static int count = 0;
	
	public static void allShapeDraw() {
		for(int i=0; i<count; i++) {
			ss[i].draw();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Shape shape = new Shape("red"); 추상(abstract 클래스는 객체 생성이 불가능하다.

		

		ss[count++] = new Circle("red",10,10,20);
		ss[count++] = new Rectangle("blue",20,10);
		allShapeDraw();
		
	}

}
