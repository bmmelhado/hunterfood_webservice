package br.com.tcc.connection;

import java.sql.*;

/**
 * Classe responsavel por fazer a conexão com o banco de dados
 * @author BrunoMeira
 *
 */
public class Conexao {
	
	//private static final String DATABASE_URL = "jdbc:mysql://localhost:8080/mydb?";
    //private static final String USERNAME = "user=admin&";
    //private static final String PASSWORD = "password=admin";

    public Connection getConnection() {
     Connection con = null;
     try {
    	 Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/mydb?user=admin&password=admin");
     } catch (Exception e) {
         System.out.println("Erro ao criar conexao.");
         e.printStackTrace();
     }
     return con;
    }

    public void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
     try {
         close(conn, stmt, rs);
     } catch (Exception e) {
         System.out.println("Erro ao fechar conexao.");
         e.printStackTrace();
     }
    }

    public void closeConnection(Connection conn, Statement stmt) {
     try {
         close(conn, stmt, null);
     } catch (Exception e) {
         System.out.println("Erro ao fechar conexao.");
         e.printStackTrace();
     }
    }

    public void closeConnection(Connection conn) {
     try {
         close(conn, null, null);
     } catch (Exception e) {
         System.out.println("Erro ao fechar conexao.");
         e.printStackTrace();
     }
    }

    private void close(Connection conn, Statement stmt, ResultSet rs) {

     try {
         if (rs != null) {
             rs.close();
         }
         if (stmt != null) {
             stmt.close();
         }
         if (conn != null) {
             conn.close();
         }
     } catch (Exception e) {
         System.out.println("Erro ao fechar conexao.");
         e.printStackTrace();
     }
    }
}
 