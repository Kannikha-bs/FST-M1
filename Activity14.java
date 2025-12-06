package Activities_kanni;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Activity14 {

    public static void main(String[] args) {

        try {
            // 1. Create a new text file
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists: " + file.getName());
            }

            // 2. Write some text into the file
            String text = "This is a sample text for Activity 14 without FileUtils.";
            Files.writeString(file.toPath(), text);
            System.out.println("Text written to file.");

            // 3. Read the file
            String content = Files.readString(file.toPath());
            System.out.println("Content of original file:\n" + content);

            // 4. Create a new directory named "destDir"
            File destDir = new File("destDir");
            if (!destDir.exists()) {
                destDir.mkdir();
                System.out.println("Directory created: " + destDir.getName());
            }

            // 5. Copy the file into the new directory
            Path copiedPath = destDir.toPath().resolve(file.getName());
            Files.copy(file.toPath(), copiedPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied to directory: " + destDir.getName());

            // 6. Read data from the copied file
            File copiedFile = new File(destDir, file.getName());
            String copiedContent = Files.readString(copiedFile.toPath());
            System.out.println("Content of copied file:\n" + copiedContent);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
