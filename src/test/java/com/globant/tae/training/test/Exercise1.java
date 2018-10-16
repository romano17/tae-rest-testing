package com.globant.tae.training.test;

import com.globant.tae.training.resources.*;
import org.apache.http.HttpStatus;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by roman on 10/15/18.
 */
public class Exercise1 extends BaseTests {
    private int statusCode;

    @AfterMethod
    public void beforeMethod(Method method) {
        System.out.printf("Test name: %s. Status code: %d \n", method.getName(), statusCode);
    }

    @Test
    public void posts() {
        statusCode = new PostResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }
    @Test
    public void albums() {
        statusCode = new AlbumsResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }
    @Test
    public void comments() {
        statusCode = new CommentsResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }

    @Test
    public void todos() {
        statusCode = new TodosResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }

    @Test
    public void photos() {
        statusCode = new PhotosResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }

    @Test
    public void users() {
        statusCode = new UsersResource().get();
        assertThat(statusCode).isEqualTo(HttpStatus.SC_OK);
    }
}
