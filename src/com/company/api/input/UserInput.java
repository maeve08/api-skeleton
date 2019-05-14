package com.company.api.input;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

    private static final Logger LOG = LogManager.getLogger(UserInput.class);

    public String getUserInput(String step) {

        String response = null;
        BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
        try {
            response = keyboardInput.readLine();
        } catch (IOException e) {
            LOG.error("Error in: "+ step + ". " + e.getMessage());
        }
        return response;
    }
}
