package com.sebastiaofortes.db;

import java.sql.SQLException;

public class App 
{
	 public static void main( String[] args ) throws SQLException 
	    {

	UsuariosDAO dao = new UsuariosDAO();
	
	dao.buscar("(38)998988978");
	dao.inserir("teste");
	dao.listar();
	dao.deletar("teste");
		
		DAOavancada ava = new DAOavancada();
	List <Usuarios> resultados = ava.listar();
	System.out.println(resultados.get(0).email);	 
	    }
}
