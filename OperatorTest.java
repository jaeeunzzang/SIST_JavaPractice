package New.practice;

public class OperatorTest {//클래스(속성+기능), 설계도-->추상화
	// 연산자: 계산을 목적으로 사용되는 기호.

	/*
	 * 연산자의 우선순위! 
	 * 최우선연산자 : []배열기호, ()우선순위 변경, . 
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
		System.out.printf("x>y?x-y:y-x=%d\n", x > y ? x-y : y-x); // x>y(조건식) ? (참일때)x출력 : (거짓일때)y출력
		
		System.out.printf("y<200 ? 200-y :(y==200?y:y-200)=%d\n", y<200 ? 200-y :(y==200?y:y-200)); 
		//y<200(조건식)? (참일때)200-y 출력 : ((거짓일때) y==200(조건식) ? (참일때)y 출력 : (거짓일때) y-200출력)
		
		System.out.printf("x<=100?y<200?x:y:x+y=%d\n\n",x<=100?y<200?x:y:x+y);
		//x<100(조건식1)? y<=200(조건식2) ?(조건식1,2 참일때)x출력 : (조건식1 참,2 거짓일때)y출력 : (조건식1,2거짓일때) x+y출력
		
	}

	public static void main(String[] args) {
		OperatorTest o=new OperatorTest();
		o.firstOper(100, 200);
		int a = 200, b = 15;

		System.out.println("단항연산자");
		System.out.printf("a++=%d\n", a++); // 실행 후에 a값 증가
		System.out.printf("a=%d\n", a);
		System.out.printf("++a=%d\n", ++a); // 실행 전에 a값 증가

		System.out.printf("b--=%d\n", b--); // 실행 후에 b값 감소
		System.out.printf("b=%d\n", b);
		System.out.printf("--b=%d\n\n", --b); // 실행 전에 b값 감소

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

}
