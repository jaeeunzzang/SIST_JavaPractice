package New.practice;
//�迭: ���� �������� ����

import java.util.Arrays;

//����: �ϰ�ó��
//����: LIST (����), �ߺ����, ������ �ִ� ����
//����: �ڷ���[]������; �ڷ��� ������[];
//int []m=new int [5]; ---> [0][1][2][3][4]
//���� �ε����� 0
//1���� , ������
//���� ���� ȣ�� call by value
//������ ���� ȣ�� call by reference

import java.util.Scanner;

public class ArrayTest {
	Scanner sc = new Scanner(System.in);

	public void arrayEx1(int... a) {
		System.out.println(a[1]);
	}

	public void arrayEx2(String... b) {
		int m[] = new int[10];
		m[0] = 1;
		m[1] = 2;

		for (int i = 0; i < m.length; i++) // �迭������ŭ
		{
			m[i] = i + 1; // �迭 0��° �ε���
			System.out.println(m[i]);
		}

	}

	public void floatArray(float[] floatArray) {
		for (int i = 0; i < floatArray.length; i++) {
			floatArray[i] = (i + 1);

		}
	}

	public void doubleArray() {
		double m[] = new double[5];
		System.out.println(Arrays.toString(m));
		boolean b[] = new boolean[5];
		System.out.println(Arrays.toString(b));
		char c[] = new char[5];
		System.out.println(Arrays.toString(c));
		float f[] = new float[5];
		floatArray(f);
		System.out.println(Arrays.toString(f));
		String s[] = new String[5];
		System.out.println(Arrays.toString(s));

	}

	public void arrayOutput(int[] arr) {
		System.out.println();
		System.out.println("���\n");
		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
	}

	public void arrayOutput_int() {
		int arr[] = arrayInput();
		System.out.println("\nInt");
		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr[%d]=%d\n", i, arr[i]);

	}

	public void arrayOutput_i(int[] arr, int num) {
		System.out.printf("\n%d��° ����\n", num);
		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr[%d]=%d\n", i, arr[i]);

	}

	public void arrayOutput_c()

	{
		int arr[] = arrayInput();
		System.out.println("\nChar");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%c\n", i, arr[i]);
		}
	}

	public int[] arrayInput() {
		System.out.println("�迭�� ũ�� �Է�:");
		int cnt = sc.nextInt();
		int arr[] = new int[cnt];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d��° �ε����� �Է��� ������:", i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public void play() {
		int num = 0;
		do {
			System.out.println("\n������ ��\n1.�迭���������\n2.�迭������ ���ڷ����\n3.�ִ밪,�ּҰ�\n4.����\n5.new for\n6.quit");
			num = sc.nextInt();
			switch (num) {

			case 1:
				arrayOutput_int();
				continue;
			case 2:
				arrayOutput_c();
				continue;
			case 3:
				max_min_Arr();
				continue;
			case 4:
				sortArr();
				continue;
			case 5:
				stringArr();
				continue;
			case 6:
				System.out.println("�����մϴ�");
				break;
			default:
				System.out.println("��Ȯ�� ��ȣ�� �Է��ϼ���");
				continue;
			}
		} while (num != 6);

	}

	public void arrayEx3() {
		int m[] = new int[10];
		int j = 65;
		for (int i = 0; i < m.length; i++) {
			m[i] = j++;
			System.out.println((char) m[i]);
		}
	}

	public void max_min_Arr() {
		int arr[] = arrayInput();
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("�ּҰ�:" + min);
		System.out.println("�ִ밪:" + max);
		newSort(returnTest(min, max));
	}

	public void sortArr() {
		int arr[] = arrayInput();
		int tmp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
			arrayOutput_i(arr, i + 1);
		}
		arrayOutput(arr);
	}

	public void stringArr() {
		String s[] = new String[5];
		System.out.println("���ڿ� �迭");
		for (int i = 0; i < s.length; i++) {
			System.out.printf("%d��° �ε����� �Է��� ������:", i);
			s[i] = sc.next();
		}
		newFor(s);
	}

	public void newFor(String[] s) {
		for (String i : s) // �ּҰ��� ����--> �ּҰ��� ����
		{
			System.out.printf("%s ", i);
		}
		System.out.println();
	}

	public int[] returnTest(int min, int max) {
		int max_min[] = { min, max };
		return max_min;

	}

	public void newSort(int[] a) {
		System.out.println("�迭�� ũ�� �Է�");
		int cnt=sc.nextInt();
		
		int[] sort = new int[cnt];
		for (int i = 0; i < sort.length; i++) {
			System.out.printf("%d��° ������ �Է�:",i+1);
			sort[i] = sc.nextInt();
		}

		int min = a[0];
		int max = a[1];
	}

	public void newSort() {

	}

	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();
		//at.max_min_Arr();
		at.play();
	}
}
