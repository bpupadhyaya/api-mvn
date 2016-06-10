package com.yourcompany.api;

import com.yourcompany.api.exception.UtilityException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Purpose: Utility class to load properties.
 * Created by bpupadhyaya on 6/9/16.
 */
public class PropertyFileLoadingUtility {

    /**
     * Load XML properties
     * @param propertyFileName
     * @return returns key value pair
     * @throws UtilityException
     */
    public static Properties loadXMLProperties(String propertyFileName) throws UtilityException {
        Properties properties = new Properties();
        try (InputStream input = PropertyFileLoadingUtility.class.getClassLoader().getResourceAsStream(propertyFileName);) {

            properties.loadFromXML(input);

        } catch (NullPointerException | IOException exception) {
            throw new UtilityException("Properties file " + propertyFileName + " does not exist", exception);
        }
        return properties;
    }


}
