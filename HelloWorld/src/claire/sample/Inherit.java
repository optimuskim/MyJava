package claire.sample;

public class Inherit {

	public static void main(String[] args) {
		Eagle e1 = new Eagle();
		e1.eat();
		e1.sleep();
		e1.fly();

		Tiger t1 = new Tiger();
		t1.eat();
		t1.sleep();
		t1.run();

		Goldfish g1 = new Goldfish();
		g1.eat();
		g1.sleep();
		g1.swim();

		// 부모클래스를 객체로 만들수도 있다!
		// 부모클래스를 객체로 만들지 못하게 하고 싶다면
		// 추상 클래스로 만들면 됨 -> abstract
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();

		// 다형성 - 타입 형변환
		// 상속관계에 있는 자식 클래스의 객체는
		// 부모클래스의 타입으로 변한 가능
		Animal a = e1;
		a = t1;
		a = g1;

		// 다운캐스팅 - 명시적 캐스팅 사용
		Tiger t = (Tiger) a;
		Goldfish g = (Goldfish) a;
		Eagle e = (Eagle) a;

	}

}

class Animal {
	private String eyes;
	private String mouth;

	public Animal() {
	}

	public void eat() {
		System.out.println("지금은 먹는 중");
	}

	public void sleep() {
		System.out.println("지금은 자는 중");
	}
}

class Eagle extends Animal {
	private String wing;

	public void fly() {
		System.out.println("지금은 나는 중");
	}
}

class Tiger extends Animal {
	private String leg;

	public void run() {
		System.out.println("지금은 뛰는 중");
	}
}

class Goldfish extends Animal {
	private String fin;

	public void swim() {
		System.out.println("지금은 헤엄치는 중");
	}
}

class User {
	private String userid;
	private String passwd;
	private String addr;

	private Zipcode zip; // 클래스 안에 또 다른 클래스를 변수처럼 포함할 수 있다
							// 사용자는 주소 정보를 가짐
							// has-a 관계 형성
}

class Zipcode {
	private String zipcode;
	private String sido;
	private String gugun;
	private String dong;
	private String bunji;
}

class Device {
	protected String name; // private 이면서 상속 클래스에 있을때 접근 가능할 수 있게 해줌
							// 단일 클래스는 private 선언하고 set/get 만들면 된다
}

class Camera extends Device { // Camera 클래스가 Device 클래스 상속 받았음
	public String showName() {
		return name;
	}
}
