package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileHandlingDemo {

    public static void main(String[] args) throws IOException {

   /*     FileOutputStream fout=new FileOutputStream("/home/melayer-01/Desktop/codekul/checkfilehandling.txt");
        String s="codekul";
        byte[] b=s.getBytes();
        fout.write(b);
        fout.close();
        System.out.println("Successfully saved ");
*/
        FileInputStream fin=new FileInputStream("/home/melayer-01/Desktop/codekul/checkfilehandling.txt");
        int i=0;
        while ((i=fin.read())!=-1){
            System.out.print((char) i);
        }
        fin.close();
    }

}
