package Controle;

import Interface.Login;
import Interface.MenuEntrada;
import Interface.MenuFornecedor;
import Interface.MenuProdutos;
import Interface.MenuSaida;
import Interface.Menul;

public class View {
    
    //metodos
    public void Fechar(){
        System.exit(0);
    }
    
    public void MenuLogin(){
        Login log = new Login();
        log.setVisible(true);
    }

    public void Menu(){
        Menul Menu = new Menul();
        Menu.setVisible(true);

    }

    public void MenuEntrada(){
        MenuEntrada menuEntra = new MenuEntrada();
        menuEntra.setVisible(true);
    }
    
    public void MenuFornecedor(){
        MenuFornecedor menuForn = new MenuFornecedor();
        menuForn.setVisible(true);
    }
    
    public void MenuSaida(){
        MenuSaida menuVen = new MenuSaida();
        menuVen.setVisible(true);
    }
    
    public void MenuProdutos(){
        MenuProdutos menuProd = new MenuProdutos();
        menuProd.setVisible(true);
    }
    
}
