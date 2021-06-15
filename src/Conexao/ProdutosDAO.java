package Conexao;

import Controle.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutosDAO {
    
    Connection con;//executa conexão
    PreparedStatement pstm;//prepara conexão
    ResultSet rs;//resulta dados mysql
    ArrayList<Produtos> lista = new ArrayList<>();//array para armazenar dados db
    
    
    public void cadastroProduto(Produtos objprodutodto){//metodo publico sem retorno
        con = new Conectar().Conectar();//variavel para chamar o metodo e a classe e conexao com o banco
        
        try {//tente..
           String sql = "insert into produto ( descr, preco, preco_uni, fornecedor) values (?,?,?,?)";//comando sql
           
           pstm = con.prepareStatement(sql);//prepara a conexão e passa o codigo com oq foi setado em values
           pstm.setString(1, objprodutodto.getDesc());
           pstm.setDouble(2, objprodutodto.getPreco());
           pstm.setDouble(3, objprodutodto.getPrecoVenda());
           pstm.setInt(4,objprodutodto.getFornecedor());
        
           pstm.execute();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
        } catch (SQLException erro) {//se nao der certo..
            JOptionPane.showMessageDialog(null,"ERRO em cadastrar Produtos" +erro);
        }
        
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Produtos> pesquisarProduto () {//retorno de dados 
         con = new Conectar().Conectar();
         
        try {
           String sql = "select * from produto";//selecionar todos os dados do db
           
           pstm = con.prepareStatement(sql); 
           rs = pstm.executeQuery();
           
           while(rs.next()){//enquanto..
               Produtos objProdutos = new Produtos();//acessa o obj para setar um valor do db
               objProdutos.setDesc(rs.getString("descr"));//linhas de dados da lista
               objProdutos.setQuantAtual(rs.getInt("quant"));//pega um inteiro que  vem da coluna quant e seta a  var quantidade
               objProdutos.setPreco(rs.getDouble("preco"));
               objProdutos.setPrecoVenda(rs.getDouble("preco_uni"));
               objProdutos.setFornecedor(rs.getInt("fornecedor"));
               objProdutos.setCodigo(rs.getInt("codig"));
               
               lista.add(objProdutos);//monta lista
               
           }
           
           
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em retornar produtos DAO" +erro);
        }
        return lista;//retorna lista
    }

     public void AlterarProduto(Produtos objprodutodto){//metodo publico sem retorno
        con = new Conectar().Conectar();
        
        try {
           String sql = "UPDATE produto SET descr = ?, preco = ?, preco_uni = ?, fornecedor = ? WHERE codig = ?";//comando sql
           
           pstm = con.prepareStatement(sql);//prepara a conexao e seta a string sql no banco
           pstm.setString(1, objprodutodto.getDesc());
           pstm.setDouble(2, objprodutodto.getPreco());
           pstm.setDouble(3, objprodutodto.getPrecoVenda());
           pstm.setInt(4, objprodutodto.getFornecedor());
           pstm.setInt(5, objprodutodto.getCodigo());
        
           pstm.executeUpdate();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em Alterar Produtos" +erro);
        }
     }  
     
     public void ExcluirProduto(Produtos objprodutodto){
        con = new Conectar().Conectar();//variavel para chamar o metodo e a classe e conexao com o banco
        
        try {//tente..
           String sql = "DELETE FROM produto WHERE codig = ?";//comando sql
           
           pstm = con.prepareStatement(sql);//prepara a conexao e seta a string sql no banco
           pstm.setInt(1, objprodutodto.getCodigo());
        
           pstm.executeUpdate();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
        } catch (SQLException erro) {//se nao der certo..
            JOptionPane.showMessageDialog(null,"ERRO em Excluir Produtos" +erro);
        }
     }
     
      public ResultSet listarFornecedor(){
        con = new Conectar().Conectar();//chamar o metodo e a classe de conexao com o banco
        
         try {
             String sql = "SELECT * FROM fornecedor ORDER BY descr;";
             pstm = con.prepareStatement(sql);//prepara a conexao e seta a string sql no banco
             return pstm.executeQuery();
             
         } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em Listar Fornecedores" +erro);
            return null;
         }
     } 
 
      
      
}
