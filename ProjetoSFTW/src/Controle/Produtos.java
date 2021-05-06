/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Conexao.FornecedorDAO;

/**
 *
 * @author epic4
 */
public class Produtos {
    private String desc;
    private int fornecedor;
    private int quant;
    private int codig;
    private double preco;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getCodig() {
        return codig;
    }

    public void setCodig(int codig) {
        this.codig = codig;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }
}
