package New.practice;

public class OperatorTest {// 연산자: 계산을 목적으로 사용되는 기호.

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

	public static void main(String[] args) {
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
		System.out.printf("a/b=%d\n", a / b);
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

		System.out.println("조건논리연산자");
		System.out.printf("a>10 && b<10:%b\n", a > 10 && b < 10);
		System.out.printf("a>10 || b=<10:%b\n\n", a > 10 || b < 10);

		System.out.println("삼항연산자");
		System.out.printf("a>b?a:b=%d\n", a > b ? a : b); // a>b(조건식) ? (참일때)a출력 : (거짓일때)b출력
		System.out.printf("b==13?b:a=%d\n", b == 13 ? b : a);

	}

}
