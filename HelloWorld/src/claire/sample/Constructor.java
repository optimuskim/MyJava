package claire.sample;

public class Constructor {

	public static void main(String[] args) {
		Human3 person = new Human3();
		// 생성자를 통해 멤버변수에 값을 초기화 했음
		System.out.println(person.name);
		System.out.println(person.age);

		Human3 p1 = new Human3(); // 영희, 10
		Human3 p2 = new Human3("철수"); // 철수, 10
		Human3 p3 = new Human3(20); // 영희, 20
		Human3 p4 = new Human3("혜교", 25); // 혜교, 25

		// 접근제어
		// Human3의 멤버는 default 접근제어 적용
		// 패키지 내 클래스에서 접근 가능
		p1.name = "수지";
		p1.age = 30;

		// Human5는 private으로 선언
		// 따라서 Human5에 선언된 변수는
		// Constructor에서는 볼 수 없음
		Human5 p5 = new Human5();
		// p5.name = "토르";
		// p5.age = 49;

		// Human6는 public으로 선언
		Human6 p6 = new Human6();
		p6.name = "토르";
		p6.age = 49;

		// private 으로 선언된 멤버변수에 접근하려면?
		// setter/getter 메서드를 사용
		// setXxx() / getXxx()

	}

}

class Human3 {
	String name;
	int age;

	// 생성자
	// 생성방법 : public 클래스이름()
	public Human3() {
		name = "영희";
		age = 10;
	}

	// 또 다른 유형의 생성자
	public Human3(String pname) {
		name = pname;
	}

	public Human3(int age) {
		this.age = age;
	}

	public Human3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 생성자를 여러 형태로 정의하는 것을
	// 생성자 다중정의 (overloading) 라 함

}

class CallConstruct {
	String msg;

	public CallConstruct() { // 기본 생성자
		// msg = "테스트";
		// CallConstruct("테스트"); // 오류!
		this("테스트");
	}

	public CallConstruct(String msg) { // 매개변수가 있는 생성자
		this.msg = msg;
	}
}

class Human4 {
	String name;
	int age;

	public Human4() {
		this("혜교", 25);
	}

	public Human4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human4(String name) { // 이름은 받고 나이만 초기화
		this(name, 99); // 메서드 다중정의
	}

	public Human4(int age) { // 나이는 받고 이름만 초기화
		this("혜교", age); // // 메서드 다중정의
	}

}

class Human5 {
	private String name;
	private int age;
}

class Human6 {
	public String name;
	public int age;
}