import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter
{
    private String fileName;
    private String fileData;
    private FileWriter fileWriter;

    public MyFileWriter(String fileName)
    {
        this.fileName = fileName;
        this.fileWriter = null;
    }

    public void setFileData(String fileData)
    {
        this.fileData = fileData;
    }

    public void processFile() throws IOException
    {
        fileWriter = new FileWriter(fileName);
        fileWriter.write(fileData + "\n");
    }

    public void closeFile() throws IOException
    {
        if (fileWriter != null)
            fileWriter.close();
    }
}
