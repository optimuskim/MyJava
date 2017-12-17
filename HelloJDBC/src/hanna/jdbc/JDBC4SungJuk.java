package hanna.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC4SungJuk {

	// 데이터베이스 접속 정보 - 오라클 디비용
	private final static String DRV = "oracle.jdbc.driver.OracleDriver";
	private final static String USER = "hanna";
	private final static String PWD = "hanna";
	private final static String URL = "jdbc:oracle:thin:@localhost:1521:XE";

	public static void main(String[] args) {
		// JDBC 관련 변수 선언
		Connection conn = null; // 접속
		PreparedStatement pstmt = null; // 질의
		ResultSet rs = null; // 결과

		try {
			// 1. JDBC 드라이버를 메모리에 적재
			Class.forName(DRV);
			// 2. DBMS 에 접속하고 Connection 객체 생성
			conn = DriverManager.getConnection(URL, USER, PWD);
			// 3a. 실행할 SQL 문을 작성하고
			// prepareStatement 객체 생성
			String sql = "insert into sungjuk (name, kor, eng, mat) " + "values ('혜교', 45, 65, 78)";
			pstmt = conn.prepareStatement(sql);

			// 4a. 작성된 SQL 문 실행
			pstmt.executeUpdate();

			// 3b. 실행할 SQL 문을 다시 작성
			sql = "update sungjuk" + " set tot = 150, avrg = 57.1, grd = '미' " + "where name = '혜교'";
			pstmt = conn.prepareStatement(sql);

			// 4b. 작성된 SQL 문 실행
			pstmt.executeUpdate();

			// 3c. 실행할 SQL 문을 또 작성
			sql = "select * from sungjuk order by name";
			pstmt = conn.prepareStatement(sql);

			// 4c. 작성된 SQL 문 실행
			rs = pstmt.executeQuery();

			// 5. 결과집합 처리하기
			StringBuilder sb = new StringBuilder();
			while (rs.next()) {
				sb.append(rs.getString(1)).append(", ").append(rs.getString(2)).append(", ").append(rs.getString(3))
						.append(", ").append(rs.getString(4)).append(", ").append(rs.getString(5)).append(", ")
						.append(rs.getString(6)).append(", ").append(rs.getString(7)).append("\n");
			}

			// 6. 결과 출력
			System.out.println(sb.toString());

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			// 7. JDBC 관련 객체 닫기
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
				}
			}
		}
	}

}
