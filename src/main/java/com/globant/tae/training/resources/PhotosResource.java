package com.globant.tae.training.resources;

public class PhotosResource extends BaseResource {

    public static final String PHOTOS_RESOURCE_PATH = "/photos";

    public int get() {
        return getStatusCode(PHOTOS_RESOURCE_PATH);
    }

    public String getJson() {
        return getJson(PHOTOS_RESOURCE_PATH);
    }
}
