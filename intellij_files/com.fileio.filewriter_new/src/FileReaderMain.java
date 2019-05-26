import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderMain {
    public static void main(String[] args) throws IOException {
        String lineEntry, name, phoneNum, address;

        //Using try with resources. A resource must be included in the try block
        try{
            Scanner fileScanner = new Scanner(new FileReader("C:/Software/Java/FileData/FileWriterTest.txt"));

            while (fileScanner.hasNextLine())
            {
                lineEntry = fileScanner.nextLine();
                System.out.println("Data is <" + lineEntry + ">");
                name = lineEntry.substring(0,15);
                phoneNum = lineEntry.substring(16,29);
                address = lineEntry.substring(30);
                System.out.println("name is <" + name + ">");
                System.out.println("name is <" + phoneNum + ">");
                System.out.println("name is <" + address + ">");
            }
        }
        catch (IOException e){
            System.out.println("In catch block");
            e.printStackTrace();
        }

        //Using bufferedReader
        try{
            Scanner bufferedScanner = new Scanner(new BufferedReader(new FileReader("C:/Software/Java/FileData/FileWriterTest.txt")));

            while (bufferedScanner.hasNextLine())
            {
                String bufferedInput = bufferedScanner.nextLine();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
