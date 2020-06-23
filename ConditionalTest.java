package New.practice;

import java.util.*;

public class ConditionalTest {
	public void passCheck(int k,int e,int m,double avg)
	{
		if (k >= 40 && e >= 40 && m >= 40 && avg >= 60) {
			System.out.println("�հ��Դϴ�");
			System.out.println("���:"+avg);
		}
		{
			if (k < 40) {
				if (e >= 40 && m >= 40) {
					System.out.println("kor ����");
				} else if (e < 40 && m >= 40) {
					System.out.println("kor,eng ����");
				} else if (e >= 40 && m < 40) {
					System.out.println("kor,math ����");
				} else if (e < 40 && m < 40) {
					System.out.println("kor,eng,math ����");
				}
				
			} else if (e < 40) {
				if (m >= 40) {
					System.out.println("eng ����");
				} else if (m < 40) {
					System.out.println("eng,math ����");
				}
			} else if (m < 40) {
				System.out.println("math ����");
			}
			System.out.println("���հ��Դϴ�");
		}
	}
	public void firstCondition(int x, int y, int z, int k) {
		boolean state = x++ == 2 || (y++ == 2 || (--z == 2 && k++ == 4));
		System.out.printf("state=%b,x=%d,y=%d,z=%d,k=%d", state, x, y, z, k);
	}

	public void secondCondition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		float sum, avg;
		System.out.println("����");
		int kor = sc.nextInt();
		System.out.println("����");
		int eng = sc.nextInt();
		System.out.println("����");
		int math = sc.nextInt();

		sum = kor + eng + math;
		avg = sum / 30;

		if (avg >= 9) {
			System.out.printf("����: A\n���:%.2f", avg * 10);
		} else if (avg >= 8) {
			System.out.printf("����: B\n���:%.2f", avg * 10);
		} else if (avg >= 7) {
			System.out.printf("����: C\n���:%.2f", avg * 10);
		} else if (avg >= 6) {
			System.out.printf("����: D\n���:%.2f", avg * 10);
		} else {
			System.out.printf("����: F\n���:%.2f", avg * 10);
		}
	}

	public void thirdCondition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		float sum, avg;
		char grade;
		System.out.println("����");
		int kor = sc.nextInt();
		System.out.println("����");
		int eng = sc.nextInt();
		System.out.println("����");
		int math = sc.nextInt();

		sum = kor + eng + math;
		avg = sum / 3;

		switch ((int) sum / 30) {
		case 10:
		case 9:
			grade = 'A';
			break;

		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
			System.out.println("�й�");
		}
		System.out.printf("����:%c\n ���:%.2f", grade, (float) avg);
	}

	public void fourthCondition() {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		float sum, avg;
		// ct.passCheck(40, 20, 60, (40 + 20 + 60) / 3);
		// ct.passCheck(x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), (x + y +z) / 3);

		System.out.println("kor �����Է�:");
		x = sc.nextInt();
		System.out.println("eng �����Է�:");
		y = sc.nextInt();
		System.out.println("math �����Է�:");
		z = sc.nextInt();
		sum = x + y + z;
		avg = sum / 3;
		passCheck(x, y, z, avg);

	}
	

	public static void main(String[] args) {
		ConditionalTest ct = new ConditionalTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.������\n2.if��\n3.switch��\n4.��øif��\n");
		int j;
		int i = sc.nextInt();

		if (i == 1) {
			ct.firstCondition(1, 2, 3, 4);
		} else if (i == 2) {
			ct.secondCondition();
		} else if (i == 3) {
			ct.thirdCondition();
		} else if (i == 4) {
			ct.fourthCondition();
		} else {
			System.out.println("��ȣ�ٽ��Է�");

		}

	}

}
