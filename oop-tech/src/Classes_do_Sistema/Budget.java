package Classes_do_Sistema;
import Classes_do_Sistema.ActionHSHGenerator.HashGenerator;
import static Classes_do_Sistema.Home.currentBudget;

public class Budget implements HashGenerator{
    private String budgetID;
    
    public String getBudgetID() { 
        return budgetID;
    }

    public void setBudgetID(String budgetID) {
        this.budgetID = budgetID;
    }    
    
    @Override
    public void Hash(int key1, int key2) {
        int firstHalf = (((key1 + 1) * 2) * 1258);
        int secondtHalf = (int) (((key2  + 1) * 1.5) * 629);
        
        String hash = "B:" + Integer.toString(firstHalf) + ALPHABET[currentBudget] + Integer.toString(secondtHalf);
        
        setBudgetID(hash); 
    }  
}
