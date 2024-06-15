package io.github.sachithariyathilaka.feature;

import io.github.sachithariyathilaka.Java11Tutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

/**
 * New optional methods implemented class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/06/15
 */
public class NewOptionalMethods {

    /**
     * Execute the new optional methods.
     */
    public static void execute() {

        // Optional is empty
        isEmpty(Optional.empty());

        // Optional is not empty
        isEmpty(Optional.of("Medium"));

    }

    /**
     * Is empty new file method.
     *
     * @param   value the Optional<String> value
     */
    private static void isEmpty(Optional<String> value) {
        if (value.isEmpty())
            Java11Tutorial.print("The Optional value is empty");
        else
            Java11Tutorial.print("The optional value is not empty");
    }
}
