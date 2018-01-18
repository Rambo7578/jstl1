package conf;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;

public class Exam {

	// static {
	// System.out.println("내가 스테이틱 영역이다");
	//
	// } 먼저 나온다
	public void init() {
		InputStream in = this.getClass().getResourceAsStream("/conf/dbconf.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
			Iterator<Object> it = prop.keySet().iterator();
			Class.forName(prop.getProperty("driver"));
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String pwd = prop.getProperty("pwd");

			Connection con = DriverManager.getConnection(url, id, pwd);
			String sql = "select*from customer";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getString("customerName"));
			}
		} catch (IOException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// public static void main(String[]args) {
	// System.out.println("난 메인 영역이다 프로그램의 시작점");
	// Exam e= new Exam();
	// e.init();
	// }

}
