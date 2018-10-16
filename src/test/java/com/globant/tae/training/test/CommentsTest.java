package com.globant.tae.training.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.hasSize;

/**
 * Created by roman on 10/15/18.
 */
public class CommentsTest extends BaseTests {

    @Test
    public void comments() {
        when().
                get("/comments").
                then().
                statusCode(200).
                body("$", hasSize(500));

    }
}
