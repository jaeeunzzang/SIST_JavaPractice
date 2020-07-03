package sist.com.array;

import java.util.Scanner;

public class MultiArrayTest2 {
	Scanner sc = new Scanner(System.in);

	int row = 0, col = -1;

	public boolean isFullrow(int[][] board) {
		return row == board.length - 1 && col == board[0].length - 1;
	}

	public void add(int[][] board, int data) {
		if (isFullrow(board))
			board = increment(board);

		if (col < board[0].length - 1) {
			col++;
		} else {
			col = 0;
			row++;
		}
		board[row][col] = data;

	}

	public int[][] increment(int[][] board) {
		int[][] imsi = new int[board.length + 2][board[0].length]; // �ٽ��ϱ�
		System.arraycopy(board, 0, imsi, 0, board.length);
		return imsi;
	}

	public void disp(int[][] board) {
		System.out.println("------------------");
		for (int[] i : board) {
			for (int j : i) {
				System.out.printf("%-4d", j);
			}
			System.out.println();
		}
		System.out.println("------------------");
	}

	public void delete(int[][] board) {
		int[] rs = search(board, 100);
		for (int i = rs[0]; i < board.length; i++) {
			for (int j = rs[1]; j < board[i].length; j++) {
				if (i == board.length - 1 && j == board[i].length - 1) {
					board[i][j] = 0;
					break;
				}
				board[i][j] = j == board[i].length - 1 ? board[i + 1][0] : board[i][j + 1];
				rs[1] = j == board[i].length - 1 ? 0 : rs[1];
			}
		}
	}

	public void delete(int[][] board, int data) {
		int rs[] = search(board, data);
		if (rs == null) {// �����Ͱ� �迭�� ������ return
			System.out.println("�����Ͱ� �����ϴ�.");
			return;
		}
		for (int i = rs[0]; i < board.length; i++) {
			for (int j = rs[1]; j < board[i].length; j++) {
				if (j == board[i].length - 1) { // ���� ���϶�
					board[i][j] = (i == board.length - 1) ? 0 : board[i + 1][0]; // board[i][j]��--> ���� ���϶� =0
																					// �ƴҶ� = [��+1][0]�� ����.
					rs[1] = 0;
				} else {
					board[i][j] = board[i][j + 1]; // i�� j���� i�� j+1�� �����͸� ����
				}
			}
		}
	}

	public void modify(int[][] board, int data, int changedata) {
		int rs[] = search(board, data);
		if (rs == null)
			return;

		board[rs[0]][rs[1]] = changedata;
	}

	public int[] search(int[][] board, int data) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == data) {
					System.out.println("search data '" + data + "'\n in arr[" + i + "][" + j + "]");
					return new int[] { i, j };
				}
			}
		}
		return null;

	}

	public void menu(int[][] board) {
		while (true) {
			System.out.println("\n������ ���� ");
			System.out.println("1.Add\n2.Search\n3.Delete\n4.Modify\n5.Display\n6.Quit\n");
			switch (sc.nextInt()) {
			case 1:
				int a;
				System.out.print("�迭�� ���� ������ �Է�:");
				a = sc.nextInt();
				add(board, a);
				disp(board);
				continue;
			case 2:
				int data;
				System.out.print("�˻��� ������ �Է�:");
				data = sc.nextInt();
				search(board, data);
				continue;
			case 3:

				System.out.print("������ ������ �Է�:");
				data = sc.nextInt();
				delete(board, data);
				continue;
			case 4:
				System.out.print("������ ������ �Է�:");
				data = sc.nextInt();
				System.out.print("���� �� ������ �Է�:");
				int change = sc.nextInt();
				modify(board, data, change);

				continue;
			case 5:
				disp(board);
				continue;
			case 6:
				System.out.println("����");
				End();
				break;
			default:
				System.out.println("��Ȯ�� ��ȣ �Է�");
				continue;
			}
			break;
		}
	}

	public int[][] start() {
		System.out.println("-------START-------");
		System.out.print("�迭 ũ�� �Է�:");
		int arrSize = sc.nextInt();
		int[][] m = new int[arrSize][arrSize];
		return m;
	}

	public void End() {
		System.out.println("------END------");
	}

	public static void main(String[] args) {
		MultiArrayTest2 mt = new MultiArrayTest2();
		int[][] board = mt.start();
		mt.menu(board);

	}
}
