package With.Hyo_eun이었던것;

public class Admin {
	private static String adminID;
	private static String adminPw;
	static {
		adminID = "admin";
		adminPw = "1234";
	}

	public Admin() {

	}

	public String getAdminID() {
		return adminID;
	}

	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

}
