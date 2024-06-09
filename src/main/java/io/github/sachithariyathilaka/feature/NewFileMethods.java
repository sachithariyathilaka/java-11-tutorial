package io.github.sachithariyathilaka.feature;

import io.github.sachithariyathilaka.Java11Tutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * New file methods implemented class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/06/09
 */
public class NewFileMethods {

    /**
     * Execute the new string methods.
     */
    public static void executeNewFileMethods() throws IOException {

        // Write string method
        writeString("This string is for execute new file methods");

        // Read string method
        readString();

        // Same file
        isSameFile("D:/Project/java-11-tutorial/src/main/resources/medium.txt", "D:/Project/java-11-tutorial/src/main/resources/medium.txt");

        // Different file
        isSameFile("D:/Project/java-11-tutorial/src/main/resources/medium.txt", "D:/Project/java-11-tutorial/src/main/resources/medium-duplicate.txt");
    }

    /**
     * Write string new file method.
     *
     * @param   value the string value
     */
    private static void writeString(String value) throws IOException {
        Files.writeString(Path.of("D:/Project/java-11-tutorial/src/main/resources/medium.txt"), value);
    }

    /**
     * Read string new file method.
     */
    private static void readString() throws IOException {
        Java11Tutorial.print(Files.readString(Path.of("D:/Project/java-11-tutorial/src/main/resources/medium.txt")));
    }

    /**
     * Is same file new file method.
     *
     * @param   file1 the first file path
     * @param   file2 the second file path
     */
    private static void isSameFile(String file1, String file2) throws IOException {

        if (Files.isSameFile(Path.of(file1), Path.of(file2)))
            Java11Tutorial.print("Two files are same");
        else
            Java11Tutorial.print("Two files are not same");
    }
}
