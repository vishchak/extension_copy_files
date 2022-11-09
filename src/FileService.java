import java.io.*;

public class FileService {
    public static void copyFile(File in, File out) throws IOException {
        try (InputStream is = new FileInputStream(in);
             OutputStream os = new FileOutputStream(out)) {
        } catch (Exception e) {
            throw e;
        }
    }

    public static void copyFile(File in, File out, String extension) throws IOException {
        String[] nameExtension = in.getName().split("\\.");
        if (extension.equals(nameExtension[1])) {
            copyFile(in, out);
        }
    }

    public static void copyFolder(File folder1, File folder2) throws IOException {
        if (!folder2.exists()) {
            folder2.mkdirs();
        }
        File[] files = folder1.listFiles();
        int filesCopied = 0;
        for (File file : files) {
            if (file.isFile()) {
                File out = new File(folder2, file.getName());
                FileService.copyFile(file, out);
                filesCopied++;
            }
        }
        System.out.println(filesCopied + " files copied");
    }

    public static void copyFolder(File folder1, File folder2, String extension) throws IOException {
        if (!folder2.exists()) {
            folder2.mkdirs();
        }
        File[] files = folder1.listFiles();
        int filesCopied = 0;
        for (File file : files) {
            if (file.isFile()) {
                File out = new File(folder2, file.getName());
                FileService.copyFile(file, out, extension);
                filesCopied++;
            }
        }
        System.out.println(filesCopied + " files copied");
    }
}


