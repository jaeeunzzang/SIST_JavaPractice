package New.practice;

public class OperatorTest {// ������: ����� �������� ���Ǵ� ��ȣ.

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

	public static void main(String[] args) {
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
		System.out.printf("a/b=%d\n", a / b);
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

		System.out.println("���ǳ�������");
		System.out.printf("a>10 && b<10:%b\n", a > 10 && b < 10);
		System.out.printf("a>10 || b=<10:%b\n\n", a > 10 || b < 10);

		System.out.println("���׿�����");
		System.out.printf("a>b?a:b=%d\n", a > b ? a : b); // a>b(���ǽ�) ? (���϶�)a��� : (�����϶�)b���
		System.out.printf("b==13?b:a=%d\n", b == 13 ? b : a);

	}

}
