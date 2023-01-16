interface IClick{
	void click();
}

class MyButton{
	IClick iclick;
	void onClick() {
		System.out.println("꾹 눌림");
		if(iclick!=null) {
			iclick.click();
		}
	}
	
	void addClickListner(IClick iclick) {
		this.iclick = iclick;
	}
}
public class AnonyClassTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyButton loginBtn = new MyButton();
		
		
		// 익명클래스 lambda
		loginBtn.addClickListner(new IClick() {

			@Override
			public void click() {
				System.out.println("로그인 처리");				
			}
			
		});

	}

}
