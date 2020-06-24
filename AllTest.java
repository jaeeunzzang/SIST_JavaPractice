package New.practice;

import java.util.Scanner;

public class AllTest {
	final static int THISYEAR = 2020;

	public int getAge(int year) {
		int age = THISYEAR - year + 1;
		return age;
	}

	public String getZodiac(int year) {
		switch (year % 12) {
		case 1:
			return "��";
		case 2:
			return "��";
		case 3:
			return "����";
		case 4:
			return "��";
		case 5:
			return "��";
		case 6:
			return "ȣ����";
		case 7:
			return "�䳢";
		case 8:
			return "��";
		case 9:
			return "��";
		case 10:
			return "��";
		case 11:
			return "��";
		default:
			return "������";

		}

	}

	public boolean leapYear(int year) { // ���� �޼ҵ� leapYear
		boolean leapyear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		// ������ 4�⸶�� ���ƿ���, 100�� �ֱ�δ� ������ �ƴϴ�. ������ 400�� �ֱ�δ� ����.

		return leapyear; // ����⵵ ���� ���ڷ� �޾� true, false ����
	}

	public int getCnt(int year, int month, int day) {

		int cnt = (year - 1) * 365; // ��ü �ϼ� (����⵵-1)*365��
		// ����⵵ -1 ����? --> �¾ �⵵���ʹ� ��ü�ϼ��� ������ �ʰ�, �¾ �� ���������� ��¥�� ���ϱ� ����.

		for (int i = 1; i < year; i++) { // ����⵵ ���������� �� ��
			if (leapYear(i)) // �������� �ƴ��� �˻�.
				cnt++; // ������ ��� ��⺸�� �Ϸ簡 ���⶧���� cnt�� ����.
		}
		// ����⵵ ���������� ��ü �ϼ��� ������.

		for (int i = 1; i < month; i++) {// ����⵵�� ��� �������� �ϼ��� ����.
			switch (i) {
			case 1: // ��� �� ����������, �ϼ��� 31���� ���� ���� cnt�� �ϼ��� ����.
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				cnt += 31;
				break;
			case 2: // 2���� ���
				if (leapYear(year)) // �������� üũ�� �Ŀ� true���� ���ϵǸ� 29���� ����
					cnt += 29;
				else
					cnt += 28; // false���� ���ϵǸ� 28�� ����
				break;
			default:
				cnt += 30; // ����� �ϼ��� 30���� ��� ��
				break;
			}
		}
		cnt += day; // �¾ ���� ����
		return cnt; // ��ü �ϼ��� ����.
	}

	public String getWeek(int year, int month, int day) {
		switch (getCnt(year, month, day) % 7) { // int�� getCnt�޼ҵ� ȣ��(���ڰ�-getWeek���� �޾ƿ� ��,��,��)-->���ϰ�(��ü �ϼ�)%7 �Ŀ� ���ϰ� ����.
		case 1:
			return "������";
		case 2:
			return "ȭ����";
		case 3:
			return "������";
		case 4:
			return "�����";
		case 5:
			return "�ݿ���";
		case 6:
			return "�����";
		default:
			return "�Ͽ���";

		}

	}

	public void input(int year, int month, int day) {
		int age = getAge(year); // int�� �޼ҵ� getAgeȣ��(���ڰ�-����⵵) -->���� ���ؼ� ���� int��.
		String zodiac = getZodiac(year); // String�� �޼ҵ� getZodiacȣ��(���ڰ�- ����⵵)--->�� ���ؼ� ���� String��
		String week = getWeek(year, month, day);// String�� �޼ҵ� getWeekȣ��(���ڰ�-����⵵,��,��)-->���ϱ��ؼ� ���� String��.
		System.out.println("����:" + age + "\n��:" + zodiac + "\n����:" + week+"\n�¾��:"+getCnt(year, month, day)+"�� °");

	}

	public static void main(String[] args) {
		AllTest at = new AllTest();
		Scanner sc=new Scanner(System.in);
		System.out.println("����⵵ �Է�:");
		int year=sc.nextInt();
		System.out.println("�¾ �� �Է�:");
		int month=sc.nextInt();
		System.out.println("�¾ ��¥ �Է�:");
		int day=sc.nextInt();
		
		at.input(year, month, day);

	}

}
