package New.practice;

public class OperatorTest {//클래스(속성+기능), 설계도-->추상화
	// 연산자: 계산을 목적으로 사용되는 기호.

	/*
	 * 연산자의 우선순위! 
	 * 최우선연산자 : []배열기호, ()우선순위 변경, .(주소) 
	 * 단항연산자: +,-(부호), ~,!(not),++,--
	 * 산술연산자:*,/,%(나머지), +, - 
	 * shift 연산자: >>,<<,>>>(양수화) 
	 * 관계(비교)연산자: <,>,<=,>=, ==, !=
	 * 비트논리연산자: &(and), ^(xor), |(or) 
	 * 조건논리연산자:&&,|| 
	 * 삼항 연산자: 조건식 ? 명령1(참) : 명령2(거짓);
	 * 대입연산자: =,+=,-=,*=,/=,%=,&=,^=,|= 
	 * 콤마연산자: , 순서의미
	 */
	
	public void firstOper(int x, int y)
	{
		System.out.println("조건논리연산자");
		System.out.printf("x>10 && y<10:%b\n", x > 10 && y < 10); //&&(AND)연산 : ~~ 이면서 ~~
		System.out.printf("x>10 || y=<10:%b\n\n", x > 10 || y < 10);//||(OR)연산: ~~ 이거나 ~~
		
		System.out.println("삼항연산자");
		System.out.printf("x>y?x-y:y-x=%d\n", x > y ? x-y : y-x); // x>y(조건식) ? (참일때)x실행 : (거짓일때)y실행
		
		System.out.printf("y<200 ? 200-y :(y==200?y:y-200)=%d\n", y<200 ? 200-y :(y==200?y:y-200)); 
		//y<200(조건식)? (참일때)200-y 실행 : ((거짓일때) y==200(조건식) ? (참일때)y 실행 : (거짓일때) y-200실행)
		
		System.out.printf("x<=100?y<200?x:y:x+y=%d\n\n",x<=100?y<200?x:y:x+y);
		//x<100(조건식1)? y<=200(조건식2) ?(조건식1,2 참일때)x실행 : (조건식1 참,2 거짓일때)y실행 : (조건식1,2거짓일때) x+y실행
		
	}
	public void secondOper(int a, int b)
	{
		System.out.println("비트논리연산자");
		System.out.printf("a&b=%d\n", a & b); // 10진수 출력
		System.out.printf("a&b=%s\n", Integer.toBinaryString(a % b)); // 2진수 출력
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
		System.out.println("조건,비트 논리연산자");
		boolean state= ++a>1 & b++ ==2 & --c<3 & d--==4;
		System.out.printf("state=%b,a=%d,b=%d,c=%d,d=%d\n",state,a,b,c,d);
		state= ++a>1 && b++ ==2 && --c<3 && d--==4;
		System.out.printf("state=%b,a=%d,b=%d,c=%d,d=%d\n",state,a,b,c,d);
		//b++ ==2 까지 계산하고 조건에 거짓이기때문에 state에 거짓출력.(and연산에서는 거짓이 하나라도 있으면 결과가 거짓)
		//따라서 그 이후 연산은 수행하지 않는다.
		state= ++a>1 | b++ ==2 | --c<3 | d--==4;
		System.out.printf("state=%b,a=%d,b=%d,c=%d,d=%d\n",state,a,b,c,d);
		state= ++a>1 || b++ ==2 || --c<3 || d--==4;
		System.out.printf("state=%b,a=%d,b=%d,c=%d,d=%d\n\n",state,a,b,c,d);
		//++a>1 까지 계산하고 조건에 참이기 때문에 (or연산에서는 참이 하나라도있으면 결과가 참.) 
		//따라서 그이후 연산은 수행하지 않는다.
	}
	
	public int abs(int x,int y, int z)
	{
		System.out.println("단항연산자");
		System.out.printf("x++=%d\n", x++); // 실행 후에 a값 증가
		System.out.printf("x=%d\n", x);
		System.out.printf("++x=%d\n", ++x); // 실행 전에 a값 증가
		
		System.out.printf("y--=%d\n", y--); // 실행 후에 b값 감소
		System.out.printf("y=%d\n", y);
		System.out.printf("--y=%d\n", --y); // 실행 전에 b값 감소
				
		System.out.printf("z+=--y%d\n",z+=--y+x++); // (--y한 값 + x값) + z. 그후에 x는 1증가.
		
		return x>(y+z)||x==200? y>z? x-(y+z):x-(z-y):x-(y-z);
		
	}
	public int abs2(int x,int y,int z, int k)
	{
		return !(x>y)?(x++ + ++y - --z + k--):(++x + y++ - z-- + --k);
		// !(x>y)-->(= x<y) 일때, 참이면 x++, 거짓이면 ++x
	}
	public void ope()
	{
		System.out.println("전위,후위 테스트");
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
		return x==y?'T':'F'; //리턴값 Char형
	}
	public boolean oper2(int x,int y)
	{
		return x==y; //리턴값 논리형
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


		System.out.println("산술연산자");
		System.out.printf("a+b=%d\n", a + b);
		System.out.printf("a-b=%d\n", a - b);
		System.out.printf("a*b=%d\n", a * b);
		System.out.printf("a/b=%f\n", (float)a /(float)b); //실수형 형변환
		System.out.printf("a(mod)b=%d\n\n", a % b);

		System.out.println("비교연산자");
		System.out.printf("a>b=%b\n", a > b);
		System.out.printf("a<b=%b\n", a < b);
		System.out.printf("a==b=%b\n", a == b);
		System.out.printf("a!=b=%b\n\n", a != b);



	}

}
