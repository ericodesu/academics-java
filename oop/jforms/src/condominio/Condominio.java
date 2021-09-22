package condominio;

import condominio.View.ViewHome;
import common.JanelaHandler;

public class Condominio {
    public static void main(String[] args) {
        JanelaHandler janelaHandler = new JanelaHandler();

        ViewHome homeView = new ViewHome();
        
        janelaHandler.configurarJanela(homeView);
        janelaHandler.rederizarJanela(homeView);
    }
}
