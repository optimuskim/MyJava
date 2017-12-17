package claire.sample;

public class SungJuckV4 {

	String name;
	int kor;
	int eng;
	int mat;

	private int tot;
	private double avg;
	private char grd;

	public SungJuckV4() { // ctrl + space 이용하여 생성자 만들기
		// this 안 쓸 경우
		// name = "혜교";
		// kor = 99;
		// eng = 98;
		// mat = 99;
		this("혜교", 99, 98, 99); // 생성자와 관련된 코드를 쓸 때는 맨 위에 써야함
	}

	public SungJuckV4(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

}
