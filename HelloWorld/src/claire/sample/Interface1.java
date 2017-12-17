package claire.sample;

public class Interface1 {

	public static void main(String[] args) {

		Person10 p = new Person10();
		p.walk();

		Duck d = new Duck();
		d.walk();

		Person10[] p10a = new Person10[3];
		p10a[0] = new Person10();
		p10a[1] = new Person10();
		p10a[2] = new Person10();

		p10a[0].walk();
		p10a[1].walk();
		p10a[2].walk(); // 사람이 증가하면 코드 증가

		Walkable.letThemWalk(p10a); // 위에 있는 코드를 간단하게 표현

		Person10[] p10b = new Person10[3];
		p10b[0] = new Person10();
		// p10b[1] = new Duck(); // 컴파일 오류
		// Person10 타입 배열에 Duck 타입 클래스 저장 시도
		p10b[2] = new Person10();

		// 첫 번째 시도 - Object 배열 사용
		Object[] obj = new Object[3];
		obj[0] = new Person10();
		// obj[1] = new Duck(); // wow 된다
		obj[2] = new Person10();

		// Walkable.letThemWalk((Person10[]) obj); // 하지만 출력이 안됨.....
		// 어느정도 진행은 되지만 근본적인 해결은 안됨

		// 두 번째 시도 - Walkable에 메서드 추가

		// 세 번째 시도 - 상속
		// MoveObject (walk) - Person, Duck
		// 만일 Fish, Bird 라는 객체를 추가하면?

		// 최종 해결책 - 인터페이스
		Walkables wk; // 인터페이스 변수 선언
		// new Walkables(); // 일종의 추상클래스이기 때문에 객체화 할 수 없음

		Person12 p12 = new Person12();
		Duck12 d12 = new Duck12();
		// 인터페이스를 구현한 클래스는 객체화 할 수 있음

		Walkables wk1 = new Person12();
		Walkables wk2 = new Duck12();
		// Person12, Duck12 는 Walkables를 구현한 클래스이므로 upcasting이 가능 - 상속에서 형변환과 동일

		wk1.walk();
		wk2.walk();

		Walkables[] wks = new Walkables[3];
		wks[0] = new Person12();
		wks[1] = new Duck12();
		wks[2] = new Cat12();

		Walkable.letThemWalk(wks);

		// 프린터 출력하기
		Printable p1 = new HPPrinter();
		p1.print();

		p1 = new CannonPrinter();
		p1.print();

		// 인터페이스 없이 출력
		HPPrinters hp = new HPPrinters();
		hp.speedyprint();

		CannonPrinters cannon = new CannonPrinters();
		cannon.colorfulprint();

	}

}

// 인터페이스 = 추상메서드 + 상수 로만 구성

interface Hello {
	int A = 1; // 상수는 반드시 대문자로 표기해야하며, 초기화 시켜야 함.

	void B(); // 추상메서드로 작성 (뒤에 중괄호 제거)

}

class Person10 {
	public void walk() {
		System.out.println("사람이 걸어요");
	}
}

class Duck {
	public void walk() {
		System.out.println("오리가 걸어요");
	}
}

class Walkable { // 기능위주 클래스 : 메서드는 주로 static으로 선언
	public static void letThemWalk(Person10[] list) {
		for (Person10 p : list) {
			p.walk();
		}
		// for (int i = 0; i < list.length; ++i) {
		// Person10 p = list[i];
		// p.walk();
		// }
	}

	// 두 번째 시도 - 객체 추가되면 메서드도 계속 추가
	public static void letThemWalk(Duck[] list) {
		for (Duck d : list) {
			d.walk();
		}
	}

	// 인터페이스로 구현한 객체를 처리
	public static void letThemWalk(Walkables[] list) {
		for (Walkables w : list) {
			w.walk();
		}
	}

}

interface Walkables {
	void walk(); // 추상메서드 생성
}

class Person12 implements Walkables {

	@Override
	public void walk() {
		System.out.println("사람이 걷는다");
	}

}

class Duck12 implements Walkables {

	@Override
	public void walk() {
		System.out.println("오리가 걷는다");
	}

}

class Cat12 implements Walkables {

	@Override
	public void walk() {
		System.out.println("고양이가 걷는다");
	}

}

// 윈도우에서 프린터를 제대로 사용할 수 있으려면 Printable 이라는 인터페이스를 만들어
// 각 제조사에게 배포하고 그것을 토대로 프린터 드라이버를 작성하게 함

// 윈도우(제공자)가 제시하는 계약(인터페이스)에 따라 제조자(사용자)는 그것에 따라 코드를 작성(계약이행)
interface Printable {
	void print(); // 인터페이스 안에서는 추상 메서드 작성
}

class HPPrinter implements Printable {
	@Override
	public void print() {
		System.out.println("HP 프린터로 출력합니다");
	}
}

class CannonPrinter implements Printable {
	@Override
	public void print() {
		System.out.println("Cannon 프린터로 출력합니다");
	}
}

// 인터페이스를 사용하지 않는 경우
class CannonPrinters {
	public void colorfulprint() {
		System.out.println("칼라풀하게 출력");
	}
}

class HPPrinters {
	public void speedyprint() {
		System.out.println("최강속도로 출력");
	}
}