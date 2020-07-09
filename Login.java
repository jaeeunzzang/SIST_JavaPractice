package With.Hyo_eun이었던것;

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
					System.out.println("관리자 ID가 다릅니다.");
				}
			} while (true);
			do {
				System.out.print("PassWord: ");
				pw = sc.next();
				if (CheckPw()) {
					break;
				} else {
					System.out.println("관리자 PassWord가 다릅니다.");
				}
			} while (true);
			System.out.println("\n### 로그인 성공 ###\n");
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
