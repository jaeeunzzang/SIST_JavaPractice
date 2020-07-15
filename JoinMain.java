package With.Hyo_eun이었던것;

import java.util.Scanner;

public class JoinMain {

	int cnt = 0;
	Scanner sc = new Scanner(System.in);
	Join[] join = new Join[5];

	public boolean isFull() {
		return cnt == join.length - 1;
	}

	public void increment() {
		Join imsi[] = new Join[join.length * 2];
		System.arraycopy(join, 0, imsi, 0, join.length);
		join = imsi;
	}

	public void add() {
		if (isFull()) {
			increment();
		}
		Join j = new Join();
		System.out.println("-------- Add Member --------");
		j.setNum(cnt + 1);
		System.out.println("### " + j.getNum() + "번째 회원 등록  ###\n");

		do {
			System.out.print("Name: ");
			j.setName(sc.next());
		} while (j.getName().length() > 6 || j.getName().length() < 0);

		do {
			System.out.print("Age: ");
			j.setAge(sc.nextInt());
		} while (j.getAge() > 90 || j.getAge() < 14);

		do {
			System.out.print("E-mail: ");
			j.setEmail(sc.next());
		} while (j.getEmail().length() > 25 || j.getEmail().length() < 5);

		do {
			System.out.print("ID: ");
			j.setId(sc.next());
		} while (j.getId().length() > 10 || j.getId().length() < 3);
		do {
			while (true) {
				System.out.print("PassWord: ");
				String pw = sc.next();

				System.out.print("Check PassWord: ");
				String pw2 = sc.next();

				if (check(pw, pw2)) {
					j.setPw(pw);
					break;
				} else {
					System.out.println("입력하신 비밀번호가 다릅니다");
					j.err();
				}
			}
		} while (j.getPw().length() > 10 || j.getPw().length() < 3);
		join[cnt++] = j;

	}

	public boolean check(String a, String b) {
		if (a.equals(b)) {
			return true;
		}
		return false;
	}

	public void list() {
		System.out.println("-------- Member List --------");
		for (int i = 0; i < cnt; i++) {
			System.out.println(join[i]);
		}
	}

	public void sortDisp() {
		System.out.println("-------- Age Sort ASC --------");
		for (int i = 0; i < cnt; i++) {
			System.out.println(join[i]);
		}
	}

	public void sort() {
		Join tmp = null;
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if (join[i].getAge() < join[j].getAge()) {
					tmp = join[i];
					join[i] = join[j];
					join[j] = tmp;
				}
			}
		}
		sortDisp();
	}

	public int search(int num) {
		for (int i = 0; i < cnt; i++) {
			if (join[i].getNum() == num) {
				return join[i].getNum();
			}
		}
		return -1;
	}

	public void delete() {

	}

	public void deleteMain() {
		System.out.print("지울 회원의 번호를 입력해주세요. >>");
		int index = search(sc.nextInt());

		if (index == -1) {
			System.out.println("데이터가 없습니다");
			return;
		}

		System.out.println("delete Member: " + index);
		for (int i = index - 1; i < cnt - 1; i++) {
			join[i] = join[i + 1];
		}
		cnt--; // for

	}

	public void modify(Join join, int index) {
		Join j = join;
		System.out.println("-----MODIFY-----");
		for (int i = 0; i < cnt; i++) {
			if (index == j.getNum()) {
				while (true) {
					System.out.println("1.NAME 2.AGE 3.EMAIL 4.ID 5.PW 6.quit");
					switch (sc.nextInt()) {
					case 1:
						System.out.print("수정할 이름을 입력하세요. >>");
						j.setName(sc.next());
						continue;
					case 2:
						System.out.print("수정할 나이를 입력하세요. >>");
						j.setAge(sc.nextInt());
						continue;
					case 3:
						System.out.print("수정할 이메일을 입력하세요. >>");
						j.setEmail(sc.next());
						continue;
					case 4:
						System.out.print("수정할 ID를 입력하세요. >>");
						j.setId(sc.next());
						continue;
					case 5:
						System.out.println("비밀번호를 변경하기위해 비밀번호를 한번 더 입력해주세요.");
						String pw = sc.next();
						if (check(j.getPw(), pw)) {
							System.out.print("수정할 PW를 입력하세요. >>");
							j.setPw(sc.next());
							continue;
						} else {
							System.out.println("비밀번호가 다릅니다. 다시입력해주세요");
							continue;
						}
					case 6:
						break;
					default:
						System.out.println("정확한 번호를 입력해주세요.");
						continue;
					}// switch
					break;
				} // while
				break;
			} // if
		} // for
	}

	public void modifyMain() {
		System.out.print("수정할 회원의 번호를 입력해주세요: ");
		int index = search(sc.nextInt());
		if (index == -1) {
			System.out.println("데이터가 없습니다");
			return;
		}
		for (int i = 0; i < cnt; i++) {
			if (index == join[i].getNum()) {
				modify(join[i], index);
			}
		}
	}

	public void menu() {
		System.out.println("------------ START ------------");
		while (true) {
			System.out.print("1.ADD 2.LIST 3.SORT 4.DELETE 5.MODIFY 6.EXIT ->");
			switch (sc.nextInt()) {
			case 1:
				add();
				continue;
			case 2:
				list();
				continue;
			case 3:
				sort();
				continue;
			case 4:
				deleteMain();
				continue;
			case 5:
				modifyMain();
				continue;
			case 6:
				System.out.println("종료합니다");
				break;
			default:
				System.out.println("정확한 번호를 입력해 주세요.");
				continue;
			}
		}
	}

	public static void main(String[] args) {
		JoinMain jm = new JoinMain();
		Login l = new Login();
		l.logInMenu();
		jm.menu();
	}
}
