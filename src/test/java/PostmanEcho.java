import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEcho {

    @Test
    void shouldTestSomeData() {


        given()
                .baseUri("https://postman-echo.com")
                .body("phone")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("phone"))
        ;
    }
}
