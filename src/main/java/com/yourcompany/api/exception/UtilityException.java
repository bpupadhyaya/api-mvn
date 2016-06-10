package com.yourcompany.api.exception;

/**
 * Purpose: Customized exception
 * Created by bpupadhyaya on 6/9/16.
 */
public class UtilityException extends Exception {

    /**
     * Utility exception instantiation with message
     * @param message
     */
    public UtilityException(String message) {
        super(message);
    }

    /**
     * Utility exception instantiation with message and throwable
     * @param message
     * @param throwable
     */
    public UtilityException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
