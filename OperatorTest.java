package New.practice;

public class OperatorTest {//Ŭ����(�Ӽ�+���), ���赵-->�߻�ȭ
	// ������: ����� �������� ���Ǵ� ��ȣ.

	/*
	 * �������� �켱����! 
	 * �ֿ켱������ : []�迭��ȣ, ()�켱���� ����, . 
	 * ���׿�����: +,-(��ȣ), ~,!(not),++,--
	 * ���������:*,/,%(������), +, - 
	 * shift ������: >>,<<,>>>(���ȭ) 
	 * ����(��)������: <,>,<=,>=, ==, !=
	 * ��Ʈ��������: &(and), ^(xor), |(or) 
	 * ���ǳ�������:&&,|| 
	 * ���� ������: ���ǽ� ? ���1(��) : ���2(����);
	 * ���Կ�����: =,+=,-=,*=,/=,%=,&=,^=,|= 
	 * �޸�������: , �����ǹ�
	 */
	
	public void firstOper(int x, int y)
	{
		System.out.println("���ǳ�������");
		System.out.printf("x>10 && y<10:%b\n", x > 10 && y < 10); //&&(AND)���� : ~~ �̸鼭 ~~
		System.out.printf("x>10 || y=<10:%b\n\n", x > 10 || y < 10);//||(OR)����: ~~ �̰ų� ~~
		
		System.out.println("���׿�����");
		System.out.printf("x>y?x-y:y-x=%d\n", x > y ? x-y : y-x); // x>y(���ǽ�) ? (���϶�)x��� : (�����϶�)y���
		
		System.out.printf("y<200 ? 200-y :(y==200?y:y-200)=%d\n", y<200 ? 200-y :(y==200?y:y-200)); 
		//y<200(���ǽ�)? (���϶�)200-y ��� : ((�����϶�) y==200(���ǽ�) ? (���϶�)y ��� : (�����϶�) y-200���)
		
		System.out.printf("x<=100?y<200?x:y:x+y=%d\n\n",x<=100?y<200?x:y:x+y);
		//x<100(���ǽ�1)? y<=200(���ǽ�2) ?(���ǽ�1,2 ���϶�)x��� : (���ǽ�1 ��,2 �����϶�)y��� : (���ǽ�1,2�����϶�) x+y���
		
	}

	public static void main(String[] args) {
		OperatorTest o=new OperatorTest();
		o.firstOper(100, 200);
		int a = 200, b = 15;

		System.out.println("���׿�����");
		System.out.printf("a++=%d\n", a++); // ���� �Ŀ� a�� ����
		System.out.printf("a=%d\n", a);
		System.out.printf("++a=%d\n", ++a); // ���� ���� a�� ����

		System.out.printf("b--=%d\n", b--); // ���� �Ŀ� b�� ����
		System.out.printf("b=%d\n", b);
		System.out.printf("--b=%d\n\n", --b); // ���� ���� b�� ����

		System.out.println("���������");
		System.out.printf("a+b=%d\n", a + b);
		System.out.printf("a-b=%d\n", a - b);
		System.out.printf("a*b=%d\n", a * b);
		System.out.printf("a/b=%f\n", (float)a /(float)b); //�Ǽ��� ����ȯ
		System.out.printf("a(mod)b=%d\n\n", a % b);

		System.out.println("�񱳿�����");
		System.out.printf("a>b=%b\n", a > b);
		System.out.printf("a<b=%b\n", a < b);
		System.out.printf("a==b=%b\n", a == b);
		System.out.printf("a!=b=%b\n\n", a != b);

		System.out.println("��Ʈ��������");
		System.out.printf("a&b=%d\n", a & b); // 10���� ���
		System.out.printf("a&b=%s\n", Integer.toBinaryString(a % b)); // 2���� ���
		System.out.printf("a^b=%d\n", a ^ b);
		System.out.printf("a^b=%s\n", Integer.toBinaryString(a ^ b));
		System.out.printf("a|b=%d\n", a | b);
		System.out.printf("a|b=%s\n\n", Integer.toBinaryString(a | b));

		/*
		 * A B | A&B | A|B | A^B 
		 * 0 0 |  0  |  0  |  0 
		 * 0 1 |  1  |  0  |  1 
		 * 1 0 |  1  |  0  |  1 
		 * 1 1 |  1  |  1  |  0
		 */


	}

}
