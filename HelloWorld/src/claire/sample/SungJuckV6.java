package claire.sample;

public class SungJuckV6 {

	public static void main(String[] args) {
		// SungJuckV6V0 sj = new SungJuckV6V0();

		// 성적 데이터를 저장하기 위해 객체 생성

		SungJuckV6DT0 sj = new SungJuckV6DT0();
		sj.setName("혜교");
		sj.setKor(99);
		sj.setEng(98);
		sj.setMat(98);

		// sj = new SungJuckV6DT0("", 99, 98, 98);

		// 성적 처리 객체 생성
		// 인터페이스를 구현한 클래스의 메서드는
		// 주로 어떤 일을 처리하는 기능을 담당하고 있는 경우가 대부분이므로
		// 객체생성 없이 사용가능하도록 static으로 정의하는 것이 좋음
		// 모든 DT0 객체가 다같이 사용한다는 의미

		// 단, 단점도 존재하는데 프로그램 실행 전 static 관련 메서드를 먼저 JVM 상에 적재하는 과정이 필요
		// 그에 따른 성능 저하가 발생할 수 있음

		// static에 대한 다른 대안은 싱글톤 패턴을 쓰는 것

		SungJuckV6Service sjsrv = new SungJuckV6Service();
		sjsrv.Total(sj);
		sjsrv.Average(sj);
		sjsrv.Grade(sj);

		// 인터페이스에 선언된 static 메서드 호출
		SungJuckV6Impl.sharedTotal(sj); // new 연산자를 사용하지 않고 메서드 바로 호출 가능 (객체 생성 X)
										// 단점 : 프로그램이 동작하는 실행시간이 느려질 수 있음
		SungJuckV6Impl.sharedAverage(sj);

		SungJuckV6Impl.sharedGrade(sj);

		// 결과출력
		System.out.println(sj.getName());
		System.out.println(sj.getKor());
		System.out.println(sj.getEng());
		System.out.println(sj.getMat());
		System.out.println(sj.getTot());
		System.out.println(sj.getAvg());
		System.out.println(sj.getGrd());
	}

}
