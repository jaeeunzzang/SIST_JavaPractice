package practiceJava;

import java.util.Scanner;

public class Tictactoe {
	Scanner sc = new Scanner(System.in);
	Tile t = new Tile();
	int x = 0, y = 0;
	boolean flag = true;

	public void disp() {
		System.out.println();
		for (int i = 0; i < t.tile.length; i++) {
			for (int j = 0; j < t.tile.length; j++) {
				System.out.print(t.tile[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public boolean tileFull() {
		if (t.tile != null) {
			return true;
		}
		return false;
	}

	public boolean tileCheck(int x, int y) {
		if (t.tile[x][y] != "0 ") {
			System.out.println("이미 선택된 자리입니다.");
			return true;
		}
		return false;
	}

	public boolean tileIndexCheck(int x, int y) {
		if (x > t.tile.length && x < 1 || y > t.tile.length && y < 1)
			return true;

		return false;

	}

	public void player1() {
		int player1 = 1;
		System.out.println("Player1's Turn");
		while (true) {
			System.out.print("좌표값을 입력해주세요. ex)11\n>>");
			String place = sc.next();
			if (place.length() != 2) {
				System.out.println("정확한 좌표값을 입력해주세요");
				continue;
			}
			if (place.length() == 2) {
				this.x = Integer.parseInt(place.substring(0, 1));
				this.y = Integer.parseInt(place.substring(1));
				if (tileIndexCheck(x, y) == true) {
					System.out.println("잘못된 범위입니다.");
					continue;
				}
				if (tileCheck(x, y) == true)
					continue;

				t.tile[x][y] = "@ ";
				disp();
				break;
			}
			break;
		}
		if (winCheck() == true) {
			win(player1);
			flag = false;
		}
	}

	public void player2() {
		int player2 = 2;
		System.out.println("Player2's Turn");
		while (true) {
			System.out.print("좌표값을 입력해주세요. ex)11\n>>");
			String place = sc.next();
			if (place.length() != 2) {
				System.out.println("정확한 좌표값을 입력해주세요");
				continue;
			}
			if (place.length() == 2) {
				this.x = Integer.parseInt(place.substring(0, 1));
				this.y = Integer.parseInt(place.substring(1));
				if (x > 3 && x < 1 || y > 3 && y < 1) {
					System.out.println("잘못된 범위입니다.");
					continue;
				}
				if (tileCheck(x, y) == true)
					continue;

				t.tile[x][y] = "# ";
				disp();
				break;
			} // if
			break;
		} // while
		if (winCheck() == true) {
			win(player2);
			flag = false;
		}
	}

	public boolean winCheck() {
		if (t.tile[1][1] == t.tile[1][2] && t.tile[1][2] == t.tile[1][3]
				&& (t.tile[1][3].equals("# ") || t.tile[1][3].equals("@ "))) {
			return true;
		} else if (t.tile[1][1] == t.tile[2][2] && t.tile[2][2] == t.tile[3][3]
				&& (t.tile[3][3].equals("# ") || t.tile[3][3].equals("@ "))) {
			return true;
		} else if (t.tile[1][1] == t.tile[2][1] && t.tile[2][1] == t.tile[3][1]
				&& (t.tile[3][1].equals("# ") || t.tile[3][1].equals("@ "))) {
			return true;
		} else if (t.tile[2][1] == t.tile[2][2] && t.tile[2][2] == t.tile[2][3]
				&& (t.tile[2][3].equals("# ") || t.tile[2][3].equals("@ "))) {
			return true;
		} else if (t.tile[3][1] == t.tile[3][2] && t.tile[3][2] == t.tile[3][3]
				&& (t.tile[3][3].equals("# ") || t.tile[3][3].equals("@ "))) {
			return true;
		} else if (t.tile[3][1] == t.tile[2][2] && t.tile[2][2] == t.tile[1][3]
				&& (t.tile[1][3].equals("# ") || t.tile[1][3].equals("@ "))) {
			return true;
		} else if (t.tile[1][2] == t.tile[2][2] && t.tile[2][2] == t.tile[3][2]
				&& (t.tile[3][2].equals("# ") || t.tile[3][2].equals("@ "))) {
			return true;
		} else if (t.tile[1][3] == t.tile[2][3] && t.tile[2][3] == t.tile[3][3]
				&& (t.tile[3][3].equals("# ") || t.tile[3][3].equals("@ "))) {
			return true;
		}

		return false;

	}

	public void start() {
		System.out.println("===== START =====");
		System.out.println("Player 1--> @");
		System.out.println("Player 2--> #");
		System.out.println("==================");
		while (flag == true) {
			player1();
			if (flag == false)
				break;
			player2();
			if (flag == false)
				break;
		}

	}

	public void win(int player) {
		if (player == 1) {
			System.out.println("*** Player 1 승리 ***");
			menu();
		} else {
			System.out.println("*** Player 2 승리 ***");
			menu();
		}
	}

	public void exit() {
		System.out.println("====== END ======");

	}

	public void menu() {
		while (true) {
			System.out.print("1.GameStart 2.EXIT >>");
			switch (sc.nextInt()) {
			case 1:
				start();
				continue;
			case 2:
				exit();
				break;
			default:
				continue;
			}// switch
			break;
		} // while
	}

	public static void main(String[] args) {
		Tictactoe ttt = new Tictactoe();
		ttt.menu();
		// ttt.disp();

	}
}
