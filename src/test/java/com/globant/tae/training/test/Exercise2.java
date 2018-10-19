package com.globant.tae.training.test;

import com.globant.tae.training.resources.*;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

/**
 * Tests of exercise two:
 */
@Test(priority = 2)
public class Exercise2 {
    @DataProvider(name = "postsData")
    public Object[][] postsData() {
        return new Object[][]{
                {20, 2, "doloribus ad provident suscipit at"},
                {50, 5, "repellendus qui recusandae incidunt voluptates tenetur qui omnis exercitationem"},
                {100, 10, "at nam consequatur ea labore ea harum"}
        };
    }

    /**
     * Test that validates that response matches the json schema.
     */
    @Test
    public void validatePostsSchema() {
        String json = new PostResource().getJson();

        assertThat(json, matchesJsonSchemaInClasspath("posts-schema.json"));
    }

    /**
     * Test that validates that response matches the json schema.
     */
    @Test
    public void validateCommentsSchema() {
        String json = new CommentsResource().getJson();

        assertThat(json, matchesJsonSchemaInClasspath("comments-schema.json"));
    }

    /**
     * Test that validates that response matches the json schema.
     */
    @Test
    public void validateAlbumsSchema() {
        String json = new AlbumsResource().getJson();

        assertThat(json, matchesJsonSchemaInClasspath("albums-schema.json"));
    }

    /**
     * Test that validates that response matches the json schema.
     */
    @Test
    public void validatePhotosSchema() {
        String json = new PhotosResource().getJson();

        assertThat(json, matchesJsonSchemaInClasspath("photos-schema.json"));
    }

    /**
     * Test that validates that response matches the json schema.
     */
    @Test
    public void validateTodosSchema() {
        String json = new TodosResource().getJson();

        assertThat(json, matchesJsonSchemaInClasspath("todos-schema.json"));
    }

    /**
     * Test that validates that response matches the json schema.
     */
    @Test
    public void validateUsersSchema() {
        String json = new UsersResource().getJson();

        assertThat(json, matchesJsonSchemaInClasspath("users-schema.json"));
    }

    /**
     * Tests that get resource by id and verify that each property es equal to the values
     * passed by data provider
     */
    @Test(dataProvider = "postsData", priority = 2)
    public void getPostById(int id, int userId, String title) {
        JsonPath jsonPath = new PostResource().get(id);

        assertThat(jsonPath.getInt("id"), Matchers.equalTo(id));
        assertThat(jsonPath.getInt("userId"), Matchers.equalTo(userId));
        assertThat(jsonPath.getString("title"), Matchers.equalTo(title));

        System.out.printf("\nTest getPostsById(%d) , json: \n %s", id, jsonPath.prettify());

    }

    /**
     * Test that get comments resource using parameters
     */
    @Test(priority = 3)
    public void getCommentsWithParam() {
        JsonPath jsonPath = new CommentsResource().getByPostId(1);

        assertThat(jsonPath.getList("$"), hasSize(5));

        System.out.println(jsonPath.prettify());
    }

    /**
     * Test that get posts resource using parameters
     */
    @Test(priority = 4)
    public void getPostsWithParam() {
        JsonPath jsonPath = new PostResource().getByUserId(1);

        assertThat(jsonPath.getList("$"), hasSize(10));

        System.out.println(jsonPath.prettify());
    }
}
