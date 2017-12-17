package claire.sample;

public class Overriding {

	public static void main(String[] args) {
		A a = new A();
		a.print();

		B b = new B(); // B클래스입니다 라고 나오지 않고, A클래스입니다 라고 출력됨.
		b.print();

		a = new C();
		a.print();

		a = new D();
		a.print();

		a = new E();
		a.print();

		a = new F();
		a.print();

		// 부모 클래스 생성자 호출 매커니즘
		// 만일, 부모클래스의 생성자에서
		// 초기화 작업이 정의되어 있다면
		// 자식 클래스에서 이것을 먼저 호출해야 한다.
		ColorBox cb = new ColorBox();
		// System.out.println(cb.name);

		NewColorBox ncb = new NewColorBox();

		// 부모 클래스 생성자 호출시 주의사항
		// 부모 클래스에 기본생성자만 정의되어 있다면
		// 컴파일러가 그것을 호출하는 코드(super())를
		// 자동으로 작성해줌 (암시적)
		// 하지만, 다중정의된 생성자인 경우
		// 그것을 호출하는 코드를 직접 작성
		Point3D p3 = new Point3D(1, 2, 3);

	}

}

class A {
	protected String msg;

	public void print() {
		System.out.println("A클래스 입니다");
	}
}

class B extends A {
	@Override // 어노테이션 : 컴파일러에게 내리는 지시문
				// p -> ctrl+space
	public void print() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("B클래스 입니다");
		super.print(); // 부모클래스의 메서드 호출
	}
	// override
	// 부모 클래스에 정의된 메서드를
	// 자식 클래스에서 다시 정의하는 것
	// 하지만, 부모 클래스의 메서드를 호출하고 싶다면
	// super 지시문을 사용하면 된다
}

class C extends B {
}

class D extends C {
}

class E extends D {
	@Override
	public void print() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("E클래스입니다");
	}
}

class F extends E {
}

class S {
	public void print() {
		System.out.println("S클래스입니다");
	}
}

class T extends S {
	// 메서드 오버라이딩 성립x
	// 매개변수 목록이 부모클래스의 그것과 다름
	public void print(String msg) {
		System.out.println(msg + " 클래스입니다");
	}
}

class Box {
	public Box() {
		System.out.println("Box 클래스의 생성자");
	}
}

class ColorBox extends Box {
	public ColorBox() {
		System.out.println("ColorBox 클래스 생성자");
	}
}

class NewColorBox extends ColorBox {
	public NewColorBox() {
		System.out.println("NewColorBox 클래스 생성자");
	}
}

// 다중정의된 생성자
class Point2D {
	int x;
	int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2D {
	int z;

	public Point3D(int x, int y, int z) {
		// 부모 클래스의 생성자를 명시적으로 호출
		super(x, y);
		// this.x = x;
		// this.y = y;
		this.z = z;

		super.x = 3; // 부모 클래스의 멤버변수 호출
	}
}
