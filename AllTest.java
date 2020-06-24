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
			return "닭";
		case 2:
			return "개";
		case 3:
			return "돼지";
		case 4:
			return "쥐";
		case 5:
			return "소";
		case 6:
			return "호랑이";
		case 7:
			return "토끼";
		case 8:
			return "용";
		case 9:
			return "뱀";
		case 10:
			return "말";
		case 11:
			return "양";
		default:
			return "원숭이";

		}

	}

	public boolean leapYear(int year) { // 논리형 메소드 leapYear
		boolean leapyear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		// 윤년은 4년마다 돌아오고, 100년 주기로는 윤년이 아니다. 하지만 400년 주기로는 윤년.

		return leapyear; // 출생년도 값을 인자로 받아 true, false 리턴
	}

	public int getCnt(int year, int month, int day) {

		int cnt = (year - 1) * 365; // 전체 일수 (출생년도-1)*365일
		// 출생년도 -1 이유? --> 태어난 년도부터는 전체일수를 더하지 않고, 태어난 일 이전까지만 날짜를 더하기 때문.

		for (int i = 1; i < year; i++) { // 출생년도 이전까지의 년 수
			if (leapYear(i)) // 윤년인지 아닌지 검사.
				cnt++; // 윤년인 경우 평년보다 하루가 많기때문에 cnt값 증가.
		}
		// 출생년도 이전까지의 전체 일수를 구했음.

		for (int i = 1; i < month; i++) {// 출생년도의 출생 월까지의 일수를 구함.
			switch (i) {
			case 1: // 출생 월 이전까지의, 일수가 31일인 달을 구해 cnt에 일수를 더함.
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				cnt += 31;
				break;
			case 2: // 2월인 경우
				if (leapYear(year)) // 윤년인지 체크한 후에 true값이 리턴되면 29일을 더함
					cnt += 29;
				else
					cnt += 28; // false값이 리턴되면 28을 더함
				break;
			default:
				cnt += 30; // 평년의 일수가 30일인 모든 달
				break;
			}
		}
		cnt += day; // 태어난 일을 더함
		return cnt; // 전체 일수를 리턴.
	}

	public String getWeek(int year, int month, int day) {
		switch (getCnt(year, month, day) % 7) { // int형 getCnt메소드 호출(인자값-getWeek에서 받아온 년,월,일)-->리턴값(전체 일수)%7 후에 요일값 리턴.
		case 1:
			return "월요일";
		case 2:
			return "화요일";
		case 3:
			return "수요일";
		case 4:
			return "목요일";
		case 5:
			return "금요일";
		case 6:
			return "토요일";
		default:
			return "일요일";

		}

	}

	public void input(int year, int month, int day) {
		int age = getAge(year); // int형 메소드 getAge호출(인자값-출생년도) -->나이 구해서 리턴 int값.
		String zodiac = getZodiac(year); // String형 메소드 getZodiac호출(인자값- 출생년도)--->띠 구해서 리턴 String값
		String week = getWeek(year, month, day);// String형 메소드 getWeek호출(인자값-출생년도,월,일)-->요일구해서 리턴 String값.
		System.out.println("나이:" + age + "\n띠:" + zodiac + "\n요일:" + week+"\n태어난지:"+getCnt(year, month, day)+"일 째");

	}

	public static void main(String[] args) {
		AllTest at = new AllTest();
		Scanner sc=new Scanner(System.in);
		System.out.println("출생년도 입력:");
		int year=sc.nextInt();
		System.out.println("태어난 월 입력:");
		int month=sc.nextInt();
		System.out.println("태어난 날짜 입력:");
		int day=sc.nextInt();
		
		at.input(year, month, day);

	}

}
