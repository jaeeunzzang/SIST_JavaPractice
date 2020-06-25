package New.practice;

import java.util.Scanner;

public class ScannerSwitchTest {
	Scanner sc=new Scanner(System.in);
//변수,연산자,제어문-->배열

	public void display(String name, int age, String address) {
		System.out.println("\n"+name);
		System.out.println(age);
		System.out.println(address);
	}

	public String re_input(String name) {
		System.out.println("수정할 이름 입력:");
		name=sc.next();
		return name;

	}

	public String re_input_add(String address) {
		System.out.println("수정할 주소 입력:");
		address=sc.next();
		return address;
	}

	public int re_input(int age) {
		System.out.println("수정할 나이 입력:");
		age=sc.nextInt();
		return age;
	}

	public void controlTest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name:");
		String name = sc.next();
		int age = 0, num = 0, renum = 0;
		do {
			System.out.println("Age:");
			System.out.println("1~100사이");
			age = sc.nextInt();
		} while (!(age >= 1 && age <= 100));
		System.out.println("Address:");
		String address = sc.next();
		do {
			System.out.println("\n1.display\n2.re-input\n3.quit");
			num = sc.nextInt();
			switch (num)

			{
			case 1:
				display(name, age, address);
				continue;
			case 2:
				do {
					System.out.println("1.Re_Name\n2.Re_Age\n3.Re_Address");
					renum = sc.nextInt();
					switch (renum) {
					case 1:
						name=re_input(name);
						break;
					case 2:
						age=re_input(age);
						break;
					case 3:
						address=re_input_add(address);
						break;
					default:
						System.out.println("\n정확한 번호 입력");
						continue;
					}
				} while (!(renum == 1 || renum == 2 || renum == 3));
				continue;

			case 3:
				System.out.println("종료");
				break;
			}
		} while (num != 3);

	}

	public static void main(String[] args) {
		ScannerSwitchTest sst = new ScannerSwitchTest();
		sst.controlTest();

	}
}
