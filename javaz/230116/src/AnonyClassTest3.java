interface IClick {
	void click();
}

class MyButton {
	IClick iclick;
	void onClick() {
		System.out.println("클릭");
		if(iclick != null)
			iclick.click();
	}
	
	void addClickListener(IClick iclick) {
		this.iclick = iclick;
	}
}

public class AnonyClassTest3 {

	public static void main(String[] args) {
		MyButton loginBtn = new MyButton();
		
		// 익명 class
		loginBtn.addClickListener(new IClick() {
			@Override
			public void click() {
				System.out.println("로그인 처리");
			}
		});
		
		loginBtn.onClick();
	}

}
