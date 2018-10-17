package com.globant.tae.training.test;

import com.globant.tae.training.resources.SearchResource;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class Exercise3 {
    /**
     * Property to store authorization token
     */
    private String authorization;

    /**
     * Read authorization token from system properties
     */
    @BeforeTest
    public void beforeTest() {
        authorization = System.getProperty("testAuth");
    }

    /**
     * Test that get resource using headers and parameters
     */
    @Test
    public void searchWithParams() {

        String json = new SearchResource(authorization).search("qa", "publish_6847");

        assertThat(json, notNullValue());

        System.out.printf("Test: searchWithParams, json: %s", json);

    }
}
