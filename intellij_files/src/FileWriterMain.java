import java.io.IOException;
import java.util.Scanner;

public class FileWriterMain {

    public static void main(String[] args)
    {
        Scanner fileScanner = new Scanner(System.in);
        System.out.println("Enter the file location/name");
        String fileName = fileScanner.nextLine();
        MyFileWriter myFileWriter = new MyFileWriter(fileName);

        myFileWriter.setFileData("This is a test of file writing");
        try {
            myFileWriter.processFile();
        }
        catch (IOException e)
        {
            System.out.println("An error occurred writing to the file");
            e.printStackTrace();
        }
        finally //close the file in the finally block to be certain file is closed.
        {
            try{
                myFileWriter.closeFile();
            }
            catch(IOException e)
            {
                System.out.println("An error occurred closing the file");
                e.printStackTrace();
            }
        }
    }
}
