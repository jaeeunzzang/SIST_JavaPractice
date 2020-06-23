package New.practice;

import java.util.Scanner;

public class LoopTest {
	public void firstLoop() {
		int i = 0, j = 0;
		while (true) {
			i++;
			System.out.println("i=" + i);
			while (true) {
				j++;
				System.out.println("j=" + j);
				if (j > 2)
					break;
			}
			j = 0;
			if (i > 3)
				break;

		}System.out.println();
	}

	public void secondLoop(int num) {
		int i, j;

		for (i = 1; i <= num; i += 2) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 0; i <= num; i += 2) {
			for (j = num; i < j - 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
	}

	public void thirdLoop() {
		int i, j;
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.printf("%dX%d=%d\t", i, j, i * j);
			}
			System.out.println();
		}System.out.println();
	}

	public void fourthLoop(int i) {
		int a;
		for (a = 1; a <= 9; a++) {
			System.out.printf("%dX%d=%d\n", i, a, i * a);
		}System.out.println();
	}

	public static void main(String[] args) {
		LoopTest lt = new LoopTest();
		Scanner sc = new Scanner(System.in);
		int x;
		while (true) {
			System.out.println("수행할 연산");
			System.out.println("1.while반복문 \n2.입력숫자만큼 별찍기 \n3.전체구구단 \n4.입력한숫자구구단\n5.종료\n");
			int num = sc.nextInt();
			if (num == 5) // while 무한루프 탈출
			{
				System.out.println("종료함");
				break;
			}

			switch (num) {
			case 1:
				lt.firstLoop();
				break;
			case 2:
				System.out.println("최대 별 갯수");
				x = sc.nextInt();
				lt.secondLoop(x);
				break;
			case 3:
				lt.thirdLoop();
				break;
			case 4:
				System.out.println("계산할 숫자 입력");
				x = sc.nextInt();
				lt.fourthLoop(x);
				break;

			default:
				System.out.println("정확한 번호 입력");
				break;
			}
		}

	}
}
