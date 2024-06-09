package io.github.sachithariyathilaka;

import io.github.sachithariyathilaka.feature.NewFileMethods;
import io.github.sachithariyathilaka.feature.NewPatternRecognizeMethods;
import io.github.sachithariyathilaka.feature.NewStringMethods;

import java.io.IOException;

/**
 * Main class for the tutorial.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/06/08
 */
public class Java11Tutorial {

    public static void main(String[] args) throws IOException {

        // New string methods
        NewStringMethods.executeNewStringMethods();

        // New file methods
        NewFileMethods.executeNewFileMethods();

        // new pattern recognition methods
        NewPatternRecognizeMethods.executeNewPatternRecognizeMethods();
    }

    /**
     * Print the message.
     *
     * @param   message the message
     */
    public static void print(String message) {
        System.out.println(message);
    }
}
