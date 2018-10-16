package com.globant.tae.training.resources;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;

import static io.restassured.RestAssured.given;

public class BaseResource {
    static {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    public int getStatusCode(String path) {
        return getResponse(path).statusCode();
    }

    protected String getJson(String path) {
        return getResponse(path).asString();
    }

    public ExtractableResponse getResponse(String path) {
        return given().
                when().
                get(path).
                then().
                extract();
    }

    public JsonPath get(String path, int id) {
        return getResponse(path + "/" + id).jsonPath();
    }

    protected JsonPath getWithParam(String path, String paramName, String paramValue) {
        return given().with().param(paramName, paramValue).when().get(path).then().extract().jsonPath();
    }


}
