package claire.sample;

public interface SungJuckV6Impl {
	// int a = 1; // 상수로 선언 앞에 static이 생략되어 있음
	// 성적처리에 대한 기본 뼈대
	// 총점total, 평균average, 학점grade

	// JDK 8 부터 인터페이스에 static 추가 가능
	// 람다식을 추가하면서 설계 변경이 이유
	void Total(SungJuckV6V0 sj);

	void Average(SungJuckV6V0 sj);

	void Grade(SungJuckV6V0 sj);

	// 공유 목적으로 만드는 메서드
	static void sharedTotal(SungJuckV6V0 sj) {
	}

	static void sharedAverage(SungJuckV6V0 sj) {
	}

	static void sharedGrade(SungJuckV6V0 sj) {
	}

}
