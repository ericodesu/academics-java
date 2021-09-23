package condominio;

import condominio.views.ViewHome;
import common.handlers.HandlerJanela;
import common.handlers.HandlerMigration;

public class Condominio {
    public static void main(String[] args) {
        HandlerMigration handlerMigration = new HandlerMigration();
        handlerMigration.configurarAmbiente();

        ViewHome homeView = new ViewHome();

        HandlerJanela handlerJanela = new HandlerJanela();

        handlerJanela.configurarJanela(homeView);
        handlerJanela.rederizarJanela(homeView);
    }
}
