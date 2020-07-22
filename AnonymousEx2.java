package inner;

public class AnonymousEx2 /*extends ArrayListShow*/ {
	// private ArrayListShow list = new ArrayListShow(); // 포함관계-->오버라이드가 불가능.

	
	public void action() {
		// list.add();
		//this.add();
		new ArrayListShow() { //내부 익명클래스
			
			@Override
			public void add() { //익명클래스오버라이드
				// TODO Auto-generated method stub
				super.add();
			}
		};
	}

	/*@Override //상속받았을때 오버라이드
	public void add() {
		// TODO Auto-generated method stub
		super.add();
	}
*/
	public static void main(String[] args) {
		AnonymousEx2 a = new AnonymousEx2();
		a.action();
	}

}
