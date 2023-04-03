package org.example;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.io.File;
public class Ls implements Command{

    Path testFilePath;
    public void setCoommand(){

    }

    public String getCoommand() {
        final File file = new File("task10");

        String absolutePath = file.getAbsolutePath();
        String filePath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
        String filePath1 = filePath.substring(0,filePath.lastIndexOf(File.separator));
        File directoryPath = new File(filePath1);
        String contents[] = directoryPath.list();
        System.out.println("List of files and directories in the specified directory:");
        for(int i=0; i<contents.length; i++) {
            System.out.println(contents[i]);
        }
            return filePath;
    }
}
