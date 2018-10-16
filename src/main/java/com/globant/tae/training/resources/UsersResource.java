package com.globant.tae.training.resources;

public class UsersResource extends BaseResource {

    public static final String USERS = "/users";
    public static final String USERS_RESOURCE_PATH = USERS;

    public int get() {
        return getStatusCode(USERS_RESOURCE_PATH);
    }

    public String getJson() {
        return getJson(USERS_RESOURCE_PATH);
    }
}
