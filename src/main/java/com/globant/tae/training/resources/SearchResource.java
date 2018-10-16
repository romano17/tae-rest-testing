package com.globant.tae.training.resources;

import io.restassured.RestAssured;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class SearchResource {
    private String authValue;

    static {
        RestAssured.baseURI = "https://gp_search.grey.com/gp_searchapi";
    }

    public SearchResource(String authValue) {
        this.authValue = authValue;
    }

    public String search(String user, String password) {
        HashMap<String, String> params = new HashMap<>();
        params.put("u", user);
        params.put("q", password);
        params.put("d", "id");
        params.put("p", "t");
        params.put("c", "t");
        params.put("s", "publish");
        params.put("m", "all");
        return given().header("Authorization", authValue).with().params(params).when().get("/search").then().extract().jsonPath().prettify();
    }
}
