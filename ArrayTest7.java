package sist.com.array;

import java.util.Scanner;

public class ArrayTest7 {
	static Scanner sc = new Scanner(System.in);
	int cnt = 0;

	public boolean isFull(int[] m) {
		return cnt == m.length;
	}

	public void add(int[] m, int data) {// 오버
		if (isFull(m)) {
			System.out.printf("Full:" + data + "\n");
			return;
		}
		m[cnt++] = data;

	}

	public void add(int[] m, int first, int second) {
		add(m, first);
		add(m, second);
	}

	public int search(int[] m, int data) { // 받은 데이터가 있으면 인덱스값 반환
		for (int i = 0; i < m.length; i++) {
			if (m[i] == data) {
				System.out.println("search data '" + data + "' in arr[" + i + "]");
				return i;
			}

		}
		System.out.println("찾을 데이터가 없습니다.");

		return -1; // 받은 데이터가 없으면 -1 반환
	}

	/*
	 * public int search(int[] m, int data, int fromIndex) { // 중복으로 데이터있을때 찾을 함수
	 * 
	 * for (int i = fromIndex + 1; i < m.length - 1; i++) { if (m[i] == data) {
	 * System.out.println("search data in arr[" + i + "]"); return i; } if
	 * (fromIndex == -1) { break; } } return -1; }
	 */
	public void disp(int[] m) {

		for (int i : m) {

			System.out.printf("%-5d", i);
		}
		System.out.println();
	}

	public void delete(int[] m, int data, int state) { // state 추가해서 중복으로 삭제할값 있는지 확인.
		int index = search(m, data);
		if (index == -1) {
			return;
		}

		System.out.println("delete data: " + data);
		for (int i = index; i < m.length; i++) {
			if (i == m.length - 1) {
				m[i] = 0;
				break;
			}
			m[i] = m[i + 1];
		}
		disp(m);
		if (state != 0) {
			delete(m, data, state);
		}

	}

	public void modify(int[] m, int oridata, int changedata, char state) {
		int index = search(m, oridata);
		if (index == -1)
			return;
		m[index] = changedata;
		System.out.println("modify '" + oridata + "' -> '" + changedata + "' ");
		disp(m);
		if (state == 'a')
			modify(m, oridata, changedata, state);
	}

	public void modify(int[] m, int data, int data2) {
		System.out.println("modify '" + data + "' -> '" + data2 + "' ");
		for (int i = 0; i < m.length; i++) {
			if (m[i] == data) {
				m[i] = data2;
			}
		}
		disp(m);
	}

	public void menu(int[] m) {
		while (true) {
			System.out.println("\n수행할 연산 ");
			System.out.println("1.Add\n2.Search\n3.Delete\n4.Modify\n5.Display\n6.Quit\n");
			switch (sc.nextInt()) {
			case 1:
				int a, b, state;
				System.out.print("배열에 넣을 데이터 입력:");
				a = sc.nextInt();
				System.out.println("하나 더 입력?");
				System.out.println("1.yes\t2.no\n");
				state = sc.nextInt();
				if (state == 2) {
					add(m, a);
					disp(m);
				} else {
					System.out.print("배열에 넣을 데이터 입력:");
					b = sc.nextInt();
					add(m, a, b);
					disp(m);
				}
				continue;
			case 2:
				int data;
				System.out.print("검색할 데이터 입력:");
				data = sc.nextInt();
				search(m, data);
				continue;
			case 3:

				System.out.print("삭제할 데이터 입력:");
				data = sc.nextInt();
				delete(m, data, 1);
				continue;
			case 4:
				System.out.print("수정할 데이터 입력:");
				data = sc.nextInt();
				System.out.print("수정 후 데이터 입력:");
				int change = sc.nextInt();
				System.out.println("전체 수정");
				System.out.println("1.yes\t2.no");
				state = sc.nextInt();
				if (state == 1) {
					char dupl = 'a';
					modify(m, data, change, dupl);
				} else
					modify(m, data, change);
				continue;
			case 5:
				disp(m);
				continue;
			case 6:
				System.out.println("종료");
				break;
			default:
				System.out.println("정확한 번호 입력");
				continue;
			}
			break;
		}
	}

	public int[] start() {
		System.out.println("-------START-------");
		System.out.print("배열 크기 입력:");
		int arrSize = sc.nextInt();
		int[] m = new int[arrSize];
		return m;
	}

	public void End() {
		System.out.println("------END------");
	}

	public static void main(String[] args) {
		ArrayTest7 at = new ArrayTest7();
		int[] m = at.start();
		at.menu(m);
		at.End();
	}

}
