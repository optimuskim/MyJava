package hanna.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_DML_SELECT {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.
		Class.forName("org.mariadb.jdbc.Driver");
		// 2.
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/hanna", "hanna", "987654");

		// 3. 실행할 SQL 질의문을 생성
		String sql = "select name, kor, eng, mat from sungjuk";
		Statement stmt = conn.createStatement();

		// 4. 생성한 SQL 객체를 실행하고
		// 실행한 SQL 질의문의 유형에 따라 결과값을 받음
		// select - executeQuery : ResultSet
		// insert, update, delete - excuteUpdate : int
		ResultSet rs = stmt.executeQuery(sql);

		// 5. ResultSet에 저장된 결과값들은
		// 커서를 통해 한 행씩 읽어와서(next()) getXxx()로 각각 처리
		// ResultSet : 질의문 실행 결과를 테이블 형태로 저장한 것
		// Cursor : 테이블 형태의 데이터를 순차적으로 접근하기 위해 현재위치를 가리키는 요소
		while (rs.next()) {
			String out = rs.getString(1) + "/" + rs.getInt("kor") + "/" + rs.getInt("eng") + "/" + rs.getInt("mat");
			System.out.println(out);
		}

		// 6.

		rs.close();
		stmt.close();
		conn.close();
	}

}
