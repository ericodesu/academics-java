package Classes_do_Sistema;

public class ActionHSHGenerator {
    public interface HashGenerator{
        char[] ALPHABET = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        void Hash(int key1, int key2);
    }
}
