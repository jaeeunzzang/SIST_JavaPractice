package With.Hyo_eun�̾�����;

import java.util.Scanner;

public class Login {
	Scanner sc = new Scanner(System.in);
	Admin ad = new Admin();
	private String id;
	private String pw;

	public Login() {

	}

	public void logInMenu() {
		System.out.println("---------- Admin Login ----------");
		while (true) {
			do {
				System.out.print("ID: ");
				id = sc.next();
				if (CheckId()) {
					break;
				} else {
					System.out.println("������ ID�� �ٸ��ϴ�.");
				}
			} while (true);
			do {
				System.out.print("PassWord: ");
				pw = sc.next();
				if (CheckPw()) {
					break;
				} else {
					System.out.println("������ PassWord�� �ٸ��ϴ�.");
				}
			} while (true);
			System.out.println("\n### �α��� ���� ###\n");
			break;
		}
	}

	public boolean CheckId() {
		if (id.equals(ad.getAdminID())) {
			return true;
		}
		return false;
	}

	public boolean CheckPw() {
		if (pw.equals(ad.getAdminPw())) {
			return true;
		}
		return false;
	}

}
