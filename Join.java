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
		System.out.println("### 다시 입력해 주세요 ###");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 6 || name.length() < 0) {
			if (name.length() > 6) {
				System.out.println("이름이 너무 깁니다. (6자 이내)");
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
				System.out.println("나이가 너무 많습니다.");
				err();
			} else {
				System.out.println("나이가 너무 적습니다");
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
				System.out.println("비밀번호가 너무 짧습니다. (4자 이상)");
				err();
			} else {
				System.out.println("비밀번호가 너무 깁니다. (10자 이내)");
				err();
			}
		}
		this.pw = pw;
	}
}
