package condominio;

import condominio.views.ViewHome;
import common.handlers.HandlerJanela;
import common.handlers.HandlerRelatorio;
import common.handlers.HandlerMigration;

public class Condominio {
    public static void main(String[] args) {
        HandlerMigration handlerMigration = new HandlerMigration();
        handlerMigration.configurarAmbiente();

        HandlerJanela handlerJanela = new HandlerJanela();

        ViewHome homeView = new ViewHome(handlerJanela, new HandlerRelatorio());

        handlerJanela.configurarJanela(homeView);
        handlerJanela.rederizarJanela(homeView);
    }
}
