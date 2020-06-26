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
			System.out.printf("%d��° ����:%d\n", i + 1, ball[i]);
	}

	public void min_max() {
		int min = arr[0], max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			else if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("�ּҰ�:" + min);
		System.out.println("�ִ밪:" + max);
		mid = (min + max) / 2;
		System.out.println("�߰���:" + mid);
		System.out.println();

	}

	public void min_max_sort() {
		int avg = (int) avg();
		System.out.println("��հ�:" + (int) avg + "\n");
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
		System.out.println("������ ����:" + cnt + "\n");
		System.out.println("��հ� ����:" + midcnt + "\n");

		cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (avg < arr[i]) {
				highcnt[cnt] = arr[i];
				cnt++;
			}
		}
		sortArr(highcnt);
		System.out.println("ū�� ����:" + cnt);

	}

	public float avg() {
		float avg = 0;
		for (int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		avg = avg / arr.length;
		return avg;
	}

	public void sortArr(int sortarr[]) { // ��������
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
				System.out.println("��հ����� ���� ��:" + sortarr[cnt]);

			} else if (sortarr[cnt] > avg) {
				System.out.println("��հ����� ū ��:" + sortarr[cnt]);

			}

		}
	}

	public void frequency() { // �󵵼� ���ϱ�
		int[] cnt = new int[arr.length + 2];

		for (int i = 0; i < arr.length; i++) {
			cnt[arr[i] / 10]++;
		}
		for (int i = 0; i < arr.length + 1; i++) {
			if (cnt[i] == 0)
				continue;
			System.out.println(i * 10 + "~" + ((i * 10) + 9) + "������ ����:" + cnt[i]);
		}
		System.out.println();
		min_max_sort();
	}

	public void rank(int[] x) { //���� �迭 ������ϱ�
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

	public void disp(int[] x) { //���� �迭�� ���
		for (int i : x) {
			System.out.printf("%d\t", i);
		}
		System.out.println();
	}

	public void disp_arr() { //ARR �迭 �� ���
		for (int i = 0; i < arr.length; i++)
			System.out.printf("%-3d", arr[i]);
	}

	public int nearData(int[] data, int target) {
		int near = 0, ch = 0, cch = data[0] - target;
		disp_arr();
		System.out.println("\n�Է��� ��:"+target);
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
		// at.randomNum(); �ζǹ���
		// min_max(); //�ִ밪, �ּҰ�
		// at.frequency(); // �󵵼�, ����
		// at.rank(arr); //��� ���
		// at.min_freq(arr);
		// at.min_max_sort(); //��պ��� ������, ū��
		System.out.println("�ٻ�ġ:"+at.nearData(arr, 90));
	}

}
