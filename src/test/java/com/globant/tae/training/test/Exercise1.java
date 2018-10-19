package com.globant.tae.training.test;

import com.globant.tae.training.resources.*;
import org.apache.http.HttpStatus;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests that validate the code response of all the resources published at https://jsonplaceholder.typicode.com/
 */
@Test(priority = 1)
public class Exercise1 {
    private int statusCode;

    @AfterMethod
    public void beforeMethod(Method method) {
        System.out.printf("Test name: %s. Status code: %d \n", method.getName(), statusCode);
    }

    /**
     * Calls REST API of posts resources and verify that the returned status code is equal to 200
     */
    public void posts() {
        statusCode = new PostResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }

    /**
     * Calls REST API of albums resource and verify that the returned status code is equal to 200
     */
    public void albums() {
        statusCode = new AlbumsResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }

    /**
     * Calls REST API of comments resources and verify that the returned status code is equal to 200
     */
    public void comments() {
        statusCode = new CommentsResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }

    /**
     * Calls REST API of todos resources and verify that the returned status code is equal to 200
     */
    public void todos() {
        statusCode = new TodosResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }

    /**
     * Calls REST API of photos resources and verify that the returned status code is equal to 200
     */
    public void photos() {
        statusCode = new PhotosResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }

    /**
     * Calls REST API of users resources and verify that the returned status code is equal to 200
     */
    public void users() {
        statusCode = new UsersResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }
}
