import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;

public class ASG1_1 {

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
    outputStream.println(myDetail[0]);
    outputStream.println(myDetail[1]);
    // close file
    outputStream.close();
    }
    catch (IOException x) {
      System.err.println(x);
    }
  }
}
