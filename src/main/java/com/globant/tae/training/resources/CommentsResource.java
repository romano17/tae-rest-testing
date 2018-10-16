package com.globant.tae.training.resources;

import io.restassured.path.json.JsonPath;

public class CommentsResource extends BaseResource {

    public static final String COMMENTS_RESOURCE_PATH = "/comments";

    public int get() {
        return getStatusCode(COMMENTS_RESOURCE_PATH);
    }

    public String getJson() {
        return getJson(COMMENTS_RESOURCE_PATH);
    }

    public JsonPath getByPostId(int postId) {
        return getWithParam(COMMENTS_RESOURCE_PATH, "postId", String.valueOf(postId));
    }
}
