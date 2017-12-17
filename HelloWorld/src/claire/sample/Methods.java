package claire.sample;

import java.util.Date;
import java.util.Random;
// 다른사람이 짠 클래스를 가져오고 싶을 때

public class Methods {
	public static void main(String[] args) {
		printPoem();

		// System.out.println(add(12, 87));

		// 메서드 사용하기
		sayHello();
		sayHello2();
		sayHello3("안녕하세요, 자바!");
		sayHello3("안녕하세요, C#!");

		System.out.println(sayHello4("안녕하세요, 파이썬!"));
		String hello = sayHello4("안녕하세요, 파이썬!");
		hello += "\n작성일 : 2017.11.26";
		System.out.println(hello);

		Date today = sayHello5();
		System.out.println(today);
		// Date 클래스는 deprecated 예정이라 메서드에 취소선 표시
		System.out.println(today.getYear() + 1900);
		System.out.println(today.getMonth() + 1);
		System.out.println(today.getDate());
		System.out.println(today.getHours());
		System.out.println(today.getMinutes());
		System.out.println(today.getSeconds());

		// 로또생성
		System.out.println("로또 번호가 생성 되었습니다");
		Lotto645();

	}

	// 메서드 선언
	// 어떤 기능을 하는 문장들을 블록으로 정의하고
	// 그것에 이름을 부여한 것
	// 가독성과 코드 재사용성을 높이기 위해 사용

	// 접근수정자 반환값 메소드이름(매개변수목록) {
	// 메서드를 구성하는문장들
	// }
	public static void printPoem() {
		System.out.println("기이한 복받치는 감정을 느꼈네");
		System.out.println("그리고 감히 그것을 말하겠네");
		System.out.println("하지만, 연인의 귀에만 하겠네");
		System.out.println("내게 전에 일어났던 것을");
	}

	// 두 개의 정수를 입력받아 합을 구하고 결과를 반환
	// public static int add(int num11, int num12) {

	// }

	// 메서드 정의하기 #1 - 매개변수 x, 반환값 x
	public static void sayHello() {
		System.out.println("Hello, Java!!");
	}

	// Hello, C#!!!이라는 메세지를 출력하는 메서드
	public static void sayHello2() {
		System.out.println("Hello C#");
	}

	// 메서드 정의하기 #2 - 매개변수 o, 반환값 x
	public static void sayHello3(String msg) {
		System.out.println(msg);
	}

	// 메서드 정의하기 #3 - 매개변수 o, 반환값 o
	public static String sayHello4(String msg) {
		return msg;
	}

	// 메서드 정의하기 #4 - 매개변수 x, 반환값 o
	public static Date sayHello5() {
		// 현재 시간을 계산해서 출력
		return new Date();
	}

	// 로또 생성기를 메서드로 구현 - Lotto645
	public static void Lotto645() {
		Random r = new Random();
		System.out.println(r.nextInt(45) + 1);
		System.out.println(r.nextInt(45) + 1);
		System.out.println(r.nextInt(45) + 1);
		System.out.println(r.nextInt(45) + 1);
		System.out.println(r.nextInt(45) + 1);
		System.out.println(r.nextInt(45) + 1);

	}

}

class One {

}
