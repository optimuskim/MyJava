package claire.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		// 배열의 단점
		// 같은 종류의 데이터만 다름, 크기 조정 X

		String[] userid = new String[3]; // userid 3명의 배열 생성
		userid[0] = "hanna"; // 문자만 삽입 가능
		// userid[1] = 123456; // 숫자 안됨
		// userid[2] = 987654.321; // 소수 안됨
		// userid[3] = "abc123"; // 데이터를 임의로 삽입할 수 없음

		// List 인터페이스의 ArrayList
		// 배열과 달리 크기를 지정하지 않아도 되고
		// 어떠한 종류의 데이터도 add 가능
		ArrayList list = new ArrayList();
		list.add("안녕");
		list.add(123456);
		list.add(98.654);
		list.add(new SungJuckV6DT0());

		// 문제는 꺼내올 때 발생
		// add시 모든 데이터는 Object 형으로 저장
		// 따라서, 꺼낼때 각 데이터 유형에 맞게 암시적으로 형변환이 발생
		System.out.println((String) list.get(0));
		System.out.println((int) list.get(1));
		System.out.println((double) list.get(2));
		System.out.println((SungJuckV6DT0) list.get(3));

		// 지네릭스
		// 컬렉션 객체에 저장할 객체의 종류를 미리 지정
		// 따라서, 불필요한 형변환을 막음 - 성능저하 발생
		// 즉, 한 종류의 객체만을 저장한다는 지침을 지키자!
		// 저장할 객체의 종류는 <> 기호를 사용

		List<String> list2 = new ArrayList<String>(); // String만 넣을 수 있음. 다른 타입으로 선언하면 오류 발생
		list2.add("hanna");
		// list2.add(123456);
		// list2.add(987.654);
		// list2.add(new SungJuckV6DT0());
		// list2는 String만 저장 가능한 객체로 선언

		// 지네릭 예제 - JDK5 이전
		List zoo1 = new ArrayList(); // 동물원 만듦

		Rabbit r1 = new Rabbit(); // 동물 객체 생성
		DesertFox f1 = new DesertFox();
		Zebra z1 = new Zebra();

		zoo1.add(r1);
		zoo1.add(f1);
		zoo1.add(z1);

		// 암시적 형변환
		System.out.println(zoo1.get(0)); // 동물 출력
		System.out.println(zoo1.get(1));
		System.out.println(zoo1.get(2));

		// r1 = zoo1.get(0); // Object -> Rabbit 필요
		// 불필요한 명시적 형변환이 필요!
		r1 = (Rabbit) zoo1.get(0);
		f1 = (DesertFox) zoo1.get(1);
		z1 = (Zebra) zoo1.get(2);

		// JDK5 이상 - 지네릭스 사용
		List<Rabbit> zoo2 = new ArrayList<>(); // 토끼만 가두는 동물원을 만듦
		List<DesertFox> zoo3 = new ArrayList<>();
		List<Zebra> zoo4 = new ArrayList<>();

		zoo2.add(r1);
		r1 = zoo2.get(0); // 형변환이 필요없음!

		zoo4.add(z1);
		z1 = zoo4.get(0);

		// List CRUD 예제
		List<String> namelist = new ArrayList<>(); // 학생 이름을 저장하는 list 생성

		// 데이터 추가 : add()
		namelist.add("수지");
		namelist.add("혜교");
		namelist.add("지현");

		// 데이터 수량 : size
		System.out.println(namelist.size());

		// 데이터 조회 : get(위치값)
		System.out.println(namelist.get(0));
		System.out.println(namelist.get(1));
		System.out.println(namelist.get(2));

		// 데이터 전체 출력 (for문 사용)
		for (int i = 0; i <= 2; i++) {
			System.out.println(namelist.get(i));
		}

		for (String val : namelist) { // 컬렉션을 다룰 때는 향상된 for문 추천!
			System.out.println(val);
		}

		// 데이터 전체조회 : Iterator
		// Iterator : 반복처리자
		// 컬렉션에 저장된 데이터에 접근해서 반복적으로 무언가를 처리하기 위한 것
		Iterator<String> ir = namelist.iterator(); // namelist를 Iterator화 시킴
													// Iterator = ctrl + space : util
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}

		// 수정 : set(위치, 값)
		System.out.println(namelist.get(0));
		namelist.set(0, "중기"); // set을 이용하여 값을 변경함
		System.out.println(namelist.get(0));

		// 찾기 : contains()
		String key = "혜교";
		if (namelist.get(0).contains(key)) {
			System.out.println("데이터 찾음!");
		}

		for (int a = 0; a <= 2; a++) {
			if (namelist.get(a).contains(key))
				System.out.println("데이터를 " + a + " 번째에서 찾음!");
		}

		// 삭제 : remove(위치), clear
		System.out.println(namelist.get(0));
		namelist.remove(0); // 하나씩 삭제
		System.out.println(namelist.get(0)); // 순서가 하나 밀려서 올라감

		// namelist.clear(); // 전체 삭제
		// System.out.println(namelist.get(0));
	}

}

class Rabbit {
} // 동물 클래스 생성

class DesertFox {
}

class Zebra {
}
