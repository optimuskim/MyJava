package claire.sample;

public class Operator {

	public static void main(String[] args) {
		// 연산자

		// 대입연산자 =
		int int1; // 변수 선언
		int1 = 25; // 리터럴 대입

		byte byte1 = 5; // 선언 및 대입을 동시에
		char char1 = 'a';
		short short1 = -200; // 음수 저장
		int int2 = 10;

		int2 = byte1;
		int2 = char1;
		int2 = short1;

		long long1 = 524L;
		float float1 = 1.19F;
		int int3 = 15;
		// int3 = long1; // 오류, 대입실패
		// int3 = float1; // 오류

		int3 = (int) long1; // 형변환 필요
		int3 = (int) float1; // 형변환

		// 다중대입
		int int4 = 25;
		int int5, int6, int7, int8, int9, int10;
		int4 = int5 = 25;
		int4 = int6 = int7 = int8 = int9 = int10 = 219;

		int int11 = 10, int12 = 200, int13;

		// +
		byte byte2;
		byte2 = 5;

		byte byte3;
		byte byte4 = 2;
		byte byte5 = 3;

		// byte3 = byte4 + byte5; // 형변환 필요
		// 산술 연산의 기본 타입은 int
		byte3 = (byte) (byte4 + byte5);
		// byte3 = (byte)byte4 + byte5; // byte4 와 byte5 모두 형변환 필요
		// 수식의 결과는 int이므로 오류!
		// 타입의 크기는 byte보다 int가 크므로
		// 암시적으로 확대형변환 실시

		float float2 = 2.5F;
		double double2 = 20.0;
		byte byte7 = 2;
		byte byte8 = 3;

		// byte7 = float2 + byte8;
		// byte7 = float2 + double2;
		// 서로 다른 타입간 연산은
		// 타입의 크기가 큰 쪽으로 지정
		// 명시적 형변환 필요

		byte7 = (byte) (float2 + byte8);
		byte7 = (byte) (float2 + double2);

		int int29;
		int29 = 5 / 2;
		System.out.printf("5/2 =%d \n", int29);
		int29 = 5 / 3;
		System.out.printf("5/3 =%d \n", int29);
		int29 = 5 / 4;
		System.out.printf("5/4 =%d \n", int29);
		int29 = 5 / 5;
		System.out.printf("5/5 =%d \n", int29);
		int29 = 5 / 6;
		System.out.printf("5/6 =%d \n", int29);
		int29 = 5 / 7;
		System.out.printf("5/7 =%d \n", int29);
		// 정수를 정수로 나누면 결과는 정수

		float float5;
		float5 = 15.0F / 4.0F;
		float5 = 15 / 4.0F;
		// float = 15.0 / 4.0F; // 컴파일타임 에러
		// 타입 불일치
		float5 = (float) (15.0 / 4.0F);
		float5 = 15 / 4;
		System.out.printf("15/4 = %f \n", float5);

		int int30 = 2;
		int int31 = 5;
		int int32 = 0;
		// int30 = int31 / int32;
		// 0으로 나누는 연산은 오류를 유발
		// 컴파일 시 오류는 안나고
		// 실행시간 때 오류를 알 수 있음
		// 적절한 예외처리가 필요

		// % - 나머지 연산
		int int33;
		// int33 = 15 % 0;
		// 0으로 나누는 연산은 오류를 유발

		int int34;
		int34 = 15 % 6;
		int34 = -15 % 6;
		int34 = 15 % -6;
		int34 = -15 % -6;
		int34 = 5 % 7;
		int34 = 0 % 7;

		System.out.println("0 % 7 = " + int34);

		// -
		byte byte13 = 10;
		byte byte14 = 5;
		// byte13 = -byte14;
		// int로 바뀌기 때문에 오류 발생
		byte13 = (byte) -byte14;

		// 산술 대입 연산자 +=
		int int37 = 110;
		float float11 = 120.2F;
		byte byte16 = 5;
		String str2 = "Hello";
		boolean bool1 = true;
		int37 += 10;

		int37 += byte16; // int37 = int37 + byte16
		int37 -= 15; // int37 = int37 - 15
		int37 *= 2; // int37 = int37 * 2
		int37 /= 2; // int37 = int37 / 2
		// int37 /= 0; // int37 = int37 / 0
		float11 /= 0.0; // float11 = float11 / 0.0
		int37 %= 3; // int37 = int37 % 3
		str2 += "How are you"; // str2 = str2 + "How are you"
		str2 += float11; // str2 = str2 + float11
		byte16 += float11; // byte16 = byte16 + float11
		str2 += byte16; // str2 = str2 + byte16

		// ++ -- (증감 감소 연산자)
		int int39 = 100;
		int int40 = 15;
		int int41 = int39++ + 15;
		System.out.printf("100++ + 15 = %d \n", int41);

		int int42 = 100;
		int int43 = 50;
		int int44 = ++int42 + 15;
		System.out.printf("++100 + 15 = %d \n", int44);

		// 문자열 연결 연산자 +
		String str3 = "Hello";
		String str4 = "Alekhya";
		String str5 = str3 + str4;
		System.out.println(str5);

		System.out.println(str3 + 123);
		System.out.println(str3 + Double.POSITIVE_INFINITY);
		System.out.println(str3 + 'A');

		int int47 = 26;
		String str6 = "Alphabets";
		String str7 = int47 + str6;
		System.out.println(str7);

		// 비교연산자 ==
		int int53 = 10;
		int int54;
		int int55;
		int int56;
		boolean bool5;
		int53 = int54 = int55 = 15;
		bool5 = (int53 == int54);
		// bool5 = (int53 == int54 == int55);
		// 컴파일 오류!
		// int53 == int54, int54 == int55
		// 90<= avg <= 100 (X)
		// avg>=90, avg<=100

		System.out.println(bool5);
		bool5 = (int53 == (int54 + 1));
		System.out.println(bool5);

		// != : 같지 않다
		bool5 = (int53 != int54);
		System.out.println(bool5);

		// 논리연산자 : && (AND), 단축평가식 지원
		int int71 = 10;
		int int72 = 15;
		boolean bool18 = (int71 > 5 && int72 > 10);
		boolean bool19 = (int71 > 20 && int72 > 10);
		// 단축평가 실행, 좌변식이 거짓 - 전체 거짓
		boolean bool20 = ((int72 = 50) > 5);

		boolean bool21 = (int71 > 5 || int72 > 10);
		// 단축평가 실행, 좌변식이 참 - 전체 참
		boolean bool22 = ((int72 > 20) || int72 > 10);

		// 삼항연산자 ? :
		// (수식) ? 참일때 값 : 거짓일때 값
		int int89 = 50;
		int int90 = 25;
		int int91 = (int89 > int90) ? int89 : int90;
		char char10 = (int89 < int90) ? 'F' : 'T';

		double avg = 98.5;
		char grd = (avg >= 90) ? '수' : '우';
		grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';
		System.out.println(grd);
	}

}
