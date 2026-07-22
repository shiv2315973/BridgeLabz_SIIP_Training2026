import java.io.File;

public class FolderDeleter {
    public static void deleteFolder(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            System.out.println("Folder does not exist.");
            return;
        }

        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteFolder(file.getAbsolutePath());
                } else {
                    file.delete();
                }
            }
        }
        folder.delete();
    }

    public static void main(String[] args) {
        deleteFolder("demo-folder");
    }
}
