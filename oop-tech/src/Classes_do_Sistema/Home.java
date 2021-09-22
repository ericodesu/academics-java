package Classes_do_Sistema;

import Telas_do_Sistema.HomeForm;

public class Home {
    public static int totalProducts = -1;
    public static int currentProduct = 0;
    public static Product[] products = new Product[10];
    
    public static int totalClients = -1;
    public static int currentClient = 0;
    public static Client[] clients = new Client[20];
      
    public static int currentOrders = 0;
    public static Order[] orders = new Order[40];
    
    public static int totalSales = -1;
    public static int currentSale = 0;
    
    public static int totalBudget = -1;
    public static int currentBudget = 0;
    
    public static void main(String[] args) {
       HomeForm homePage = new HomeForm();
       homePage.setVisible(true);
    }
    
}