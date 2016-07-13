/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

// situa em qual package ou “pacote” está a classe package br.com.projeto.factory; 
// faz as importações de classes necessárias para o funcionamento do programa 
import java.sql.Connection; // conexão SQL para Java 
import java.sql.DriverManager; // driver de conexão SQL para Java 
import java.sql.SQLException; // classe para tratamento de exceções

/**
 *
 * @author sergio
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/cadastroclientes", "root", "403465");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
