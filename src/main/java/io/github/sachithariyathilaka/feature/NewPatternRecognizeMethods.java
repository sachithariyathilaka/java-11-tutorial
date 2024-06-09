package io.github.sachithariyathilaka.feature;

import io.github.sachithariyathilaka.Java11Tutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

/**
 * New pattern recognize methods implemented class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/06/09
 */
public class NewPatternRecognizeMethods {

    /**
     * Execute the new pattern recognition methods.
     */
    public static void executeNewPatternRecognizeMethods() {

        // Pattern detected
        asMatchPredicate("Medium Story", "Medium Story");

        // Pattern not detected
        asMatchPredicate("Medium Story", "Medium");
    }

    /**
     * Write string new file method.
     *
     * @param   value the string value
     */
    private static void asMatchPredicate(String value, String pattern) {
        if (Pattern.compile(pattern).asMatchPredicate().test(value))
            Java11Tutorial.print("Pattern recognize detected");
        else
            Java11Tutorial.print("Pattern recognize not detected");
    }
}
