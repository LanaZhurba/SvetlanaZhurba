package Api;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    @DisplayName("Проверка запроса Get")
    public void checkGetRequest() {
        RestAssured
                .given()
                .when()
                    .get("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .then()
                    .log().all()
                    .statusCode(200)
                    .body("args.foo1", Matchers.equalTo("bar1"))
                    .body("args.foo2", Matchers.equalTo("bar2"))
                    .body("headers.host", Matchers.equalTo("postman-echo.com"))
                    .body("headers.x-request-start", Matchers.notNullValue())
                    .body("headers.connection", Matchers.equalTo("close"))
                    .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
                    .body("headers.x-forwarded-port", Matchers.equalTo("443"))
                    .body("headers.x-amzn-trace-id", Matchers.notNullValue())
                    .body("headers.accept", Matchers.equalTo("*/*"))
                    .body("headers.user-agent", Matchers.equalTo("Apache-HttpClient/4.5.3 (Java/11.0.2)"))
                    .body("headers.accept-encoding", Matchers.equalTo("gzip,deflate"))
                    .body("url", Matchers.equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }

    @Test
    @DisplayName("Проверка запроса Post1")
    public void checkPostRawTextRequest() {
       RestAssured
                .given().log().all()
                    .body("This is expected to be sent back as part of response body.")
                .when()
                    .post("https://postman-echo.com/post")
                .then()
                    .log().all()
                    .statusCode(200)
                    .body("data", Matchers.equalTo("This is expected to be sent back as part of response body."))
                    .body("headers.host", Matchers.equalTo("postman-echo.com"))
                    .body("headers.x-request-start", Matchers.notNullValue())
                    .body("headers.connection", Matchers.equalTo("close"))
                    .body("headers.content-length", Matchers.notNullValue())
                    .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
                    .body("headers.x-forwarded-port", Matchers.equalTo("443"))
                    .body("headers.x-amzn-trace-id", Matchers.notNullValue())
                    .body("headers.user-agent", Matchers.notNullValue())
                    .body("headers.accept", Matchers.equalTo("*/*"))
                    .body("headers.accept-encoding", Matchers.equalTo("gzip,deflate"))
                    .body("headers.content-type", Matchers.notNullValue())
                    .body("json",Matchers.nullValue())
                    .body("url", Matchers.equalTo("https://postman-echo.com/post"))
       ;
    }

    @Test
    @DisplayName("Проверка запроса Post2")
    public void checkPostFormDataRequest() {
        RestAssured
                .given().log().all()
                    .body("")
                .when()
                    .post("https://postman-echo.com/post")
                .then()
                    .log().all()
                    .statusCode(200)
                    .body("data", Matchers.equalTo(""))
                    .body("headers.host", Matchers.equalTo("postman-echo.com"))
                    .body("headers.x-request-start", Matchers.notNullValue())
                    .body("headers.connection", Matchers.equalTo("close"))
                    .body("headers.content-length", Matchers.notNullValue())
                    .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
                    .body("headers.x-forwarded-port", Matchers.equalTo("443"))
                    .body("headers.x-amzn-trace-id", Matchers.notNullValue())
                    .body("headers.user-agent", Matchers.notNullValue())
                    .body("headers.accept", Matchers.equalTo("*/*"))
                    .body("headers.accept-encoding", Matchers.equalTo("gzip,deflate"))
                    .body("headers.content-type", Matchers.notNullValue())
                    .body("url", Matchers.equalTo("https://postman-echo.com/post"));
    }

    @Test
    @DisplayName("Проверка запроса Put")
    public void checkPutRequest() {
        RestAssured
                .given().log().all()
                    .body("This is expected to be sent back as part of response body.")
                .when()
                    .put("https://postman-echo.com/put")
                .then()
                    .log().all()
                    .statusCode(200)
                    .body("data", Matchers.equalTo("This is expected to be sent back as part of response body."))
                    .body("headers.host", Matchers.equalTo("postman-echo.com"))
                    .body("headers.x-request-start", Matchers.notNullValue())
                    .body("headers.connection", Matchers.equalTo("close"))
                    .body("headers.content-length", Matchers.notNullValue())
                    .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
                    .body("headers.x-forwarded-port", Matchers.equalTo("443"))
                    .body("headers.x-amzn-trace-id", Matchers.notNullValue())
                    .body("headers.content-type",Matchers.notNullValue())
                    .body("headers.user-agent", Matchers.notNullValue())
                    .body("headers.accept", Matchers.equalTo("*/*"))
                    .body("headers.accept-encoding", Matchers.equalTo("gzip,deflate"))
                    .body("json", Matchers.nullValue())
                    .body("url", Matchers.equalTo("https://postman-echo.com/put"));
    }

    @Test
    @DisplayName("Проверка запроса Patch")
    public void checkPatchRequest() {
        RestAssured
                .given().log().all()
                    .body("This is expected to be sent back as part of response body.")
                .when()
                    .patch("https://postman-echo.com/patch")
                .then()
                    .log().all()
                    .statusCode(200)
                    .body("data", Matchers.equalTo("This is expected to be sent back as part of response body."))
                    .body("headers.host", Matchers.equalTo("postman-echo.com"))
                    .body("headers.x-request-start", Matchers.notNullValue())
                    .body("headers.connection", Matchers.equalTo("close"))
                    .body("headers.content-length", Matchers.notNullValue())
                    .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
                    .body("headers.x-forwarded-port", Matchers.equalTo("443"))
                    .body("headers.x-amzn-trace-id", Matchers.notNullValue())
                    .body("headers.content-type",Matchers.notNullValue())
                    .body("headers.user-agent", Matchers.notNullValue())
                    .body("headers.accept", Matchers.equalTo("*/*"))
                    .body("headers.accept-encoding", Matchers.equalTo("gzip,deflate"))
                    .body("json", Matchers.nullValue())
                    .body("url", Matchers.equalTo("https://postman-echo.com/patch"));
    }

    @Test
    @DisplayName("Проверка запроса Delete")
    public void checkDeleteRequest() {
        RestAssured
                .given().log().all()
                    .body("This is expected to be sent back as part of response body.")
                .when()
                    .delete("https://postman-echo.com/delete")
                .then()
                    .log().all()
                    .statusCode(200)
                    .body("data", Matchers.equalTo("This is expected to be sent back as part of response body."))
                    .body("headers.host", Matchers.equalTo("postman-echo.com"))
                    .body("headers.x-request-start", Matchers.notNullValue())
                    .body("headers.connection", Matchers.equalTo("close"))
                    .body("headers.content-length", Matchers.notNullValue())
                    .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
                    .body("headers.x-forwarded-port", Matchers.equalTo("443"))
                    .body("headers.x-amzn-trace-id", Matchers.notNullValue())
                    .body("headers.content-type",Matchers.notNullValue())
                    .body("headers.user-agent", Matchers.notNullValue())
                    .body("headers.accept", Matchers.equalTo("*/*"))
                    .body("headers.accept-encoding", Matchers.equalTo("gzip,deflate"))
                    .body("json", Matchers.nullValue())
                    .body("url", Matchers.equalTo("https://postman-echo.com/delete"));
    }
}
