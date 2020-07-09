package With.Hyo_eun;

class Join {
	private String name;
	private int age;
	private String email;
	private String id;
	private String pw;

	public Join() {

	}

	public Join(String name, int age, String email, String id, String pw) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.id = id;
		this.pw = pw;

	}

	public String toString() {
		return "Member \n[name=" + name + ", age=" + age + ", email=" + email + ", id=" + id + "]";
	}

	public void err() {
		System.out.println("### �ٽ� �Է��� �ּ��� ###");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 6 || name.length() < 0) {
			if (name.length() > 6) {
				System.out.println("�̸��� �ʹ� ��ϴ�. (6�� �̳�)");
				err();
			} else
				err();
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 90 || age < 14) {
			if (age > 90) {
				System.out.println("���̰� �ʹ� �����ϴ�.");
				err();
			} else {
				System.out.println("���̰� �ʹ� �����ϴ�");
				err();
			}
		}
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length() > 25 || email.length() < 5)
			err();

		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		if (pw.length() < 3 || pw.length() > 10) {
			if (pw.length() < 3) {
				System.out.println("��й�ȣ�� �ʹ� ª���ϴ�. (4�� �̻�)");
				err();
			} else {
				System.out.println("��й�ȣ�� �ʹ� ��ϴ�. (10�� �̳�)");
				err();
			}
		}
		this.pw = pw;
	}
}
