package com.santander.developergames.redcatopensphere.quarkuschallenge;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BookshopResourceTest {

    @Test
    public void testBooksEndpoint() {
        given()
          .when().get("/books")
          .then()
             .statusCode(200);
    }

    @Test
    public void testBooksByNameEndpoint() {
        given()
          .when().get("/books/byName/Sapiens")
          .then()
             .statusCode(200);
    }

    @Test
    public void testBooksByPublicationYearBetweenEndpoint() {
        given()
          .when().get("/books/byPublicationYearBetween/1979/1980")
          .then()
             .statusCode(200);
    }
}