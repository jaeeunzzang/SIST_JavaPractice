package inner;

//inner->���������ڿ� �����ϰ� �����ϴ� Ŭ����.
//java ->���ϻ��. MEMBER,STATIC,LOCAL,ANONYMOUS
public class OuterClass extends SuperOutter {
	private int outValue = 50; // �������

	public OuterClass() {
		System.out.println("outerClass");
	}

	public void outterMethod() {
		System.out.println("OuterMethod");
	}

	public class InnerClass2 {
		public int outValue = 200;
		public int innerValue2;

		public InnerClass2() {
			System.out.println("InnerClass2");
		}

		public void innerMethod2() {
			System.out.println("InnerMethod2");
			outValue2 = 500;
		}

		public class InnerInnerClass {
			public int outValue = 400;
			public int innerinnerValue;

			public InnerInnerClass() {
				System.out.println("InnerInnerClass");
			}

			public void innerinnerMethod() {
				System.out.println("InnerInnerMethod");
				System.out.println(this.outValue);
				System.out.println(InnerClass2.this.outValue);
				System.out.println(OuterClass.this.outValue);
			}
		}
	}

	public class InnerClass1 {
		public int outValue = 100;
		public int innerValue;

		public InnerClass1() {
			System.out.println("InnerClass");
		}

		public void innerMethod() {
			System.out.println("InnerMethod");
			System.out.println(outValue); // this.outValue�� ����
			System.out.println(OuterClass.this.outValue); // �ܺ�Ŭ������ outValue ȣ��.

		}
	}

	public static void main(String[] args) {
		// �ܺ�Ŭ���� ���� ����Ŭ���� �����Ұ�.
		// �ܺ�Ŭ������ ����Ŭ������ ���ٺҰ�. (����Ŭ������ ���������ְ� ���������ְ�~)

		// OuterClass.InnerClass1 inner = new OuterClass().new InnerClass1();
		// OuterClass.InnerClass2 inner2 = new OuterClass().new InnerClass2();
		OuterClass.InnerClass2.InnerInnerClass innerinner = new OuterClass().new InnerClass2().new InnerInnerClass();
		innerinner.innerinnerMethod();

	}
}
