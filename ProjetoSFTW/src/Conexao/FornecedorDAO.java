/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import Controle.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author epic4
 */
public class FornecedorDAO {
    
    Connection con;//executa conexão
    PreparedStatement pstm;//prepara conexão
    ResultSet rs;//resulta dados mysql
    ArrayList<Fornecedor> lista = new ArrayList<>();//array para armazenar dados db
    
    public void cadastroFornecedor(Fornecedor objfornecedordto){//metodo publico sem retorno
        con = new Conectar().Conectar();//variavel para chamar o metodo e a classe e conexao com o banco
        
        try {//tente..
           String sql = "insert into fornecedor ( descr, cnpj, tel, cep) values (?,?,?,?)";//comando sql
           
           pstm = con.prepareStatement(sql);//prepare a conexao acessando a classe voce passa o caminho correspondente 
           pstm.setString(1, objfornecedordto.getDescrForn());
           pstm.setInt(2, objfornecedordto.getCnpj());
           pstm.setInt(3, objfornecedordto.getTel());
           pstm.setInt(4, objfornecedordto.getCep());
        
           pstm.execute();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
        } catch (SQLException erro) {//se nao der certo..
            JOptionPane.showMessageDialog(null,"ERRO em cadastrar Fornecedor" +erro);
        }
        
    }
    
    public ArrayList<Fornecedor> pesquisarFornecedor () {//retorno de dados para tabela do app
         con = new Conectar().Conectar();
         
        try {
           String sql = "select * from fornecedor";//selecionar todos os dados do db
           
           pstm = con.prepareStatement(sql); 
           rs = pstm.executeQuery();
           
           while(rs.next()){//lista de dados para comboBox
               Fornecedor objfornecedor = new Fornecedor ();//acessa o obj para setar um valor do db
               objfornecedor.setDescrForn(rs.getString("descr"));//linhas de dados da lista
               objfornecedor.setCnpj(rs.getInt("cnpj"));
               objfornecedor.setTel(rs.getInt("tel"));
               objfornecedor.setCep(rs.getInt("cep"));
               objfornecedor.setCodig(rs.getInt("codig"));
               
               lista.add(objfornecedor);//monta lista
               
           }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em retornar produtos DAO" +erro);
        }
        return lista;//retorna
    }

     public void AlterarFornecedor(Fornecedor objfornecedordto){//metodo publico sem retorno
        con = new Conectar().Conectar();//variavel para chamar o metodo e a classe e conexao com o banco
        
        try {//tente..
           String sql = "UPDATE fornecedor SET descr = ?, cnpj = ?, tel = ?, cep = ? WHERE codig = ?";//comando sql
           
           pstm = con.prepareStatement(sql);//prepare a conexao acessando a classe voce passa o caminho correspondente 
           pstm.setString(1, objfornecedordto.getDescrForn());
           pstm.setInt(2, objfornecedordto.getCnpj());
           pstm.setInt(3, objfornecedordto.getTel());
           pstm.setInt(4, objfornecedordto.getCep());
           pstm.setInt(5, objfornecedordto.getCodig());
        
           pstm.executeUpdate();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
        } catch (SQLException erro) {//se nao der certo..
            JOptionPane.showMessageDialog(null,"ERRO em Alterar Produtos" +erro);
        }
     }  
     
     public void ExcluirProduto(Fornecedor objfornecedordto){
        con = new Conectar().Conectar();//variavel para chamar o metodo e a classe e conexao com o banco
        
        try {//tente..
           String sql = "DELETE FROM fornecedor WHERE codig = ?";//comando sql
           
           pstm = con.prepareStatement(sql);//prepare a conexao acessando a classe voce passa o caminho correspondente 
           pstm.setInt(1, objfornecedordto.getCodig());
        
           pstm.executeUpdate();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
        } catch (SQLException erro) {//se nao der certo..
            JOptionPane.showMessageDialog(null,"ERRO em Excluir Produtos" +erro);
        }
     }
     
     
}
