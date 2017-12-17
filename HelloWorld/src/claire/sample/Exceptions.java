package claire.sample;

public class Exceptions {

	public static void main(String[] args) {
		int[] array = new int[3];

		try {
			System.out.println(array[5]); // 런타임 오류를 유발하는 코드
			// 예외가 발생할 가능성이 있는 코드에 예외처리 코드 블록 try-catch 을 작성
			// 비정상 프로그램 종료를 방지
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
			System.out.println(ex.getCause());
			// System.out.println("예외발생!-관리자가 조치예정!");
		}

		try {
			int result = 100 / 0;
		} catch (Exception ex) {
			// ex.printStackTrace();
			// System.out.println("예외가 발생하여 조치하였습니다");
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
			System.out.println(ex.getCause());
		}

		System.out.println("이 코드가 보이나요!");
	}

}
