package claire.sample;

import java.util.Random;

public class Array {

	public static void main(String[] args) {
		// 학생 1명
		// name, kor, eng, mat

		// 학생 3명
		// name1, kor1, eng1, mat1
		// name2, kor2, eng2, mat2
		// name3, kor3, eng3, mat3

		// 배열선언
		String[] name;
		int[] kor;
		int[] eng;
		int[] mat;

		// String name;
		// name = "혜교";
		// name = new String();
		// name = "혜교";
		// int kor;
		// kor = 99;

		// name = "혜교"; // 오류! - 데이터가 저장될 공간이 확보 되지 않음.
		// 배열은 참조형이며 객체이므로
		// 변수 선언시 new 연산자 메모리 영역을 생성해야 함
		name = new String[3]; // 3명의 이름을 저장할 공간
		kor = new int[3];
		eng = new int[3];
		mat = new int[3];

		// 배열의 크기는 상수(final)로 정의 가능
		final int SJSIZE = 3; // 구분하기 쉽게 대문자로 쓰기 // 상수선언
		int[] tot = new int[SJSIZE];
		double[] avg = new double[SJSIZE];
		char[] grd = new char[SJSIZE];

		// 배열에 데이터 저장
		// 배열의 위치값(index)는 0부터 시작
		name[0] = "토르"; // 첫번째 name요소
		name[1] = "헐크"; // 두번째 name요소
		name[2] = "로키"; // 세번째 name요소

		kor[0] = 85;
		kor[1] = 25;
		kor[2] = 74;

		eng[0] = 25;
		eng[1] = 49;
		eng[2] = 98;

		mat[0] = 12;
		mat[1] = 66;
		mat[2] = 89;

		// 배열의 크기 알아보기 : length
		System.out.println(name.length);
		System.out.println(kor.length);
		System.out.println(eng.length);
		System.out.println(mat.length);

		// int[] age = null;
		// int age_size = age.length;
		// new 연산자를 사용하지 않는 상태에서는
		// 배열의 크기 length는 알 수 없음

		// 배열 내 데이터 출력
		System.out.println("학생 #1 : " + name[0]);
		System.out.println("학생 #2 : " + name[1]);
		System.out.println("학생 #3 : " + name[2]);

		// 반복문으로 배열 출력
		int i;
		for (i = 0; i <= 2; i++) {
			System.out.println("학생 #" + i + " : " + name[i]);
			// System.out.printf("학생 #%d %d \n", i, name[i]);
		}

		for (i = 0; i < kor.length; i++) {
			System.out.println("국어 #" + i + " : " + kor[i]);
			// System.out.printf("국어 #%d %d \n", i, kor[i]);
		}

		/*
		 * for (i = 0; i < mat.length - 1; i++) { System.out.println("수학 #" + i + " : "
		 * + mat[i]); // System.out.printf("수학 #%d %d \n", i, mat[i]); }
		 */

		for (i = 0; i < SJSIZE - 1; i++) {
			System.out.println("수학 #" + i + " : " + mat[i]);
			// System.out.printf("수학 #%d %d \n", i, mat[i]);
		}

		// 배열 초기화
		// 배열 생성시 자동적으로 선언 할 때의 타입과 동일하게
		// 기본값이 초기화 된다
		// int, double - 0
		// boolean - false
		// String -
		// 클래스 -

		int[] intArray = new int[3];
		boolean[] boolAray = new boolean[2];
		String[] strArray = new String[2];
		Person[] person = new Person[100];

		System.out.println("정수배열 기본값 : " + intArray[0]);
		System.out.println("논리배열 기본값 : " + boolAray[0]);
		System.out.println("문자배열 기본값 : " + strArray[0]);
		System.out.println("객체배열 : " + person[0]);

		// 명시적 배열 초기화
		String[] userid;
		userid = new String[] { "abc123", "xyz987", "java" };

		String[] passwd = { "123456", "987654", "qweasd" };

		// 배열의 index가 실제 배열크기보다 크면?
		// 오류발생! - ArrayIndexOutOfBoundsException
		// System.out.println(passwd[5]);

		// 배열의 단점
		// 배열의 크기가 한 번 결정되면 나중에 크기 변경 불가
		// 만일 변경하고 싶다면, 배열을 복사해서 처리
		int originalLength = 100;
		int newLength = 150;

		int[] Ids = new int[originalLength];
		int[] newIds = new int[newLength];

		int elementsToCopy = originalLength > newLength ? newLength : originalLength;
		for (i = 0; i < elementsToCopy; i++) {
			newIds[i] = Ids[i];
		}

		Ids = newIds;

		// 로또생성기 - 배열 X
		// 1 ~ 45 사이 6개의 임의의 숫자 추출
		// 중복 불가
		int key1, key2, key3, key4, key5, key6;
		System.out.println(Math.random());

		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(45)); // 0 - 44
		System.out.println(r.nextInt(45) + 1); // 0 - 45

		key1 = r.nextInt(45) + 1;
		key2 = r.nextInt(45) + 1;
		key3 = r.nextInt(45) + 1;
		key4 = r.nextInt(45) + 1;
		key5 = r.nextInt(45) + 1;
		key6 = r.nextInt(45) + 1;

		System.out.printf("%d %d %d %d %d %d \n", key1, key2, key3, key4, key5, key6);

		// 로또생성기 - 배열 O

	}
}

class Person {
}
