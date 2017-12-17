package claire.sample;

public class Starcraft {

	public static void main(String[] args) {

	}

}

// class Marine { // 보병
// int x, y; // 현재 위치
// void move(int x, int y) { x, y 만큼 이동 }
// void stop ( ) { }
// void stimPack ( ) { } // 순간적으로 공격력 증강
// void attack ( ) { }
// }
//
// class Tank {
// int x, y; // 현재 위치
// void move(int x, int y) { x*2, y*2 만큼 이동 }
// void stop ( ) { }
// void attack ( ) { }
// void changeMode ( ) { } // 공격범위 변경
// }
//
// class Dropship {
// int x, y; // 현재 위치
// void move(int x, int y) { x*10, y*10 만큼 이동 }
// void stop ( ) { }
// void load ( ) { } // 대상을 태움
// void unload () { } // 대상을 내림
// }

// 추상클래스 생성
abstract class Unit {

	abstract void move(int x, int y);

	void stop() {
	};
}

// Marine 의 클래스를 상속받아서 생성함
class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("머린은 10만큼 이동했다!");
	}

	public static void stimpack() {
		System.out.println("머린은 5초동안 3배 공격력을 갖는다");
	}

}

class Tank extends Unit {
	@Override
	void move(int x, int y) {
		System.out.println("시즈탱크는 5m 이동했다!");
	}

	public void changeMode() {
		System.out.println("공격범위 10m, 10배 공격력을 갖는다");
	}
}

class Dropship extends Unit {
	@Override
	void move(int x, int y) {
		System.out.println("수송선은 10m 이동했다");
	}

	public void load() {
		System.out.println("승객을 태웠다");
	}

	public void unload() {
		System.out.println("승객을 내렸다");
	}
}
