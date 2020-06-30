package sist.com.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CalendarTest {
	Scanner sc = new Scanner(System.in);
	int year, Month;
	int[][] calendar = new int[6][7];
	int[] lastDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // �� ���� ������ ��
	String[] Week = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	public void calendar(int[][] calendar, int month, int start) { // Ķ������ ��¥ä���
		int day = 1; // 1�Ϻ��� ����

		for (int i = 0; i < 6; i++) {
			if (i == 0) { // ù���϶�
				for (int j = start; j <= 6; j++) { // ù���� start(firstOfDay���� �޾ƿ� ���ϰ�)���� ä��� ����
					calendar[i][j] = day;
					day++;
				}
			} else { // ������ ���϶�
				for (int j = 0; j <= 6; j++) {
					if (day > lastDay[month - 1]) // day�� ������������ Ŭ�� �ݺ��� ����������
						break;

					calendar[i][j] = day;
					day++;

				}
			}
		}
	}

	public void disp_cal() { // Ķ���� ���
		for (int i = 0; i < calendar.length; i++) {
			for (int j = 0; j < calendar[i].length; j++) {
				if (calendar[i][j] == 0) {
					System.out.print("     "); // �迭�� ä���� ���� 0�̸� ��������ϰ� ��Ƽ��
					continue;
				}
				if (calendar[i][j] > lastDay[Month - 1]) // ��������¥���� ũ�� �ݺ�����������
					break;
				System.out.printf("%5d", calendar[i][j]);

			}
			System.out.println();
		}
	}

	public void disp() {
		System.out.println(Arrays.toString(Week));
	}

	public boolean leapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

//2020.06.1
	public int getCount() {
		int cnt = (year - 1) * 365;
		for (int i = 1; i < year; i++) {
			if (leapYear(i)) // �����̸� �Ϸ� ���⶧���� cnt++
				cnt++;
		} // ����⵵, �� �������� �� cnt �հ�.
			// 2019*365+leapyear

		if (leapYear(year))
			lastDay[1] += 1;
		for (int i = 1; i < Month; i++) {
			cnt += lastDay[i - 1];
		}
		cnt++; // �Է��� ���� ù��
		return cnt;
	}

//cnt%7
	public int firstdayOfMonth() {
		int week = (getCount() % 7);
		switch (week) {
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 3;
		case 4:
			return 4;
		case 5:
			return 5;

		default:
			return 6;
		}

	}

	public void injectWeek() {
		System.out.print("Year:");
		year = sc.nextInt();
		System.out.print("Month:");
		Month = sc.nextInt();
		calendar(calendar, Month, firstdayOfMonth());
		disp();
		disp_cal();
	}

	public static void main(String[] args) {
		CalendarTest ct = new CalendarTest();
		ct.injectWeek();
	}
}
