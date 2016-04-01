import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ASG1sub2v2 {

  public static void main(String[] args) throws IOException  {

    BufferedReader inputStream = null;
    String currentLine;
    int num = 0;
    String[] allLines;
    allLines = new String[2];
    allLines[0] = "";
    allLines[1] = "";

    inputStream = new BufferedReader(new FileReader("NazrulYusni.txt"));
    // Read file line by line
    while ((currentLine = inputStream.readLine()) != null) {
            allLines[num] = currentLine + "\n";
            num += 1;
      }

      System.out.print("Name: " + allLines[0]);
      System.out.print("Address: " + allLines[1]);
    }

    // Open file in Binary for write
    String fileout = "NazrulYusni.bin";
    FileOutputStream outputStream = new FileOutputStream(fileout);


}
