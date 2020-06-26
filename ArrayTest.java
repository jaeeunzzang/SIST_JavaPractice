package New.practice;
//배열: 같은 기억장소의 모임

import java.util.Arrays;

//목적: 일괄처리
//구조: LIST (선형), 중복허용, 순서가 있는 구조
//선언: 자료형[]변수명; 자료형 변수명[];
//int []m=new int [5]; ---> [0][1][2][3][4]
//시작 인덱스는 0
//1차원 , 다차원
//값에 의한 호출 call by value
//참조에 의한 호출 call by reference

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

		for (int i = 0; i < m.length; i++) // 배열갯수만큼
		{
			m[i] = i + 1; // 배열 0번째 인덱스
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
		System.out.println("결과\n");
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
		System.out.printf("\n%d번째 정렬\n", num);
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
		System.out.println("배열의 크기 입력:");
		int cnt = sc.nextInt();
		int arr[] = new int[cnt];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 인덱스에 입력할 데이터:", i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public void play() {
		int num = 0;
		do {
			System.out.println("\n수행할 것\n1.배열데이터출력\n2.배열데이터 문자로출력\n3.최대값,최소값\n4.정렬\n5.new for\n6.quit");
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
				System.out.println("종료합니다");
				break;
			default:
				System.out.println("정확한 번호를 입력하세요");
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
		System.out.println("최소값:" + min);
		System.out.println("최대값:" + max);
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
		System.out.println("문자열 배열");
		for (int i = 0; i < s.length; i++) {
			System.out.printf("%d번째 인덱스에 입력할 데이터:", i);
			s[i] = sc.next();
		}
		newFor(s);
	}

	public void newFor(String[] s) {
		for (String i : s) // 주소값을 전달--> 주소값이 증가
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
		System.out.println("배열의 크기 입력");
		int cnt=sc.nextInt();
		
		int[] sort = new int[cnt];
		for (int i = 0; i < sort.length; i++) {
			System.out.printf("%d번째 데이터 입력:",i+1);
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
