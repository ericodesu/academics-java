package Classes_do_Sistema;
import Classes_do_Sistema.ActionHSHGenerator.HashGenerator;
import static Classes_do_Sistema.Home.currentSale;

public class Sale implements HashGenerator{
    private String saleID;
    
    public String getSaleID() { 
        return saleID;
    }

    public void setSaleID(String saleID) {
        this.saleID = saleID;
    }     
    @Override
    public void Hash(int key1, int key2) {
        int firstHalf = (((key1 + 1) * 2) * 2128);
        int secondtHalf = (int) (((key2  + 1) * 1.5) * 939);
        
        String hash = "S:" + Integer.toString(firstHalf) + ALPHABET[currentSale] + Integer.toString(secondtHalf);
        
        setSaleID(hash);
    }
    
}
