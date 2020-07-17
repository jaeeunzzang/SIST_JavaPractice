package Test4;

public class SelfNumber {
	int[] arr = new int[50];
	static int selfNumber = 0;

	public int add(int num) {
		int tmp = num;

		while (num > 0) {
			tmp += num % 10;
			num = num / 10;
		}
		return tmp;
	}

	public void num() {
		for (int i = 0; i < 50; i++) {
			arr[i] = add(i);
		}
	}

	public void disp() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public boolean checkGenerator(int n) {
		for (int i = 1; i < n; i++) {
			if (add(i) <= n) {
				if (add(i) == n) {
					return false;
				}
			}
		}
		return true;
	}

	public void check() {
		for (int i = 0; i < 5001; i++) {
			if (checkGenerator(i)) {
				selfNumber += i;
				System.out.println(i);
			}
		}
		System.out.println("ÀüÃ¼ ÇÕ:" + selfNumber);
	}

	public static void main(String[] args) {
		SelfNumber sn = new SelfNumber();

		sn.check();

	}
}
