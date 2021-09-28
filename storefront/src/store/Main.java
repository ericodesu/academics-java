package store;

import store.common.handlers.HandlerJanela;
import store.views.ViewHome;

/**
 *
 * @author Erick Frederick
 */
public class Main {
    public static void main(String[] args){
        HandlerJanela handlerJanela = new HandlerJanela();
        ViewHome viewHome = new ViewHome(handlerJanela);
    
        handlerJanela.configurarJanela(viewHome);
        handlerJanela.rederizarJanela(viewHome);
    }
}
