package sist.com.variable;

import java.util.Scanner;

public class MethodTest6 {
	public int add(int x, int y) {
		int result = x + y;
		return result;

	}

	public int sub(int x, int y) {
		int result = x - y;
		return result;
	}

	public int mul(int x, int y) {
		int result = x * y;
		return result;
	}

	public int div(int x, int y) {
		int result = x / y;
		return result;
	}

	public void start() {
		System.out.println("\nchoose number\n");
		System.out.println("1.add \n2.sub\n3.mul\n4.div\n5.quit\n");
		return;
	}

	public static void main(String[] args) {
		int a, x, y, result;
		MethodTest6 cal = new MethodTest6();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello,calculator start");
		cal.start();

		do {
			a = sc.nextInt();

			if (a == 1) {
				System.out.println("더할 두 값을 입력.\n");
				result = cal.add(x = sc.nextInt(), y = sc.nextInt());
				System.out.println(result);
				cal.start();
			} else if (a == 2) {
				System.out.println("뺄 두 값을 입력.\n");
				result = cal.sub(x = sc.nextInt(), y = sc.nextInt());
				System.out.println(result);
				cal.start();
			} else if (a == 3) {
				System.out.println("곱할 두 값을 입력.\n");
				result = cal.mul(x = sc.nextInt(), y = sc.nextInt());
				System.out.println(result);
				cal.start();
			} else if (a == 4) {
				System.out.println("나눌 두 값을 입력.\n");
				result = cal.div(x = sc.nextInt(), y = sc.nextInt());
				System.out.println(result);
				cal.start();
			} else if (a == 5) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("정확한 번호를 입력");
				cal.start();
				continue;
			}
		} while (a != 5);

	}
}
