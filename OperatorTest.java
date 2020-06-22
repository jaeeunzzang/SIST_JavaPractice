package New.practice;

public class OperatorTest {//Ŭ����(�Ӽ�+���), ���赵-->�߻�ȭ
	// ������: ����� �������� ���Ǵ� ��ȣ.

	/*
	 * �������� �켱����! 
	 * �ֿ켱������ : []�迭��ȣ, ()�켱���� ����, .(�ּ�) 
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
		System.out.printf("x>y?x-y:y-x=%d\n", x > y ? x-y : y-x); // x>y(���ǽ�) ? (���϶�)x���� : (�����϶�)y����
		
		System.out.printf("y<200 ? 200-y :(y==200?y:y-200)=%d\n", y<200 ? 200-y :(y==200?y:y-200)); 
		//y<200(���ǽ�)? (���϶�)200-y ���� : ((�����϶�) y==200(���ǽ�) ? (���϶�)y ���� : (�����϶�) y-200����)
		
		System.out.printf("x<=100?y<200?x:y:x+y=%d\n\n",x<=100?y<200?x:y:x+y);
		//x<100(���ǽ�1)? y<=200(���ǽ�2) ?(���ǽ�1,2 ���϶�)x���� : (���ǽ�1 ��,2 �����϶�)y���� : (���ǽ�1,2�����϶�) x+y����
		
	}
	public void secondOper(int a, int b)
	{
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
	public void thirdOper(int a, int b,int c, int d)
	{
		System.out.println("����,��Ʈ ��������");
		boolean state= ++a>1 & b++ ==2 & --c<3 & d--==4;
		System.out.printf("state=%b,a=%d,b=%d,c=%d,d=%d\n",state,a,b,c,d);
		state= ++a>1 && b++ ==2 && --c<3 && d--==4;
		System.out.printf("state=%b,a=%d,b=%d,c=%d,d=%d\n",state,a,b,c,d);
		//b++ ==2 ���� ����ϰ� ���ǿ� �����̱⶧���� state�� �������.(and���꿡���� ������ �ϳ��� ������ ����� ����)
		//���� �� ���� ������ �������� �ʴ´�.
		state= ++a>1 | b++ ==2 | --c<3 | d--==4;
		System.out.printf("state=%b,a=%d,b=%d,c=%d,d=%d\n",state,a,b,c,d);
		state= ++a>1 || b++ ==2 || --c<3 || d--==4;
		System.out.printf("state=%b,a=%d,b=%d,c=%d,d=%d\n\n",state,a,b,c,d);
		//++a>1 ���� ����ϰ� ���ǿ� ���̱� ������ (or���꿡���� ���� �ϳ��������� ����� ��.) 
		//���� ������ ������ �������� �ʴ´�.
	}
	
	public int abs(int x,int y, int z)
	{
		System.out.println("���׿�����");
		System.out.printf("x++=%d\n", x++); // ���� �Ŀ� a�� ����
		System.out.printf("x=%d\n", x);
		System.out.printf("++x=%d\n", ++x); // ���� ���� a�� ����
		
		System.out.printf("y--=%d\n", y--); // ���� �Ŀ� b�� ����
		System.out.printf("y=%d\n", y);
		System.out.printf("--y=%d\n", --y); // ���� ���� b�� ����
				
		System.out.printf("z+=--y%d\n",z+=--y+x++); // (--y�� �� + x��) + z. ���Ŀ� x�� 1����.
		
		return x>(y+z)||x==200? y>z? x-(y+z):x-(z-y):x-(y-z);
		
	}
	public int abs2(int x,int y,int z, int k)
	{
		return !(x>y)?(x++ + ++y - --z + k--):(++x + y++ - z-- + --k);
		// !(x>y)-->(= x<y) �϶�, ���̸� x++, �����̸� ++x
	}
	public void ope()
	{
		System.out.println("����,���� �׽�Ʈ");
		int x=10,y=5;
		System.out.println(x+++--y);
		System.out.println(x++-(--y));
		
		x=10;
		y=5;
		System.out.println(x---(--y));
		//((x--)-(--y)), (x-- - --y) 
		
		x+=5;
		System.out.println((--x*y++)+"\n");
		
	}

	public char oper(int x, int y)
	{
		return x==y?'T':'F'; //���ϰ� Char��
	}
	public boolean oper2(int x,int y)
	{
		return x==y; //���ϰ� ����
	}
	
	public static void main(String[] args) {
		OperatorTest o=new OperatorTest();
		o.firstOper(100, 199);
		System.out.println(o.abs(100, 15, -10)+"\n");
		o.ope();
		System.out.println("x==y:"+o.oper(10, 20));
		System.out.println("x==y:"+o.oper2(10, 10)+"\n");
		int result=(o.abs2(1, 2, 3,4)+o.abs2(5, 6, 7, 8));
		System.out.println("result:"+result+"\n");
		o.secondOper(10, 20);
		o.thirdOper(1, 2, 3, 4);
		int a = 200, b =105;


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



	}

}
