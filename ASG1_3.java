import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ASG1_3 {

  public static void main(String[] args) throws IOException  {

    // variable declaration
    String filein = "NazrulYusni.bin"; // read binary file
    String fileout = "last.txt";         // write text file
    byte[] buffer = new byte[100];
    FileInputStream inputStream = new FileInputStream(filein);

    // read file into buffer
    int i = inputStream.read(buffer);

    // convert buffer bytes to string
    String allwords = decompress(buffer);

    // Close files.
    inputStream.close();

    // Notification
    System.out.println(i + " bytes read. Converted text: \n" + allwords);

    //Write to last.txt
    PrintWriter outputStream = null;
    outputStream = new PrintWriter(new FileWriter(fileout));
    outputStream.println(allwords);
    outputStream.close();


  }   // ---------- End main ---------------





  public static String decompress(byte[] bytes) {
      InputStream in = new InflaterInputStream(new ByteArrayInputStream(bytes));
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      try {
          byte[] buffer = new byte[8192];
          int len;
          while((len = in.read(buffer))>0)
              baos.write(buffer, 0, len);
          return new String(baos.toByteArray(), "UTF-8");
      } catch (IOException e) {
          throw new AssertionError(e);
      }
  }



}
