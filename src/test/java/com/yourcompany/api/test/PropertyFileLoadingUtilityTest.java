package com.yourcompany.api.test;

import com.yourcompany.api.PropertyFileLoadingUtility;
import com.yourcompany.api.exception.UtilityException;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertNotNull;

/**
 * Created by bpupadhyaya on 6/9/16.
 */
public class PropertyFileLoadingUtilityTest {

    /**
     * Test to check whether xml property file is empty.
     * @throws UtilityException
     */
    @Test
    public void testLoadXMLPropertiesEmpty() throws UtilityException {
        Properties properties = PropertyFileLoadingUtility.loadXMLProperties("configuration.xml");
        assertNotNull(properties);
    }

    /**
     * Test not well formed input file.
     * @throws UtilityException
     */
    @Test(expected = UtilityException.class)
    public void testLoadXMLPropertiesNotWellFormed() throws UtilityException {
        Properties properties = PropertyFileLoadingUtility.loadXMLProperties("configuration.properties");
        assertNotNull(properties);
    }

}
