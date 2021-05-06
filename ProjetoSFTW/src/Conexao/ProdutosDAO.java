package Conexao;

import Controle.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutosDAO {
    
    Connection con;//executa conexão
    PreparedStatement pstm;//prepara conexão
    ResultSet rs;//resulta dados mysql
    ArrayList<Produtos> lista = new ArrayList<>();//array para armazenar dados db
    
    
    public void cadastroProduto(Produtos objprodutodto){//metodo publico sem retorno
        con = new Conectar().Conectar();//variavel para chamar o metodo e a classe e conexao com o banco
        
        try {//tente..
           String sql = "insert into produto ( descr, quant, preco, fornecedor) values (?,?,?,?)";//comando sql
           
           pstm = con.prepareStatement(sql);//prepare a conexao acessando a classe voce passa o caminho correspondente 
           pstm.setString(1, objprodutodto.getDesc());
           pstm.setInt(2, objprodutodto.getQuant());
           pstm.setDouble(3, objprodutodto.getPreco());
           pstm.setInt(4,objprodutodto.getFornecedor());
        
           pstm.execute();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
        } catch (SQLException erro) {//se nao der certo..
            JOptionPane.showMessageDialog(null,"ERRO em cadastrar Produtos" +erro);
        }
        
    }
    
    public ArrayList<Produtos> pesquisarProduto () {//retorno de dados para tabela do app
         con = new Conectar().Conectar();
         
        try {
           String sql = "select * from produto";//selecionar todos os dados do db
           
           pstm = con.prepareStatement(sql); 
           rs = pstm.executeQuery();
           
           while(rs.next()){
               Produtos objProdutos = new Produtos();//acessa o obj para setar um valor do db
               objProdutos.setDesc(rs.getString("descr"));//linhas de dados da lista
               objProdutos.setQuant(rs.getInt("quant"));
               objProdutos.setPreco(rs.getDouble("preco"));
               objProdutos.setFornecedor(rs.getInt("fornecedor"));
               objProdutos.setCodig(rs.getInt("codig"));
               
               lista.add(objProdutos);//monta lista
               
           }
           
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em retornar produtos DAO" +erro);
        }
        return lista;//retorna
    }

     public void AlterarProduto(Produtos objprodutodto){//metodo publico sem retorno
        con = new Conectar().Conectar();//variavel para chamar o metodo e a classe e conexao com o banco
        
        try {//tente..
           String sql = "UPDATE produto SET descr = ?, quant = ?, preco = ?, fornecedor = ? WHERE codig = ?";//comando sql
           
           pstm = con.prepareStatement(sql);//prepare a conexao acessando a classe voce passa o caminho correspondente 
           pstm.setString(1, objprodutodto.getDesc());
           pstm.setInt(2, objprodutodto.getQuant());
           pstm.setDouble(3, objprodutodto.getPreco());
           pstm.setInt(4, objprodutodto.getFornecedor());
           pstm.setInt(5, objprodutodto.getCodig());
        
           pstm.executeUpdate();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
        } catch (SQLException erro) {//se nao der certo..
            JOptionPane.showMessageDialog(null,"ERRO em Alterar Produtos" +erro);
        }
     }  
     
     public void ExcluirProduto(Produtos objprodutodto){
        con = new Conectar().Conectar();//variavel para chamar o metodo e a classe e conexao com o banco
        
        try {//tente..
           String sql = "DELETE FROM produto WHERE codig = ?";//comando sql
           
           pstm = con.prepareStatement(sql);//prepare a conexao acessando a classe voce passa o caminho correspondente 
           pstm.setInt(1, objprodutodto.getCodig());
        
           pstm.executeUpdate();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
        } catch (SQLException erro) {//se nao der certo..
            JOptionPane.showMessageDialog(null,"ERRO em Excluir Produtos" +erro);
        }
     }
     
      public ResultSet listarFornecedor(){
        con = new Conectar().Conectar();//variavel para chamar o metodo e a classe e conexao com o banco
        
         try {
             String sql = "SELECT * FROM fornecedor ORDER BY descr;";
             pstm = con.prepareStatement(sql);//prepare a conexao acessando a classe voce passa o caminho correspondente 
             return pstm.executeQuery();
             
         } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em Listar Fornecedores" +erro);
            return null;
         }
     } 
     
}
