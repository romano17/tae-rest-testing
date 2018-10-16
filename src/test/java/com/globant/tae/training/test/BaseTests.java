package com.globant.tae.training.test;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class BaseTests {

    @BeforeSuite
    public void beforeSuite() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
