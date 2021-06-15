package Conexao;

import Controle.Saida;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SaidaDAO {
    
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Saida> lista = new ArrayList<>();
 
    public ArrayList<Saida> PesquisarProduto () {
         con = new Conectar().Conectar();
         
        try {
           String sql = "select * from produto";
           
           pstm = con.prepareStatement(sql); 
           rs = pstm.executeQuery();
           
           while(rs.next()){
               Saida objSaida = new Saida();
               objSaida.setDesc(rs.getString("descr"));
               objSaida.setQuantAtual(rs.getInt("quant"));
               objSaida.setPreco(rs.getDouble("preco"));
               objSaida.setPrecoVenda(rs.getDouble("preco_uni"));
               objSaida.setFornecedor(rs.getInt("fornecedor"));
               objSaida.setCodigo(rs.getInt("codig"));
               
               lista.add(objSaida);
               
           }
           
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em retornar produtos DAO" +erro);
        }
        return lista;//retorna
    }

     public void AlterarProduto(Saida objsaidadto){
        con = new Conectar().Conectar();
        
        try {//tente..
           String sql = "UPDATE produto SET descr = ?, quant= ?, preco = ?, preco_uni = ?, fornecedor = ? WHERE codig = ?";
           
           pstm = con.prepareStatement(sql);
           pstm.setString(1, objsaidadto.getDesc());
           pstm.setInt(2, objsaidadto.getQuantAtual());
           pstm.setDouble(3, objsaidadto.getPreco());
           pstm.setDouble(4, objsaidadto.getPrecoVenda());
           pstm.setInt(5, objsaidadto.getFornecedor());
           pstm.setInt(6, objsaidadto.getCodigo());
        
           pstm.executeUpdate();
           pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em Alterar Produtos" +erro);
        }
     }  
     
     public void ExcluirProduto(Saida objsaidadto){
        con = new Conectar().Conectar();
        
        try {
           String sql = "DELETE FROM produto WHERE codig = ?";
           
           pstm = con.prepareStatement(sql);
           pstm.setInt(1, objsaidadto.getCodigo());
        
           pstm.executeUpdate();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em Excluir Produtos" +erro);
        }
     }
     
      public ResultSet listarFornecedor(){
        con = new Conectar().Conectar();
        
         try {
             String sql = "SELECT * FROM fornecedor ORDER BY descr;";
             pstm = con.prepareStatement(sql);
             return pstm.executeQuery();
             
         } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em Listar Fornecedores" +erro);
            return null;
         }
     } 

}
