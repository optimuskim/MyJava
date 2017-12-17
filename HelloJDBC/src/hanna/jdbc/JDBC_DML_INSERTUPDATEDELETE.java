package hanna.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_DML_INSERTUPDATEDELETE {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.
		Class.forName("org.mariadb.jdbc.Driver");
		// 2.
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/hanna", "hanna", "987654");

		// 3. 실행할 SQL 질의문을 생성
		String sql = "insert into sungjuk (name, kor, eng, mat)" + "values ('수지', 65, 87, 31)";
		Statement stmt = conn.createStatement();

		// 4. 생성한 SQL 객체를 실행하고 적용된 결과값을 받음
		int cnt = stmt.executeUpdate(sql);
		System.out.println(cnt + " 건의 데이터가 입력되었습니다");

		sql = " update sungjuk set tot = 150, avrg = 56.3 where name = '혜교' ";
		cnt = stmt.executeUpdate(sql);
		System.out.println(cnt);

		sql = " delete from sungjuk where name ='수지' ";
		cnt = stmt.executeUpdate(sql);

		// 5.

		stmt.close();
		conn.close();
	}

}
