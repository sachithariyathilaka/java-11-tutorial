package io.github.sachithariyathilaka.feature;

import io.github.sachithariyathilaka.Java11Tutorial;

import java.util.stream.Collectors;

/**
 * New string methods implemented class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/06/08
 */
public class NewStringMethods {

    /**
     * Execute the new string methods.
     */
    public static void executeNewStringMethods() {

        // String is not blank
        isBlank("Medium Story");

        // String is blank
        isBlank("");

        // Line method
        line("Medium\nStory");

        // Repeat method
        repeat("Medium Story ", 5);

        // Strip methods
        stripMethods(" Medium Blog ");
    }

    /**
     * Is blank new string method.
     *
     * @param   value the string value
     */
    private static void isBlank(String value) {
        if (value.isBlank())
            Java11Tutorial.print("This string is blank");
        else
            Java11Tutorial.print("This string is not blank");
    }

    /**
     * Line new string method.
     *
     * @param   value the string value
     */
    private static void line(String value) {
        value.lines().collect(Collectors.toList()).forEach(Java11Tutorial::print);
    }

    /**
     * Repeat new string method.
     *
     * @param   value the string value
     * @param   count the repeat count
     */
    private static void repeat(String value, int count) {
        Java11Tutorial.print(value.repeat(count));
    }

    /**
     * Strip methods.
     *
     * @param   value the string value
     */
    private static void stripMethods(String value) {
        Java11Tutorial.print("String with strip leading: " + value.stripLeading());
        Java11Tutorial.print("String with strip trailing: " + value.stripTrailing());
        Java11Tutorial.print("String with strip: " + value.strip());
    }
}
