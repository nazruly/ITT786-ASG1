import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;


public class ASG1sub1 {

  public static void main(String[] args) {

    // Convert the string to a
    // byte array.
    String name = "Nazrul Yusni bin Hamzah\n";
    String address = "No4 Jalan Elektron U16/52D Shah Alam\n";
    byte data1[] = name.getBytes();
    byte data2[] = address.getBytes();
    Path p = Paths.get("./NazrulYusni.txt");

    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE))) {
       out.write(data1, 0, data1.length);
       out.write(data2, 0, data2.length);
    } 
    catch (IOException x) {
      System.err.println(x);
    }
  }
}

