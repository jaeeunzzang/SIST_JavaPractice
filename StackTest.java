package sist.com.array;

import java.util.Scanner;

public class StackTest {
	Scanner sc = new Scanner(System.in);
	int[] m = new int[5];
	int top = -1;

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == m.length - 1;
	}

	public void increment() {
		int[] imsi = new int[m.length * 2];
		System.arraycopy(m, 0, imsi, 0, m.length);
		m = imsi;

	}

	public void push() { // 데이터 삽입
		int data = sc.nextInt();
		if (isFull()) {
			increment();
		}
		m[++top] = data;

	}

	public void pop() { // 데이터 삭제
		if (isEmpty()) {
			System.out.println("Empty Stack");
			return;

		}
		System.out.printf("%-5d", m[top]);
		System.out.println();
		top--;
	}

	public void pop(int[] m, int data) { // 받은 데이터가 나올때까지 삭제

		while (top != -1) {
			if (isEmpty()) {
				System.out.println("Empty Stack");
				break;
			}
			System.out.printf("[%d]", m[top]);

			--top;
			if (m[top] == data) {
				System.out.printf("[%d]", m[top]);
				top--;
				break;
			}

		}
		System.out.println();

	}

	public void peek() { // 현재 top이 가리키고 있는 데이터 보기
		System.out.println(isEmpty() ? -1 : "Top:" + top);
		System.out.println(isEmpty() ? "Empty Stack" : m[top]);

	}

	public void disp() {
		System.out.println("Top:" + top);
		System.out.println("in Stack");
		for (int i = top; i >= 0; i--) {
			System.out.printf("[%d]\n", m[i]);
		}
		System.out.println();
	}

	public void list() {

	}

	public void menu() {
		while (true) {
			System.out.println("1.Push 2.Pop 3.Peek 4.List 5.Quit");
			switch (sc.nextInt()) {
			case 1:
				System.out.print("Push:");
				push();
				disp();
				continue;
			case 2:
				int x;
				System.out.print("데이터 입력:");
				x = sc.nextInt();
				System.out.print("Pop:");
				pop(m, x);
				disp();
				continue;
			case 3:
				System.out.print("Peek:");
				peek();
				continue;
			case 4:
				System.out.print("List:");
				list();
				continue;
			case 5:
				System.out.println("종료");
				break;

			}
			break;
		}
	}

	public static void main(String[] args) {
		StackTest st = new StackTest();
		st.menu();

	}
}
