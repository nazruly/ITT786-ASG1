import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;

public class ASG1sub1v2 {

  public static void main(String[] args) {

    // Create array of data
    String[] myDetail;
    myDetail = new String[2];
    myDetail[0] = "Nazrul Yusni bin Hamzah";
    myDetail[1] = "Seksyen U16 Shah Alam";

    PrintWriter outputStream = null;

try  {
    outputStream = new PrintWriter(new FileWriter("NazrulYusni.txt"));
    // write data line by line
    for (int x = 0; x <= 1; x++) {
        outputStream.println(myDetail[x]);
    }
    // close file
      outputStream.close();
    }
    catch (IOException x) {
      System.err.println(x);
    }
  }
}
