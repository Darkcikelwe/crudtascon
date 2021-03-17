package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Dao {
/**Módulo de conexao**/
//parametros de conexão
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://27.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	
	private String user = "root";
	private String password = "94047868";
	
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	//teste de conexao
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}
	public ArrayList<JavaBeans> listarContatos(){
	String read = "select * from contatos order by nome";
	try {
	    Connection con = conectar();
		PreparedStatement pst = con.prepareStatemente(read);
	} catch (Exception e) {
		System.out.println(e);
		return null;
	}
	
	}		
}
