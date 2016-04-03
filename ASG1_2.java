import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ASG1_2 {

  public static void main(String[] args) throws IOException  {

    String filein = "NazrulYusni.txt";
    String allwords = "";
    // Use this for reading the data.
    byte[] buffer = new byte[100];

    FileInputStream inputStream = new FileInputStream(filein);
    int total = 0;
    int nRead = 0;

    //Read file in bytes
    while((nRead = inputStream.read(buffer)) != -1) {
        // Convert buffer to String so we can collect it.
        String thisBuffer = new String(buffer);
        // Collect all string in buffer
        allwords = allwords + thisBuffer;
        total += nRead;
    }
    // Close files.
    inputStream.close();

    // Convert read string to binary bytes
    byte[] binallwords = compress(allwords);

    // Open file in Binary for write
    Path fileout = Paths.get("NazrulYusni.bin");
    //FileOutputStream outputStream = new FileOutputStream(fileout);

    OutputStream out = new BufferedOutputStream(Files.newOutputStream(fileout, CREATE));
    // write data line by line
    out.write(binallwords, 0, binallwords.length);
    // close fileout
    out.close();
    System.out.println("Binary files created");

  } // ----------------- End main ----------------





  public static byte[] compress(String text) {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      try {
          OutputStream out = new DeflaterOutputStream(baos);
          out.write(text.getBytes("UTF-8"));
          out.close();
      } catch (IOException e) {
          throw new AssertionError(e);
      }
      return baos.toByteArray();
  }



}
