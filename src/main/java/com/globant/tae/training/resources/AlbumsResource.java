package com.globant.tae.training.resources;

public class AlbumsResource extends BaseResource {

    public static final String ALBUMS_RESOURCE_PATH = "/albums";

    public int get() {
        return getStatusCode(ALBUMS_RESOURCE_PATH);
    }

    public String getJson() {
        return getJson(ALBUMS_RESOURCE_PATH);
    }
}
