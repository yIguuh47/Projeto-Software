package Controle;

import Interface.Login;
import Interface.MenuFornecedor;
import Interface.MenuProdutos;
import Interface.Menul;
import javax.swing.JOptionPane;

public class View {
    
    public void Fechar(){
        System.exit(0);//fechar
    }
    
    public void MenuLogin(){//metodo de acesso ao painel login
        Login log = new Login();
        log.setVisible(true);
    }

    public void Menu(){//metodos de acesso..
        Menul Menu = new Menul();
        Menu.setVisible(true);

    }

    public void MenuProdutos(){
        MenuProdutos menuProd = new MenuProdutos();
        menuProd.setVisible(true);
    }
    
    public void MenuFornecedor(){
        MenuFornecedor menuForn = new MenuFornecedor();
        menuForn.setVisible(true);
    }
    
}
