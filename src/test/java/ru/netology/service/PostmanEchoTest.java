package ru.netology.service;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void checkingPOSTRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi") // отправляемые данные

                // Выполняемые действия
                .when().log().all()
                .post("/post")

                // Проверки
                .then().log().all()
                .statusCode(200)
                .body("data", equalTo("Hi"))
        ;
    }
}
