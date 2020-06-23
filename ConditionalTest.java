package New.practice;

import java.util.*;

public class ConditionalTest {
	public void passCheck(int k,int e,int m,double avg)
	{
		if (k >= 40 && e >= 40 && m >= 40 && avg >= 60) {
			System.out.println("합격입니다");
			System.out.println("평균:"+avg);
		}
		{
			if (k < 40) {
				if (e >= 40 && m >= 40) {
					System.out.println("kor 과락");
				} else if (e < 40 && m >= 40) {
					System.out.println("kor,eng 과락");
				} else if (e >= 40 && m < 40) {
					System.out.println("kor,math 과락");
				} else if (e < 40 && m < 40) {
					System.out.println("kor,eng,math 과락");
				}
				
			} else if (e < 40) {
				if (m >= 40) {
					System.out.println("eng 과락");
				} else if (m < 40) {
					System.out.println("eng,math 과락");
				}
			} else if (m < 40) {
				System.out.println("math 과락");
			}
			System.out.println("불합격입니다");
		}
	}
	public void firstCondition(int x, int y, int z, int k) {
		boolean state = x++ == 2 || (y++ == 2 || (--z == 2 && k++ == 4));
		System.out.printf("state=%b,x=%d,y=%d,z=%d,k=%d", state, x, y, z, k);
	}

	public void secondCondition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력");
		float sum, avg;
		System.out.println("국어");
		int kor = sc.nextInt();
		System.out.println("영어");
		int eng = sc.nextInt();
		System.out.println("수학");
		int math = sc.nextInt();

		sum = kor + eng + math;
		avg = sum / 30;

		if (avg >= 9) {
			System.out.printf("학점: A\n평균:%.2f", avg * 10);
		} else if (avg >= 8) {
			System.out.printf("학점: B\n평균:%.2f", avg * 10);
		} else if (avg >= 7) {
			System.out.printf("학점: C\n평균:%.2f", avg * 10);
		} else if (avg >= 6) {
			System.out.printf("학점: D\n평균:%.2f", avg * 10);
		} else {
			System.out.printf("학점: F\n평균:%.2f", avg * 10);
		}
	}

	public void thirdCondition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력");
		float sum, avg;
		char grade;
		System.out.println("국어");
		int kor = sc.nextInt();
		System.out.println("영어");
		int eng = sc.nextInt();
		System.out.println("수학");
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
			System.out.println("분발");
		}
		System.out.printf("학점:%c\n 평균:%.2f", grade, (float) avg);
	}

	public void fourthCondition() {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		float sum, avg;
		// ct.passCheck(40, 20, 60, (40 + 20 + 60) / 3);
		// ct.passCheck(x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), (x + y +z) / 3);

		System.out.println("kor 점수입력:");
		x = sc.nextInt();
		System.out.println("eng 점수입력:");
		y = sc.nextInt();
		System.out.println("math 점수입력:");
		z = sc.nextInt();
		sum = x + y + z;
		avg = sum / 3;
		passCheck(x, y, z, avg);

	}
	

	public static void main(String[] args) {
		ConditionalTest ct = new ConditionalTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.연산자\n2.if문\n3.switch문\n4.중첩if문\n");
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
			System.out.println("번호다시입력");

		}

	}

}
