package com.globant.tae.training.resources;

import io.restassured.path.json.JsonPath;

public class PostResource extends BaseResource {

    public static final String POSTS_RESOURCE_PATH = "/posts";

    public int get() {
        return getStatusCode(POSTS_RESOURCE_PATH);
    }

    public String getJson() {
        return getJson(POSTS_RESOURCE_PATH);
    }

    public JsonPath get(int id) {
        return get(POSTS_RESOURCE_PATH, id);
    }

    public JsonPath getByUserId(int userId) {
        return getWithParam(POSTS_RESOURCE_PATH, "userId", String.valueOf(userId));
    }
}
