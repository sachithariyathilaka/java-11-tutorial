package io.github.sachithariyathilaka.feature;

import io.github.sachithariyathilaka.Java11Tutorial;

import java.util.List;

/**
 * Lambda local parameter syntax implemented class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/06/15
 */
public class LambdaParameterSyntax {

    /**
     * Execute the lambda parameter syntax.
     */
    public static void execute() {
        lambdaParameterSyntax(List.of("Toyota", "Audi", "BMW"));
    }

    /**
     * Lambda parameter syntax.
     *
     * @param   brands the brand list
     */
    private static void lambdaParameterSyntax(List<String> brands) {
        brands.forEach((var brand) -> Java11Tutorial.print(brand));
    }
}
