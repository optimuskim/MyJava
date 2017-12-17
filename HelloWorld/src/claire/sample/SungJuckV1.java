package claire.sample;

/*
 * 성적처리프로그램 v1
 * 이름, 국어, 영어, 수학 점수에 대한
 * 총점, 평균을 계산하고 출력
 */
public class SungJuckV1 {

	public static void main(String[] args) {

		// 변수선언
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;

		// 성적처리
		// 변수 값 대입

		name = "한나";
		kor = 99;
		eng = 99;
		mat = 98;

		// 총점, 평균 계산

		tot = kor + eng + mat;
		avg = tot / 3d;

		System.out.println(name + " 님의 총점은 " + tot + " 입니다");
		System.out.println(name + " 님의 평균은 " + avg + " 입니다");

	}

}
