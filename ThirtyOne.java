package thirtyone;

import java.util.Scanner;

public class ThirtyOne {
	Scanner sc = new Scanner(System.in);
	static int index = 0;
	boolean flag = true;
	static int[] number = new int[31];
	static {
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
	}

	public void disp() {
		for (int i : number) {
			System.out.println(i);
		}
	}

	public void dispIndex(int destNum) {

		for (int cnt = 0; cnt < destNum; cnt++) {
			System.out.print(number[index] + " ");
			index++;
		}
		System.out.println();
	}

	public boolean cntCheck(int cnt) {
		if (cnt > 3 || cnt < 1) {
			return true;
		}
		return false;
	}

	public void player1() {
		String player1 = "Player 1";
		String number;
		System.out.println("Player1's Turn");
		try {
			while (true) {
				System.out.print("1~3���� ������ ������ �Է��ϼ��� >>");
				number = sc.next();
				if (number.length() > 1 || cntCheck(Integer.parseInt(number))) {
					System.out.println("������ ������ϴ�.");
					continue;
				}
				if (number.length() == 1 && cntCheck(Integer.parseInt(number)) == false) {
					int x = Integer.parseInt(number);
					dispIndex(x);
					break;
				}
				break;
			} // while
			if (loseCheck()) {
				flag = false;
				lose(player1);
			}

		} catch (NumberFormatException e) {
			System.out.println("���ڷθ� �Է����ּ���");
			player1();
		} catch (ArrayIndexOutOfBoundsException e) {
			lose(player1);
		}
	}

	public void player2() {
		String player2 = "Player 2";
		String number;
		System.out.println("Player2's Turn");
		try {
			while (true) {
				System.out.print("1~3���� ������ ������ �Է��ϼ��� >>");
				number = sc.next();
				if (number.length() > 1 || cntCheck(Integer.parseInt(number))) {
					System.out.println("������ ������ϴ�.");
					continue;
				}
				if (number.length() == 1 && cntCheck(Integer.parseInt(number)) == false) {
					int x = Integer.parseInt(number);
					dispIndex(x);
					break;
				}
				break;
			} // while
			if (loseCheck()) {
				flag = false;
				lose(player2);
			}

		} catch (NumberFormatException e) {
			System.out.println("���ڷθ� �Է����ּ���");
			player2();
		} catch (ArrayIndexOutOfBoundsException e) {
			lose(player2);
		}
	}

	public void computer() {
		System.out.println("Computer's Turn");
		try {
			String computer = "Computer";
			int x = (int) (Math.random() * 10) % 3 + 1;
			if (cntCheck(x) == false) {
				dispIndex(x);
			}
			if (loseCheck()) {
				flag = false;
				lose(computer);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			lose("Computer");
		}
	}

	public boolean loseCheck() {
		if (index == number.length) {
			return true;
		}
		return false;
	}

	public void lose(String player) {
		System.out.println("\nXXXXXXXXXXXXXXXX");
		System.out.println("X " + player + " �й�  X");
		System.out.println("XXXXXXXXXXXXXXXX\n");
		this.index = 0;
		flag = true;
		menu();
	}

	public void startPlayer() {
		while (flag == true) {
			player1();
			if (flag == false)
				break;
			player2();
		}
	}

	public void startComputer() {
		while (flag == true) {
			player1();
			if (flag == false)
				break;
			computer();
		}
	}

	public void menu() {
		while (true) {
			System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");
			System.out.println("��    1.With Computer  2.Two Player  3.QUIT ��");
			System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");
			switch (sc.nextInt()) {
			case 1:
				startComputer();
				continue;
			case 2:
				startPlayer();
				continue;
			case 3:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("��Ȯ�� ��ȣ�� �Է����ּ���.");
				continue;
			}
			break;
		}
	}

	public static void main(String[] args) {
		ThirtyOne to = new ThirtyOne();
		to.menu();

	}
}
