/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author epic4
 */
public class Conectar {//classe de Conexão

    static Connection getConnection() {
        throw new UnsupportedOperationException("Conexão aberta."); //To change body of generated methods, choose Tools | Templates.
    }

    static void closeConnection(Connection con, PreparedStatement pstm, ResultSet rs) {
        throw new UnsupportedOperationException("Conexão fechada."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public Connection Conectar() {//Metodo de Conexão
        Connection con = null;//variavel de conexão

        try {
            String url = "jdbc:mysql://127.0.0.1:3306/projeto?user=root";
            String user = "root";
            String password = "root";
            con = DriverManager.getConnection(url, user, password);//quando acessar essa variavel de coneção 
            //com os dados de ligação com o banco a conexão sera estabelecida.
                    
        } catch (SQLException erro) {//Caso não conecte ao DB exibira uma mensagem de erro..
            JOptionPane.showMessageDialog(null,"ERRO de Conexão" +erro.getMessage());
        }
        return con;
    }
      public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
