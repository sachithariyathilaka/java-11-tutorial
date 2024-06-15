package io.github.sachithariyathilaka;

import io.github.sachithariyathilaka.feature.*;

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
        NewStringMethods.execute();

        // New file methods
        NewFileMethods.execute();

        // New pattern recognition methods
        NewPatternRecognizeMethods.execute();

        // New time unit conversion methods
        NewTimeUnitConversionMethods.execute();

        // New time unit conversion methods
        NewOptionalMethods.execute();

        // Lambda parameter syntax
        LambdaParameterSyntax.execute();
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
