package com.globant.tae.training.resources;

public class TodosResource extends BaseResource {

    public static final String TODOS_RESOURCE_PATH = "/todos";

    public int get() {
        return getStatusCode(TODOS_RESOURCE_PATH);
    }

    public String getJson() {
        return getJson(TODOS_RESOURCE_PATH);
    }
}
