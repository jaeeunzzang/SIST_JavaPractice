package inner;

//inner->접근제한자와 무관하게 접근하는 클래스.
//java ->단일상속. MEMBER,STATIC,LOCAL,ANONYMOUS
public class OuterClass extends SuperOutter {
	private int outValue = 50; // 멤버변수

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
			System.out.println(outValue); // this.outValue와 동일
			System.out.println(OuterClass.this.outValue); // 외부클래스의 outValue 호출.

		}
	}

	public static void main(String[] args) {
		// 외부클래스 없이 내부클래스 생성불가.
		// 외부클래스는 내부클래스에 접근불가. (내부클래스가 있을수도있고 없을수도있고~)

		// OuterClass.InnerClass1 inner = new OuterClass().new InnerClass1();
		// OuterClass.InnerClass2 inner2 = new OuterClass().new InnerClass2();
		OuterClass.InnerClass2.InnerInnerClass innerinner = new OuterClass().new InnerClass2().new InnerInnerClass();
		innerinner.innerinnerMethod();

	}
}
