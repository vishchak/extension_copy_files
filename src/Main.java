import java.io.File;
import java.io.IOException;

/**
 * Write a program that will copy files from with a specific extension (for example, doc only) from source directory to destination directory.
 */
public class Main {
    public static void main(String[] args) {

        File inputFolder = new File("C:/Users/denis/Documents/Java/extension_copy_files/files_to_copy");
        File outputFolder = new File("C:/Users/denis/Documents/Java/extension_copy_files/Copied");

        try {
            FileService.copyFolder(inputFolder, outputFolder, "pptx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




