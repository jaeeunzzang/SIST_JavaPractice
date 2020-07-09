package With.Hyo_eun;

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

	public boolean check(String pw, String pw2) {
		if (pw.equals(pw2)) {
			return true;
		}
		return false;
	}

	public void list() {
		System.out.println("-------- Member List --------");
		for (int i = 0; i < cnt; i++) {
			System.out.println(cnt + "번째 " + join[i]);
		}
	}

	public void sort() {
		System.out.println("---------- Sort ------------");

	}

	public void menu() {
		System.out.println("------------ START ------------");
		while (true) {
			System.out.print("1.ADD 2.LIST 3.SORT 5.EXIT >>");
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
			case 5:
				break;
			default:
				continue;

			}
		}
	}

	public static void main(String[] args) {
		JoinMain jm = new JoinMain();
		jm.menu();
	}
}
