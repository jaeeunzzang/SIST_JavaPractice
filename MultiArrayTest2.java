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
		int[][] imsi = new int[board.length + 2][board[0].length]; // 다시하기
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
		if (rs == null) {// 데이터가 배열에 없으면 return
			System.out.println("데이터가 없습니다.");
			return;
		}
		for (int i = rs[0]; i < board.length; i++) {
			for (int j = rs[1]; j < board[i].length; j++) {
				if (j == board[i].length - 1) { // 열의 끝일때
					board[i][j] = (i == board.length - 1) ? 0 : board[i + 1][0]; // board[i][j]에--> 행의 끝일때 =0
																					// 아닐때 = [행+1][0]값 넣음.
					rs[1] = 0;
				} else {
					board[i][j] = board[i][j + 1]; // i행 j열에 i행 j+1열 데이터를 넣음
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
			System.out.println("\n수행할 연산 ");
			System.out.println("1.Add\n2.Search\n3.Delete\n4.Modify\n5.Display\n6.Quit\n");
			switch (sc.nextInt()) {
			case 1:
				int a;
				System.out.print("배열에 넣을 데이터 입력:");
				a = sc.nextInt();
				add(board, a);
				disp(board);
				continue;
			case 2:
				int data;
				System.out.print("검색할 데이터 입력:");
				data = sc.nextInt();
				search(board, data);
				continue;
			case 3:

				System.out.print("삭제할 데이터 입력:");
				data = sc.nextInt();
				delete(board, data);
				continue;
			case 4:
				System.out.print("수정할 데이터 입력:");
				data = sc.nextInt();
				System.out.print("수정 후 데이터 입력:");
				int change = sc.nextInt();
				modify(board, data, change);

				continue;
			case 5:
				disp(board);
				continue;
			case 6:
				System.out.println("종료");
				End();
				break;
			default:
				System.out.println("정확한 번호 입력");
				continue;
			}
			break;
		}
	}

	public int[][] start() {
		System.out.println("-------START-------");
		System.out.print("배열 크기 입력:");
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
