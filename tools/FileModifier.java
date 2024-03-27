package com.tools;
import java.io.*;

public class FileModifier {

    public static void main(String[] args) {
        // Define the root directory
        String rootDirectory = "";

        // Define the string to be replaced and the new string
        String stringToReplace = "";
        String newString = "";

        // Call the method to process files
        processFiles(rootDirectory, stringToReplace, newString);
    }

    public static void processFiles(String directory, String stringToReplace, String newString) {
        File root = new File(directory);

        // Check if the provided directory exists
        if (!root.exists() || !root.isDirectory()) {
            System.out.println("Invalid directory: " + directory);
            return;
        }

        // Get all files and directories in the provided directory
        File[] files = root.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // Recursively process subdirectories
                    processFiles(file.getAbsolutePath(), stringToReplace, newString);
                } else {
                    // Process files
                    modifyFile(file, stringToReplace, newString);
                }
            }
        }
    }

    public static void modifyFile(File file, String stringToReplace, String newString) {
        try {
            // Read the contents of the file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                // Replace the string if it exists in the current line
                line = line.replaceAll(stringToReplace, newString);
                stringBuilder.append(line).append("\n");
            }
            reader.close();

            // Write the modified contents back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("File modified: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
