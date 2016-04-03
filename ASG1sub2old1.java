import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ASG1sub2 {

  public static void main(String[] args) throws IOException  {

    // Read file //
    //Path filein = Paths.get("./NazrulYusni.txt");
    //Path fileout = Paths.get("./NazrulYusni.bin");
    DataInputStream dataIn = new DataInputStream(new FileInputStream("./NazrulYusni.txt"));
    DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("./NazrulYusni.bin"));
	 while(dataIn.available()>0)
         {
            // returns unsigned 8-bit number
            int k = dataIn.readUnsignedByte();
            dataOut.writeByte(k);
            // print
            //System.out.print(k + " ");
         }
     dataIn.close();
     dataOut.close();    

    //byte[] fileData = Files.readAllBytes(filein);
    //String content = "";
    //for (byte b : fileData)
	//content += getBits(b);

    //byte[] contentInBytes = content.getBytes();

    //OutputStream out = new BufferedOutputStream(Files.newOutputStream(fileout, CREATE));
    //out.write(contentInBytes);
    //out.close();

    //DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("./NazrulYusni.bin"));
    //dataOut.writeByte(k);
    //dataOut.close();    

    //System.out.println("Content: " + content);  
  }

static String getBits(byte b)
{
    String result = "";
    for(int i = 0; i < 8; i++)
        result += (b & (1 << i)) == 0 ? "0" : "1";
    return result;
}

}
