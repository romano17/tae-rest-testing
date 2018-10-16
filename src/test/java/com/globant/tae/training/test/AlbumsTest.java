package com.globant.tae.training.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.hasSize;

/**
 * Created by roman on 10/15/18.
 */
public class AlbumsTest extends BaseTests {
    @Test
    public void albums() {
        when().
                get("/albums").
                then().
                statusCode(200).
                body("$", hasSize(100));

    }
}
