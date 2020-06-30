package New.practice;

public class ArrayTest7 {
	int cnt = 0;

	public boolean isFull(int[] m) {
		return cnt == m.length;
	}

	public void add(int[] m, int data) {// ����
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

	public int search(int[] m, int data) { // ���� �����Ͱ� ������ �ε����� ��ȯ
		for (int i = 0; i < m.length; i++) {
			if (m[i] == data) {
				System.out.println("search data '" + data + "' in arr[" + i + "]");
				return i;
			}
		}
		return -1; // ���� �����Ͱ� ������ -1 ��ȯ
	}

	/*
	 * public int search(int[] m, int data, int fromIndex) { // �ߺ����� ������������ ã�� �Լ�
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

	public void delete(int[] m, int data, int state) { // state �߰��ؼ� �ߺ����� �����Ұ� �ִ��� Ȯ��.
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

	public void modify(int[] m, int data, int data2) {
		System.out.println("modify '" + data + "' -> '" + data2 + "' ");
		for (int i = 0; i < m.length; i++) {
			if (m[i] == data) {
				m[i] = data2;
			}
		}
		disp(m);
	}

	public static void main(String[] args) {
		ArrayTest7 at = new ArrayTest7();
		int[] m = new int[10];
		at.add(m, 30, 20);
		at.add(m, 30, 40);
		at.add(m, 50, 60);
		at.add(m, 70, 80);
		at.add(m, 90, 30);
		at.add(m, 110);
		at.disp(m);
		at.search(m, 50);
		at.delete(m, 30, 1);
		at.modify(m, 20, 40);

	}
}
