package br.com.tcc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.tcc.connection.Conexao;
import br.com.tcc.model.Prato;

/**
 * @author BrunoMeira 30/03/2013
 * 
 */
public class PratoDAO extends Conexao {

	/**
	 * Metodo responsavel por inserir um prato no banco de dados
	 * 
	 * @param prato
	 * @return
	 */
	public int inserir(Prato prato) {

		Connection conn = null;
		conn = getConnection();
		int sucesso = 0;

		PreparedStatement stmt = null;
		try {
			stmt = conn
					.prepareStatement("INSERT INTO "
							+ "PRATO (DESCRIÇÃO, PREÇO, NOME, IDRESTAURANTE) VALUES(?,?,?,?)");

			stmt.setString(1, prato.getDescricao());
			stmt.setDouble(2, prato.getPreco());
			stmt.setString(3, prato.getNome());
			stmt.setInt(4, prato.getIdRestaurante());
			sucesso = stmt.executeUpdate();

			if (sucesso > 0) {
				System.out.println("RESTAURANTE INSERIDO!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ERRO AO INSERIR RESTAURANTE!");
		} finally {
			closeConnection(conn, stmt);
		}
		return sucesso;
	}

	/**
	 * Metodo responsavel por alterar as informações de um prato
	 * @param prato
	 * @return
	 */
	public int alterar(Prato prato) {

		Connection conn = null;
		conn = getConnection();
		PreparedStatement stmt = null;
		int sucesso = 0;
		try {
			stmt = conn
					.prepareStatement("UPDATE PRATO SET DESCRIÇÃO = ?, SET PREÇO = ?, SET NOME = ?,"
							+ "SET IDRESTAURANTE = ? WHERE ID = ?");

			stmt.setString(1, prato.getDescricao());
			stmt.setDouble(2, prato.getPreco());
			stmt.setString(3, prato.getNome());
			stmt.setInt(4, prato.getIdRestaurante());
			sucesso = stmt.executeUpdate();

			if (sucesso > 0) {
				System.out.println("PRATO ALTERADO!");
			} else {
				System.out.println("PRATO NÃO EXISTE!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ERRO AO ALTERAR PRATO!");
		} finally {
			closeConnection(conn, stmt);
		}
		return sucesso;
	}

	/**
	 * Metodo responsavel por deletar um prato do banco de dados
	 * @param id
	 * @return
	 */
	public int deletar(int id) {

		Connection conn = null;
		conn = getConnection();
		int excluidos = 0;
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement("DELETE FROM PRATO WHERE IDPRATO = ?");
			stmt.setInt(1, id);
			excluidos = stmt.executeUpdate();

			if (excluidos > 0) {
				System.out.println("PRATO REMOVIDO!");
			} else {
				System.out.println("PRATO NÃO EXISTE!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ERRO AO DELETAR PRATO!");
		} finally {
			closeConnection(conn, stmt);
		}
		return excluidos;
	}

	/**
	 * Metodo responsavel por busca um prato no banco de dados
	 * @param id
	 * @return
	 */
	public Prato buscar(int id) {

		Connection conn = null;
		ResultSet resultSet = null;
		PreparedStatement stmt = null;
		conn = getConnection();
		Prato prato = null;
		try {
			stmt = conn
					.prepareStatement("SELECT * FROM PRATO WHERE IDPRATO = ?");
			stmt.setInt(1, id);
			resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				prato = new Prato();
				prato.setDescricao(resultSet.getString("descrição"));
				prato.setIdPrato(resultSet.getInt("idprato"));
				prato.setIdRestaurante(resultSet.getInt("idrestaurante"));
				prato.setNome(resultSet.getString("nome"));
				prato.setPreco(resultSet.getDouble("preço"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, stmt, resultSet);
		}
		return prato;
	}

	/**
	 * Metodo reponsavel por buscar todos os pratos do banco de dados
	 * @return
	 */
	public ArrayList<Prato> buscarTodos() {

		Connection conn = null;
		ResultSet resultSet = null;
		PreparedStatement stmt = null;
		conn = getConnection();
		ArrayList<Prato> listaPratos = null;

		try {

			stmt = conn.prepareStatement("SELECT * FROM prato");
			resultSet = stmt.executeQuery();
			listaPratos = new ArrayList<Prato>();
			Prato prato = null;

			while (resultSet.next()) {
				prato = new Prato();
				prato.setDescricao(resultSet.getString("descrição"));
				prato.setIdPrato(resultSet.getInt("idprato"));
				prato.setIdRestaurante(resultSet.getInt("idrestaurante"));
				prato.setNome(resultSet.getString("nome"));
				prato.setPreco(resultSet.getDouble("preço"));
				listaPratos.add(prato);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			listaPratos = null;
		} finally {
			closeConnection(conn, stmt, resultSet);
		}
		return listaPratos;
	}

	/**
	 * Metodo responsavel por buscar todos os pratos de um determinado restaurante no banco de dados
	 * @param id
	 * @return
	 */
	public ArrayList<Prato> buscarRestaurante(int id) {

		Connection conn = null;
		ResultSet resultSet = null;
		PreparedStatement stmt = null;
		conn = getConnection();
		ArrayList<Prato> restaurantePrato = null;

		try {

			stmt = conn
					.prepareStatement("SELECT * FROM prato Where idrestaurante = ?");
			stmt.setInt(1, id);
			resultSet = stmt.executeQuery();
			restaurantePrato = new ArrayList<Prato>();
			Prato prato = null;

			while (resultSet.next()) {

				prato = new Prato();
				prato.setDescricao(resultSet.getString("descrição"));
				prato.setIdPrato(resultSet.getInt("idprato"));
				prato.setIdRestaurante(resultSet.getInt("idrestaurante"));
				prato.setNome(resultSet.getString("nome"));
				prato.setPreco(resultSet.getDouble("preço"));
				restaurantePrato.add(prato);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			closeConnection(conn, stmt, resultSet);

		}

		return restaurantePrato;

	}

}
