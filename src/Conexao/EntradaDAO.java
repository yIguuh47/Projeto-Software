package Conexao;

import Controle.Entrada;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EntradaDAO {
    
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Entrada> lista = new ArrayList<>();
    
    public ArrayList<Entrada> pesquisarProduto () {
         con = new Conectar().Conectar();
         
        try {
           String sql = "select * from produto";
           
           pstm = con.prepareStatement(sql); 
           rs = pstm.executeQuery();
           
           while(rs.next()){
               Entrada objEntrada = new Entrada();
               objEntrada.setDesc(rs.getString("descr"));
               objEntrada.setQuantAtual(rs.getInt("quant"));
               objEntrada.setPreco(rs.getDouble("preco"));
               objEntrada.setPrecoVenda(rs.getDouble("preco_uni"));
               objEntrada.setFornecedor(rs.getInt("fornecedor"));
               objEntrada.setCodigo(rs.getInt("codig"));
               
               lista.add(objEntrada);
               
           }
           
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em retornar produtos DAO" +erro);
        }
        return lista;
    }

     public void AlterarProduto(Entrada objentrada){
        con = new Conectar().Conectar();
        
        try {
           String sql = "UPDATE produto SET  quant = ? WHERE codig = ?";
           
           pstm = con.prepareStatement(sql);
           pstm.setInt(1, objentrada.getQuantAtual());
           pstm.setInt(2, objentrada.getCodigo());
        
           pstm.executeUpdate();
           pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ERRO em Alterar Produtos" +erro);
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
