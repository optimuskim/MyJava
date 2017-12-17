package claire.sample;

public class AbstractClass {

	public static void main(String[] args) {
		// 일반 클래스는 객체화가 가능
		Finished f = new Finished(); // Finished 객체 생성

		// 추상클래스는 객체화가 되지 않음
		// Unfinished uf = new Unfinished();

		// 추상클래스는 상속을 통해 객체화 가능
		NewOne no = new NewOne();

	}

}

// 완성된 클래스

class Finished {
}

// 추상 클래스
abstract class Unfinished {
	String name; // 멤버변수

	public void sayHello() {
	} // 메서드

	public abstract void sayHello(String msg); // 추상메서드 - 메서드 몸체가 없음(완전한 메서드 형태가 아님)
}

class NewOne extends Unfinished { // 추상메서드에 해당하는 내용은 자손 클래스에서 정의해라~

	@Override // 추상메서드를 재정의
	public void sayHello(String msg) {
		// TODO 자동 생성된 메소드 스텁

	}
}