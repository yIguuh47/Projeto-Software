/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

/**
 *
 * @author epic4
 */
public class Fornecedor {
    private int cnpj, tel, cep, codig;
    private String descrForn;

    
    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCodig() {
        return codig;
    }

    public void setCodig(int codig) {
        this.codig = codig;
    }

    public String getDescrForn() {
        return descrForn;
    }

    public void setDescrForn(String descrForn) {
        this.descrForn = descrForn;
    }
    
}
