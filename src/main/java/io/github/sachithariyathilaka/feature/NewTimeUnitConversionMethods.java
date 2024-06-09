package io.github.sachithariyathilaka.feature;

import io.github.sachithariyathilaka.Java11Tutorial;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * New time unit conversion methods implemented class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/06/09
 */
public class NewTimeUnitConversionMethods {

    /**
     * Execute the new time unit conversion methods.
     */
    public static void executeNewTimeUnitConversionMethods() {
        convert(TimeUnit.DAYS, Duration.ofHours(86400));
        convert(TimeUnit.DAYS, Duration.ofMinutes(86400));
        convert(TimeUnit.DAYS, Duration.ofSeconds(86400));
    }

    /**
     * Write string new file method.
     *
     * @param   timeUnit the time unit
     * @param   duration the duration
     */
    private static void convert(TimeUnit timeUnit, Duration duration) {
       Java11Tutorial.print("Time unit conversion result is: " + timeUnit.convert(duration));
    }
}
