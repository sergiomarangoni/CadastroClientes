/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory; //Utilizado no metodo UsuarioDAO para abrir a conexão
import modelo.usuario; //Utilizado no método adicionaUsuario
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sergio
 */
public class UsuarioDAO {

    //Solicita a conexão com o Banco de dados
    private Connection connection;

    /*Retorna os parametros que iremos preencher no banco de dados: Lembrando que o id foi
    /criado como um valor que será auto incrementado pelo BD
     */
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;

    public UsuarioDAO() {
        ///abre a conexão criada na factory! NOTA para que isso funcione corretamente é necessário importar a Conexão, veja no topo do arquivo.
        this.connection = new ConnectionFactory().getConnection();
        }
    
    public void adicionaUsuario(usuario usuario){
        
        String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";
        try {
            PreparedStatement entradabd = connection.prepareStatement(sql);
            entradabd.setString(1, usuario.getnome());
            entradabd.setString(2, usuario.getcpf());
            entradabd.setString(3, usuario.getemail());
            entradabd.setString(4, usuario.gettelefone());
            entradabd.execute();
            entradabd.close();
                    
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
}
