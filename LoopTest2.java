package New.practice;

public class LoopTest2 {
	final int MAX = 20;
	final int MIN = 1;

	public void firstLoop() { // ���������� �����ϴ� �����

		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void secondLoop() { // �����ʿ��� �����ϴ� �����
		for (int i = 0; i < MAX; i++) {
			for (int j = MAX - 1; j >= i + 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void thirdLoop() {// �������� �����ϴ� �����
		for (int i = 0; i < MAX; i++) {
			for (int j = MAX - 1; j >= 0; j--) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

	public void fourthLoop() {// ���ʿ��� �����ϴ� �����
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < MAX; j++) {
				if (j <= i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

	public void fifthLoop() { // Ʈ����� �����(���ʿ� ����)
		int mid = (MAX % 2 == 0 ? MAX / 2 : MAX / 2 + 1); // mid�� ¦���϶��� /2, Ȧ���϶��� /2+1
		for (int i = 1; i <= mid; i++) {
			for (int j = 1; j <= MAX; j++) {
				if (j <= mid + (i - 1) && j >= mid - (i - 1)) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

	public void sixthLoop() { // �� Ʈ����� �����
		int mid = (MAX % 2 == 0 ? MAX / 2 : MAX / 2 + 1); // mid�� ¦���϶��� /2, Ȧ���϶��� /2+1
		for (int i = 1; i <= MAX; i++) {
			for (int j = 1; j <= MAX; j++) {
				if (j >= i && j < MAX - i + 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public void seventhLoop() 
	{ // ������ �����
		int mid = (MAX % 2 == 0 ? MAX / 2 : MAX / 2 + 1);
		
		for (int i = 1; i <= MAX; i++) 
		{
			for (int j = 0; j <= MAX; j++) 
			{

				if (i <= mid) 
				{
					if (j <= mid + (i - 1) && j >= mid - (i - 1)) 
					{
						System.out.print("*");
					} else 
					{
						System.out.print(" ");
					}
					
				} else if(i>mid)
				{
					if (j>=i-mid&&j<=MAX-i+mid) 
					{
						System.out.print("*");
					}

					else 
					{
						System.out.print(" ");
					}
					
				}
				
			}System.out.println();
		}
	}
	
	public void eighthLoop() //�𷡽ð� �����
	{
		
	}

	public static void main(String[] args) {
		LoopTest2 lt = new LoopTest2();
		lt.firstLoop();
		lt.secondLoop();
		lt.thirdLoop();
		lt.fourthLoop();
		lt.fifthLoop();
		lt.sixthLoop();
		lt.seventhLoop();

	}
}
