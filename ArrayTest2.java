package New.practice;

public class ArrayTest2 {
	static int arr[] = { 1, 55, 94, 52, 63, 37, 72, 22, 49, 21, 18, 84, 7, 46, 100 };
	int mid = 0;

	public void randomNum() {
		int ball[] = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		int tmp = 0;
		int j = 0;

		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		for (int i = 0; i < 6; i++)
			System.out.printf("%d번째 숫자:%d\n", i + 1, ball[i]);
	}

	public void min_max() {
		int min = arr[0], max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			else if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("최소값:" + min);
		System.out.println("최대값:" + max);
		mid = (min + max) / 2;
		System.out.println("중간값:" + mid);
		System.out.println();

	}

	public void min_max_sort() {
		int avg = (int) avg();
		System.out.println("평균값:" + (int) avg + "\n");
		int midcnt = 0;
		int highcnt[] = new int[arr.length];
		int lowcnt[] = new int[arr.length];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == avg)
				midcnt++;
			if (avg > arr[i]) {
				lowcnt[cnt] = arr[i];
				cnt++;
			}
		}
		sortArr(lowcnt);
		System.out.println("작은수 갯수:" + cnt + "\n");
		System.out.println("평균값 갯수:" + midcnt + "\n");

		cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (avg < arr[i]) {
				highcnt[cnt] = arr[i];
				cnt++;
			}
		}
		sortArr(highcnt);
		System.out.println("큰수 갯수:" + cnt);

	}

	public float avg() {
		float avg = 0;
		for (int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		avg = avg / arr.length;
		return avg;
	}

	public void sortArr(int sortarr[]) { // 버블정렬
		int tmp = 0;
		int avg = (int) avg();

		for (int i = 0; i < sortarr.length - 1; i++) {
			for (int j = i + 1; j < sortarr.length; j++) {
				if (sortarr[i] > sortarr[j]) {
					tmp = sortarr[j];
					sortarr[j] = sortarr[i];
					sortarr[i] = tmp;
				}
			}
		}

		for (int cnt = 0; cnt < sortarr.length; cnt++) {
			if (sortarr[cnt] == 0)
				continue;

			if (sortarr[cnt] < avg) {
				System.out.println("평균값보다 작은 수:" + sortarr[cnt]);

			} else if (sortarr[cnt] > avg) {
				System.out.println("평균값보다 큰 수:" + sortarr[cnt]);

			}

		}
	}

	public void frequency() { // 빈도수 구하기
		int[] cnt = new int[arr.length + 2];

		for (int i = 0; i < arr.length; i++) {
			cnt[arr[i] / 10]++;
		}
		for (int i = 0; i < arr.length + 1; i++) {
			if (cnt[i] == 0)
				continue;
			System.out.println(i * 10 + "~" + ((i * 10) + 9) + "범위의 갯수:" + cnt[i]);
		}
		System.out.println();
		min_max_sort();
	}

	public void rank(int[] x) { //받은 배열 등수구하기
		int rank[] = new int[x.length];

		for (int i = 0; i < x.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < x.length; j++) {
				if (x[i] < x[j]) {
					rank[i]++;
				}
			}
		}
		disp(x);
		disp(rank);
	}

	public void disp(int[] x) { //받은 배열값 출력
		for (int i : x) {
			System.out.printf("%d\t", i);
		}
		System.out.println();
	}

	public void disp_arr() { //ARR 배열 값 출력
		for (int i = 0; i < arr.length; i++)
			System.out.printf("%-3d", arr[i]);
	}

	public int nearData(int[] data, int target) {
		int near = 0, ch = 0, cch = data[0] - target;
		disp_arr();
		System.out.println("\n입력한 값:"+target);
		for (int i = 0; i < data.length; i++) {
			ch = data[i] - target;
			if (abs(cch) >= abs(ch)) {
				cch = ch;
				near = data[i];
			}
		}
		return near;

	}

	public int abs(int data) {

		return data < 0 ? -data : data;

	}

	public static void main(String[] args) {
		ArrayTest2 at = new ArrayTest2();
		// at.randomNum(); 로또버노
		// min_max(); //최대값, 최소값
		// at.frequency(); // 빈도수, 정렬
		// at.rank(arr); //등수 출력
		// at.min_freq(arr);
		// at.min_max_sort(); //평균보다 작은수, 큰수
		System.out.println("근사치:"+at.nearData(arr, 90));
	}

}
