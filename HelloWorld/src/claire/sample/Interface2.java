package claire.sample;

public class Interface2 {

	public static void main(String[] args) {
		System.out.println(Choices.YES);
		Choices.p.walk();
		System.out.println(Choices.NO);
	}

}

interface Choices {
	// 상수선언
	public static final int YES = 1;
	int NO = 2;

	Person12 p = new Person12();
	// Person12 p12; // 상수 선언 시, 초기화 필수

}

interface Walkable2 {
	void walk();
}

interface Swimmable {
	void swim();
}

class Lion implements Walkable2 {

	@Override
	public void walk() {
	}

}

class Turtle implements Walkable2, Swimmable { // 두개의 인터페이스를 구현해서 하나의 클래스로 생성 가능

	@Override
	public void swim() {
	}

	@Override
	public void walk() {
	}

}
