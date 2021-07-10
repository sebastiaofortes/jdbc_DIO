package com.sebastiaofortes.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection iniciar () throws SQLException {
		
	    System.out.println("Iniciando...");
	    
	    try {

	    	// Carregando o JDBC Driver padrão

	    	String driverName = "com.mysql.cj.jdbc.Driver";

	    	Class.forName(driverName);
	    	
	    	System.out.println("O driver foi encontrado.");
	    	
	    } catch (ClassNotFoundException e) {  //Driver não encontrado



	        System.out.println("O driver expecificado nao foi encontrado.");

	        

	    }
		
	     // Configurando a nossa conexão com um banco de dados//

	    String serverName = "92.249.44.207";    //caminho do servidor do BD

	    String mydatabase = "u376535470_poupar";        //nome do seu banco de dados

	    String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

	    String username = "u376535470_poupar";        //nome de um usuário de seu BD

	    String password = "Fortes1995";      //sua senha de acesso

	    Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
		
	}

}
