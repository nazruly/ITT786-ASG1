import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ASG1sub3 {

  public static void main(String[] args) throws IOException  {

    String filein = "NazrulYusni.bin";
    Path fileout = Paths.get("last.txt");
    String allwords = "";
    // Use this for reading the data.
    byte[] buffer = new byte[100];

    FileInputStream inputStream = new FileInputStream(filein);
    int total = 0;
    int nRead = 0;

    //Read in binary
    while((nRead = inputStream.read(buffer)) != -1) {
        // Convert buffer to String so we can collect it.
        String thisBuffer = new String(buffer);
        // Collect all string in buffer
        allwords = allwords + thisBuffer;
        total += nRead;
    }
    // Close files.
    inputStream.close();
    System.out.println("Read " + total + " bytes");
    System.out.println("Words read: " + allwords);

    //Write to last.txt from ASG1sub1
    byte data[] = allwords.getBytes();
    OutputStream out = new BufferedOutputStream(Files.newOutputStream(fileout, CREATE));
    out.write(data, 0, data.length);
    // close files
    out.close();
  }

}
