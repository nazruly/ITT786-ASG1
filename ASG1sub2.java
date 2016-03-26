import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ASG1sub2 {

  public static void main(String[] args) throws IOException  {

    // File to read.
    Path fileIn = Paths.get("NazrulYusni.txt");
    // File to write in binary
    String fileout = "NazrulYusni.bin";
    // Read text file using Files.*
    byte[] buffer = Files.readAllBytes(fileIn);

    // Use stream for binary write
    FileOutputStream outputStream = new FileOutputStream(fileout);
    // Write from the buffer
    outputStream.write(buffer);
    // Close file
    outputStream.close();

    System.out.println("Wrote " + buffer.length + " bytes");
  }

}
