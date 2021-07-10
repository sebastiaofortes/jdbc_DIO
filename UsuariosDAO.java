package com.sebastiaofortes.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosDAO {

	

	
public void listar () throws SQLException {
	
	ConnectionFactory nova = new ConnectionFactory();
	Connection conexao = nova.iniciar();    
	
	
	//Preparar statement com os parâmetros recebidos (nesta função não tem parâmetros, pois irá retornar todos os valores da tabela aluno)
	PreparedStatement stmt = conexao.prepareStatement("select * from usuarios");
	

	  //Executa consulta e armazena o retorno da consulta no objeto "rs".
    ResultSet rs = stmt.executeQuery();
	
	while(rs.next()){ //o método next() retorna true caso haja mais linhas

	    System.out.print(rs.getString("matricula")+"\t");

	    System.out.print(rs.getString("nome")+"\t");

	    System.out.println(rs.getString("email"));

	 }
	
}	

public void buscar (String matricula) throws SQLException {
	
	ConnectionFactory nova = new ConnectionFactory();
	Connection conexao = nova.iniciar();    
	
	
	//Preparar statement com os parâmetros recebidos (nesta função não tem parâmetros, pois irá retornar todos os valores da tabela aluno)
	PreparedStatement stmt = conexao.prepareStatement("select * from usuarios WHERE matricula = ?");
	stmt.setString(1, matricula);

	  //Executa consulta e armazena o retorno da consulta no objeto "rs".
    ResultSet rs = stmt.executeQuery();
	
	while(rs.next()){ //o método next() retorna true caso haja mais linhas

	    System.out.print(rs.getString("matricula")+"\t");

	    System.out.print(rs.getString("nome")+"\t");

	    System.out.println(rs.getString("email"));

	 }
	
}	
	

public void inserir (String matricula) throws SQLException {
	
	ConnectionFactory nova = new ConnectionFactory();
	Connection conexao = nova.iniciar();    
	
	
	//Preparar statement com os parâmetros recebidos (nesta função não tem parâmetros, pois irá retornar todos os valores da tabela aluno)
	PreparedStatement stmt = conexao.prepareStatement("INSERT INTO usuarios(matricula, nome, email, interesses, senha, curso, entrada, semestre, id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
	stmt.setString(1, matricula);
	stmt.setString(2, matricula);
	stmt.setString(3, matricula);
	stmt.setString(4, matricula);
	stmt.setString(5, matricula);
	stmt.setString(6, matricula);
	stmt.setString(7, matricula);
	stmt.setString(8, matricula);
	stmt.setInt(9, 1);

	  //Executa consulta e armazena o retorno da consulta no objeto "rs".
    int rs = stmt.executeUpdate();
	


	    System.out.print(rs+" linhas inseridas");



	 
	
}	

public void deletar (String matricula) throws SQLException {
	
	ConnectionFactory nova = new ConnectionFactory();
	Connection conexao = nova.iniciar();    
	
	
	//Preparar statement com os parâmetros recebidos (nesta função não tem parâmetros, pois irá retornar todos os valores da tabela aluno)
	PreparedStatement stmt = conexao.prepareStatement("delete from usuarios WHERE matricula = ?");
	stmt.setString(1, matricula);

	  //Executa consulta e armazena o retorno da consulta no objeto "rs".
    int rs = stmt.executeUpdate();
	


	    System.out.print(rs+" linhas deletadas");

	  

	 
	
}	

}
