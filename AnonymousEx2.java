package inner;

public class AnonymousEx2 /*extends ArrayListShow*/ {
	// private ArrayListShow list = new ArrayListShow(); // ���԰���-->�������̵尡 �Ұ���.

	
	public void action() {
		// list.add();
		//this.add();
		new ArrayListShow() { //���� �͸�Ŭ����
			
			@Override
			public void add() { //�͸�Ŭ�����������̵�
				// TODO Auto-generated method stub
				super.add();
			}
		};
	}

	/*@Override //��ӹ޾����� �������̵�
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
