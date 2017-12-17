package claire.sample;

public class DataType {

	public static void main(String[] args) {
		// 기본 자료형 primitive
		// 정수 : int

		int int1 = 21;
		int int2 = 021; // 8진수를 의미하는 접두사 0
		int int3 = 0;
		int int4 = 00; // 8진수

		int int5 = 0x123; // 16진수를 의미하는 접두사 x
		int int6 = 0x10;
		int int7 = 0xA;
		int int8 = 0xdecafe;
		int int9 = 0x1A2B;
		int int10 = 0x0123;

		int int11 = 0b10101; // 2진수를 의미하는 접두사 b
		int int12 = 0b00011;
		int int13 = 0b10;
		int int14 = 0b00000010;

		int int15 = Integer.MAX_VALUE; // 상수, 정수의 상수 최대값을 나타나는 max_value
		int int16 = Integer.MIN_VALUE;

		// long - 정수보다 더 많은 수를 저장
		long long1 = 0L; // long으로 저장하려면 접미사L 사용.
		long long2 = 401L;
		long long3 = -3556L;
		long long4 = 89898L;
		long long5 = -105L;

		long long7 = 25L;
		long long8 = 031L;
		long long9 = 0X19L;
		long long10 = 0b11001L;
		// long long11 = 12345678912345678912L; // 범위초과

		int int17 = 10;
		long long11 = 20;
		long11 = int17; // long(64bit)변수에 int(32bit) 값 저장
						// 자동형변환 - 확대변환

		int int18 = 10;
		long long12 = 2147483655L;
		// int18 = long12; // int(32bit)변수에 long(64bit)값 저장
		// 축소변환 - 불가 (데이터손실)

		int int19 = 5;
		long long13 = 25L;
		// int19 = long13; // 불가

		int18 = (int) long12; // 명시적 형변환
								// (변환타입) : cast 연산자
		int19 = (int) long13;

		long longmax = Long.MAX_VALUE;
		long longmin = Long.MIN_VALUE;

		byte bytemax = Byte.MAX_VALUE;
		byte bytemin = Byte.MIN_VALUE;

		short shortmax = Short.MAX_VALUE;
		short shortmin = Short.MIN_VALUE;

		// char
		// 문자 하나 저장, ' '를 사용
		char char1 = 'A';
		char char2 = 'L';
		char char3 = '5';
		char char4 = '/';

		// String str1 = 'A';
		String str2 = "A";
		String str3 = "ABC";
		// char char5 = "A";

		// escape sequence
		// 문자 리터럴로 처리하지 않고
		// 문자 그대로 처리하고 싶을 때 사용
		char char6 = '/';
		char char7 = '\n'; // 줄바꿈
		char char8 = '\r'; // 라인피드
		char char9 = '\b'; // beep
		char char10 = '\t'; // 탭문자
		char char11 = '\''; // 작은따옴표 '
		char char12 = '"'; // 큰 따옴표 "

		// unicode
		// 다국어를 표기하기 위한 문자집합
		char char13 = '\u0041';
		char char14 = '\uAC00';

		char char15 = '\52';
		char char16 = '\141';
		// char char17 = '\400'; // 256이상 X.
		char char18 = '\42';
		char char19 = '\10';

		byte byte7 = 10;
		short short6 = 15;
		int int123 = 150;
		long long16 = 20L;
		char char20 = 'A';

		// byte and char
		// byte7 = char18; // 형변환 오류
		byte7 = (byte) char18;
		// char18 = byte7; //
		char18 = (char) byte7;

		// short and char
		// short6 = char18; // 형변환 오류
		short6 = (short) char18;
		// char18 = short6; // 형변환 오류
		char18 = (char) short6;

		// int and char
		// int50 = char54; // 형변환 오류
		// int50 = (int)char54; // 형변환 오류

		char char21 = 'A';
		int int24 = 65;
		// 아스키코드 0 - 9 : 48-57
		// 아스키코드 a - z : 97-122
		// 아스키코드 A - Z : 65-90

		char charmax = Character.MAX_VALUE;
		char charmin = Character.MIN_VALUE;

		// boolean - 논리값 저장 (true, false)
		boolean boo11 = true;
		boolean boo12 = false;
		// boolean boo13 = 123; // 오류
		// boolean boo14 = 'a'; // 오류

		// float (정밀도 유의)
		// float 형 리터럴 선언시 접미사 f, F
		float float1 = 296 / 3.0f;
		float float2 = 8F;
		float float3 = 8.F;
		float float4 = 8.0F;
		float float5 = 3.14F;

		float floatmax = Float.MAX_VALUE;
		float floatmin = Float.MIN_VALUE;
		float floatInf = Float.POSITIVE_INFINITY;
		float floatNaN = Float.NaN;

		// double (정밀도 유의)
		// double 형 리터럴 선언 시 접미사 d,D (추천!)
		double double1 = 8D;
		double double2 = 8.;
		double double3 = 8.0;
		double double4 = 8.D;
		double double5 = 78.9867;

		double doublemax = Double.MAX_VALUE;
		double doublemin = Double.MIN_VALUE;
		double doubleInf = Double.POSITIVE_INFINITY;
		double doubleNan = Double.NaN;

		// underscore
		// 숫자 표기 시 자릿수를 나타내기 위해 사용
		// JDK 7 이상부터 지원하기 시작
		int x1 = 1_969;
		int x2 = 1__969;

		// int y1 = _1234; // 오류
		// int y2 = 1234_; // 오류

		System.out.println("int1 = " + int1);
		System.out.println("int2 = " + int2);
		System.out.println("int3 = " + int3);
		System.out.println("int4 = " + int4);
		System.out.println("int5 = " + int5);
		System.out.println("int6 = " + int6);
		System.out.println("int7 = " + int7);
		System.out.println("int8 = " + int8);
		System.out.println("int9 = " + int9);
		System.out.println("int10 = " + int10);
		System.out.println("int11 = " + int11);
		System.out.println("int12 = " + int12);
		System.out.println("int13 = " + int13);
		System.out.println("int14 = " + int14);
		System.out.println("정수 최대 = " + int15);
		System.out.println("정수 최소 = " + int16);

		System.out.println("줄바꿈\n\n\n\n");
		System.out.println("탭\t탭\t탭\t탭\t탭");

		System.out.println("A의 int는?" + (int) char21);
		System.out.println("65의 char는?" + (char) int24);

		System.out.println("296/3의 float = " + float1);
		System.out.println("296/3의 double = " + double1);

		System.out.printf("296/3의 float = %f\n", float1);
		System.out.printf("296/3의 float = %10f\n", float1);
		System.out.printf("296/3의 float = %.2f\n", float1);
	}

}
