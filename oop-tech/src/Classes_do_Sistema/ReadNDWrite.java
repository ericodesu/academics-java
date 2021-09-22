package Classes_do_Sistema;

public class ReadNDWrite {
    public interface InitWriting{
        String DEFAULT_FILE_PATH = "src\\Outputs_do_Sistema\\";
        int[] COLOR_SUCESS = {37, 201, 28};
        int[] COLOR_ERROR = {201, 28, 31};
        int[] COLOR_DEFAULT = {139 ,139 ,139};
        
        void writeFile(String fileName,String fileExtension);
    }
    public interface InitReading{
        String DEFAULT_FILE_PATH = "src\\Outputs_do_Sistema\\";
        int[] COLOR_SUCESS = {37, 201, 28};
        int[] COLOR_ERROR = {201, 28, 31};
        
        void readFile(String fileName,String fileExtension);
    }
}
