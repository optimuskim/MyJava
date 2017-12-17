package claire.sample;

import java.util.Scanner;

public class Statement {

	public static void main(String[] args) {
		; // 빈문장

		{ // 블록 시작
			String name;
			int kor;
			int eng;
			int mat;
		} // 블록 끝

		// 문장의 개념 (;으로 끝남)
		int num; // 선언문
		int num2 = 100; // 선언 및 초기화
		String str;

		// 99 + 98 + 99; // 표현식만으로 문장 성립 X
		// 99 + 98 + 99 // 표현식
		num = 99 + 98 + 99;
		++num; // num = num + 1
		System.out.println(num); // 출력문

		{
		} // 빈 블록

		// 변수의 유효범위
		// 블록내 선언한 변수는 기본적으로 지역변수
		// 지역변수는 해당 블록을 벗어나면 사용 불가
		// 변수의 유효범위(scope)를 주의함
		{
			int int1 = 20; // 선언
			++int1; // 사용
		}

		int int2; // 블록 밖 변수선언
		{
			int2 = 55;
		}

		{
			int int89 = 10;
			{
				int89 = 45;
				int int87 = 50;
				int87 = 90;
			}
			// int4 = 125; // int4 사용가능?
			int int87 = 125;

			// 조건문
			int num1 = 3;
			if (num1 > 0) { // 조건식의 결과가 참이면 다음 블럭을 실행
				System.out.println("0보다 큼");
			}
			if (num1 < 0) {

			} else { // 조건식의 결과가 참이 아니면 다음 블럭을 실행
				System.out.println("0보다 작음");
			}

			// 짝수인지 아닌지 조건문

			int num3 = 5;
			if (num3 % 2 == 0) {
				System.out.printf("%d 는 짝수 입니다\n", num3);
			} else {
				System.out.printf("%d 는 홀수 입니다\n", num3);
			}

			// 5의 배수인지 아닌지 여부 확인 조건문

			int num4 = 8;
			if (num4 % 5 == 0) {
				System.out.printf("%d 는 5의 배수입니다\n", num4);
			} else {
				System.out.printf("%d 는 5의 배수가 아닙니다\n", num4);
			}

			// 제어문에서 블럭의 중요성
			if (false) {
				;
				;
			} else {
				; // 문장이 하나인 경우 { } 는 생략가능
			}

			// 중첩 if 문
			num1 = 55;
			if (num1 % 5 == 0) {
				System.out.println("5의 배수");
				if (num1 % 10 == 0) {
					System.out.println("10의 배수");
				} else {
					System.out.println("10의 배수 아님");
				}
			} else {
				System.out.println("5의 배수 아님");
			}

			// 아이디 비밀번호 체크
			// 아이디/비번 일치 - 로그인 성공!
			// 아이디/비번 미일치 - 로그인 실패!
			// 아이디 : apple, 비밀번호 : java
			// userid == "apple" (x)
			// userid.equals("apple") (o)
			String userid = "abc123";
			String password = "987xyz";
			// 중첩 if
			if (userid.equals("apple")) {
				if (password.equals("java")) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("로그인 실패! - 비밀번호 틀림");
				}
			} else {
				System.out.println("로그인 실패! - 아이디 틀림");
			}
			// 논리 연산자
			if (userid.equals("apple") && password.equals("java")) {
				System.out.println("로그인 성공!");
			} else {
				System.out.println("로그인 실패!");
			}

			// 애매모호한 if문
			if (num % 5 == 0)
				if (num % 2 == 0)
					System.out.println("5배수 & 2배수");
				else
					System.out.println("5배수 아님");

			if (num % 5 == 0) {
				if (num % 2 == 0)
					System.out.println("5배수 & 2배수");
			} else {
				System.out.println("5배수 아님");
			}

			// 학점 계산
			// 평균 90점 이상 : A
			// 평균 80점 이상 : B
			// 평균 70점 이상 : C
			// 평균 60점 이상 : D
			// 기타 : F
			double avg = 79.5;
			char grd = 'F';

			if (avg >= 90) {
				System.out.println("학점은 A 입니다");
				grd = 'A';
			} else if (avg >= 80) {
				System.out.println("학점은 B 입니다");
				grd = 'B';
			} else if (avg >= 70) {
				System.out.println("학점은 C 입니다");
				grd = 'C';
			} else if (avg >= 60) {
				System.out.println("학점은 D 입니다");
				grd = 'D';
			} else {
				System.out.println("학점은 F 입니다");
				grd = 'F';
			}

			// switch : 다중 if문을 세련된 조건식으로 작성
			num3 = 13;
			switch (num3 % 2) { // 수식의 결과값이 정수
			case 0:
				System.out.println("2의 배수");
				break; // 여기까지만 실행, switch문 밖으로 벗어남
			case 1:
				System.out.println("2의 배수 아님");
				break;
			}

			// double tmp = 1.1;
			// switch(tmp) {
			// } // switch문의 수식에 double은 사용 불가

			String days = "월요일";
			switch (days) {
			case "월요일":
				System.out.println("회사에 출근하는 날....ㅠㅠ");
				break;
			case "금요일":
				System.out.println("오예! 불타는 금요일!....");
				break;
			case "일요일":
				System.out.println("맥주마시며 야구보는 날....");
				break;
			}

			// 성적처리
			avg = 82.5;
			grd = 'A';
			switch ((int) avg / 10) { // 정수수식 또는 문자열변수
			case 10:
			case 9:
				grd = 'A';
				break;
			case 8:
				grd = 'B';
				break;
			case 7:
				grd = 'C';
				break;
			case 6:
				grd = 'D';
				break;
			default:
				grd = 'F';
				break;
			}
			System.out.printf("학점 : %s \n", grd);

			// 반복처리
			System.out.println("안녕하세요!");

			// for문
			// 반복문 내 변수명은 i, j, k, l m 을 사용
			for (int i = 1; i <= 100; ++i) { // 1부터 100까지 1씩 증가
				// 반복실행할 코드
				System.out.println("선생님, 안녕하세요!");
			}

			// 1부터 100사이 짝수만 출력
			for (int j = 2; j <= 100; j += 2) {
				System.out.println(j);
			}

			for (int j = 1; j <= 100; ++j) {
				if (j % 2 == 0)
					System.out.println(j);
			}
			// 1부터 500사이의 5의 배수 출력
			for (int k = 0; k <= 500; k += 5) {
				System.out.println(k);
			}

			// 무한 반복문 - 초기식, 조건식, 증감식을 ; 로 작성 시
			// for (;;) {
			// ;
			// }

			// 반목문에 break, continue 사용하기
			// 반복문 정상 종료 조건 - 조건식이 거짓
			// 반복문 강제 종료 조건 - break 사용
			// 반복문을 일시적으로 건너뛸 때 - continue 사용

			for (int i = 0; i <= 100; ++i) {
				i = 999; // 반복실행 종료를 위한 문장
				System.out.println(i); // 출력?
			}

			for (int i = 0; i <= 100; ++i) {
				// break; // 아래문장 실행 안됨 - 오류!
				System.out.println(i);
				break; // 강제종료
			}

			for (int i = 0; i <= 100; ++i) {
				// continue; // 아래문장 실행 안됨 - 오류!
				if (i % 3 != 0)
					continue;
				System.out.println(i); // 출력-?
			}

			// 중첩 for문
			// 십구구단 중 5단 출력
			// 5 x 1 = 5
			// 5 x 2 = 5
			// 5 x 3 = 5
			// . . . . . .
			// 5 x 19 = 95
			for (int i = 1; i <= 19; ++i) {
				System.out.printf("5 x %d = %d\n", i, 5 * i);
			}

			// 십구구단 중 14, 15, 16단 출력
			// 14 x 1 = 14 15 x 1 = 15 16 x 1 = 16
			// 14 x 2 = 28 15 x 2 = 30 16 x 2 = 32
			// 14 x 3 = 42 15 x 3 = 45 16 x 3 = 48
			// . . . . . .
			// 14 x 19 = 266 15 x 19 = 285 16 x 19 =304

			for (int i = 1; i <= 19; ++i) {
				System.out.printf(" 14 x %2d = %3d	", i, 14 * i);
				System.out.printf(" 15 x %2d = %3d	", i, 15 * i);
				System.out.printf(" 16 x %2d = %3d	\n", i, 16 * i);
			}

			for (int j = 14; j <= 16; ++j) {
				for (int i = 1; i <= 19; ++i) {
					System.out.printf(" %2d x %2d = %3d \t", j, i, j * i);
				}
				System.out.println();
			}

			{
				for (int i = 1; i <= 19; ++i) {
					for (int j = 2; j <= 19; ++j) {
						System.out.printf(" %2d x %2d = %3d \t", j, i, j * i);
					}
					System.out.println();
				}

				// *
				// **
				// ***
				// ****
				// *****

				// *****
				// ****
				// ***
				// **
				// *

				// while - 조건에 의해 반복 실행
				// while (true) { // 무한루프
				// System.out.println("안녕하세욤!");
				// }

				// while (false) { // 실행할 수 없는 반복문
				// System.out.println("이 글이 보이나요?");
				// }

				// 1 ~ 100 출력
				int i = 1; // 초기화식
				while (i <= 100) { // 조건식
					System.out.println(i);
					++i; // 증감식
				}

				// 1 ~ 100 홀수 출력
				i = 1;
				while (i <= 100) {
					System.out.println(i);
					i = i + 2;
				}

				// 1000부터 1까지 7의 배수 출력
				i = 1000;
				while (i >= 1) {
					if (i % 7 == 0)
						System.out.println(i);
					--i;
				}

				i = 994;
				while (i >= 1) {
					System.out.println(i);
					i = -7;
				}

				// while문에서 break 사용
				// 1 ~ 100 사이 짝수 출력
				// 단, 82까지 출력하면 반복문 종료
				int l = 2;
				while (l <= 100) {
					if (l > 82)
						break; // 강제종료
					System.out.println(l);
					l += 2;
				}

				// do-while : 반복 문장을 먼저 실행하고 반복조건검사
				// 1 ~ 100 사이 홀수 출력
				int m = 1; // 초기화식
				do {
					System.out.println(m);
					m += 2; // 증가식
				} while (m <= 100); // 조건식

				// Scanner를 이용해서 외부입력 처리
				Scanner sc = new Scanner(System.in);
				int month;
				do {
					System.out.println("월을 입력하세요 ");
					month = sc.nextInt();

					if (month == 0) {
						System.out.printf("do-while 종료", month);
						break;
					}

					System.out.printf("당신은 %d 월을 입력하셨네요!", month);
				} while (month > 1 || month < 12);
				sc.close(); // 키입력 종료 - 자원 해제

			}
		}
	}
}
