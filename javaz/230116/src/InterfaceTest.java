interface IMovable {
	// interface는 default 선언자가 public static으로 선언됨 주의!
	void move(int x, int y);
}

interface IFighteralbe extends IMovable {
	
}

class Fighter implements IMovable {

	@Override
	// override 되는 메서드도 public으로 선언해줘야 함
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
