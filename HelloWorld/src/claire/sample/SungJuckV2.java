package claire.sample;

import java.util.Scanner;

/*
 * Scanner 클래스를 이용해서
 * 이름, 국어, 영어, 수학을 입력받아
 * 총점, 평균, 학점 계산후 출력
 */

public class SungJuckV2 {
	public static void main(String[] args) {
		// 변수선언
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		char grd;
		// 성적 입력 받음
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		mat = sc.nextInt();
		sc.close();
		// 총점, 평균, 학점 계산
		tot = kor + eng + mat;
		avg = tot / 3.0; // 형변환
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;
		default:
			grd = '가';
			break;
		}
		// 결과출력
		System.out.println("\n이름\t국어\t영어\t수학\t평균\n");
		System.out.printf("%s\t %d\t %d\t %d\t %f\t", name, kor, eng, mat, avg);
	}

}
