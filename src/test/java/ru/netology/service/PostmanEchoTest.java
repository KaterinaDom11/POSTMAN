package ru.netology.service;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void checkingPOSTRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные

                // Выполняемые действия
                .when()
                .post("/post")

                // Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("some value"))
        ;
    }
}
