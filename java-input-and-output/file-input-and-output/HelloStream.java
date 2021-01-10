import java.io.*;
import java.nio.charset.StandardCharsets;

// In this file the two classes FileInputStream and FileOutputStream are used to read and write
// bytes of data from one file to another

public class InOutStream {

    public static void main(String[]args) throws IOException{

        // opens the first file and creates an inputstream for the opened file
        File filein = new File("test1.txt");
        FileInputStream fin = new FileInputStream(filein);

        // the array stores the bytes contained in the file
        byte bytesArr [] = new byte[(int) filein.length()];

        // the data is read from the array
        int byteSize = fin.read(bytesArr);
        System.out.println("The contents of the file named " + filein.getName() + " has been copied.");

        // opens the recipient file and  creates an outputstream
        File fileout = new File("test2.txt");
        FileOutputStream fout = new FileOutputStream(fileout);

        // writes the bytes of data to the specified file
        fout.write(bytesArr);
        System.out.println("The data that was copied has been witten to " + fileout.getName());
    }
}
