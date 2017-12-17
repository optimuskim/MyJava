package hanna.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloMariaDB {

	// MariaDB 접속 테스트
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// JDBC 드라이버에 대한 객체 생성
		// Driver mariadb = new Driver();

		// 생성된 객체를 드라이버 관리자에 등록
		// DriverManager.registerDriver(mariadb);

		// 1. 지정한 클래스를 메모리에 적재
		Class.forName("org.mariadb.jdbc.Driver");

		// 2. 드라이버 관리자에 등록된 드라이버를 이용해서
		// 마리아디비에 접속해본다
		Connection conn = DriverManager.getConnection("jdbc:mariadb://192.168.100.105:3306/hanna", "hanna", "987654");

		// 접속완료시 간단한 메세지 출력
		if (!conn.isClosed()) {
			System.out.println("접속완료!");
		}

		// 3. mariadb 접속을 해제하고 연결을 끊음
		conn.close();
	}

}
