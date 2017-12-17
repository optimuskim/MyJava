package claire.sample;

public class SungJuckV3 {

	public static void main(String[] args) {
		students st1 = new students();
		students st2 = new students();
		students st3 = new students();

		st1.name = "혜교";
		st1.kor = 99;
		st1.eng = 98;
		st1.mat = 99;

		st1.total();
		st1.average();
		st1.grade();

		System.out.printf("%s %d %d %d %d %.1f %s", st1.name, st1.kor, st1.eng, st1.mat, st1.tot, st1.avg, st1.grd);
	}

}

class students { // 이름, 국어, 영어, 수학, 총점, 평균, 학점
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	char grd;

	// 메서드 정의
	public void total() { // 총점
		tot = kor + eng + mat;
	}

	public void average() { // 평균
		avg = tot / 3;
	}

	public void grade() {
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
	}
}