package com.britenet.util;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Slf4j
public class LoadProperty {
    public static String loadProperty(String propertyName) {

        try (InputStream input = new FileInputStream("env.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty(propertyName);


        } catch (IOException ex) {
            log.error(ex.getLocalizedMessage());
            return "PROPERTY_NOT_FOUND";
        }


    }
}
