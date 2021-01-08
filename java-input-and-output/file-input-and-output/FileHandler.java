import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public static void main(String[]args){
        try {
            // open input stream
            FileReader fr = new FileReader("test.txt");
            // then use the BufferedReader class to read text from the file
            BufferedReader br = new BufferedReader(fr);
            String x = br.readLine(); // read each line
            while (x!= null){
                System.out.print(x);
                x = br.readLine();
            }
            br.close();; // close buffer reader stream
            fr.close();; // close file reader stream
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
