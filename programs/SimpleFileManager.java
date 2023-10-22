import java.io.File;
import java.util.Scanner;

public class SimpleFileManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentDirectory = System.getProperty("user.dir");

        while (true) {
            System.out.println("Current Directory: " + currentDirectory);
            System.out.println("1. List Files and Directories");
            System.out.println("2. Change Directory");
            System.out.println("3. Create Directory");
            System.out.println("4. Delete File or Directory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listFilesAndDirectories(currentDirectory);
                    break;
                case 2:
                    System.out.print("Enter the directory path: ");
                    String newDir = scanner.next();
                    currentDirectory = changeDirectory(currentDirectory, newDir);
                    break;
                case 3:
                    System.out.print("Enter the directory name to create: ");
                    String newDirectoryName = scanner.next();
                    createDirectory(currentDirectory, newDirectoryName);
                    break;
                case 4:
                    System.out.print("Enter the file/directory name to delete: ");
                    String target = scanner.next();
                    deleteFileOrDirectory(currentDirectory, target);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void listFilesAndDirectories(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    private static String changeDirectory(String currentDirectory, String newDirectory) {
        File newDir = new File(currentDirectory, newDirectory);
        if (newDir.exists() && newDir.isDirectory()) {
            return newDir.getAbsolutePath();
        } else {
            System.out.println("Directory does not exist.");
            return currentDirectory;
        }
    }

    private static void createDirectory(String currentDirectory, String newDirectoryName) {
        File newDir = new File(currentDirectory, newDirectoryName);
        if (newDir.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Failed to create the directory.");
        }
    }

    private static void deleteFileOrDirectory(String currentDirectory, String target) {
        File fileOrDir = new File(currentDirectory, target);
        if (fileOrDir.exists()) {
            if (fileOrDir.isFile()) {
                if (fileOrDir.delete()) {
                    System.out.println("File deleted successfully.");
                } else {
                    System.out.println("Failed to delete the file.");
                }
            } else if (fileOrDir.isDirectory()) {
                if (fileOrDir.delete()) {
                    System.out.println("Directory deleted successfully.");
                } else {
                    System.out.println("Failed to delete the directory.");
                }
            }
        } else {
            System.out.println("File or directory not found.");
        }
    }
}
