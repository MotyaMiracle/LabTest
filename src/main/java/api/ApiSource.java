package api;

import io.restassured.http.ContentType;
import model.source.RootSource;
import model.source.RootSourceSingle;

import static io.restassured.RestAssured.given;

public class ApiSource {
    public RootSource getSource(){
        return
                given().contentType(ContentType.JSON)
                        .baseUri("https://reqres.in/")
                        .get("/api/unknown")
                        .then()
                        .statusCode(200)
                        .log().all()
                        .extract().response().as(RootSource.class);
    }
    public RootSourceSingle getSourceSingle(){
        return
                given().contentType(ContentType.JSON)
                        .baseUri("https://reqres.in/")
                        .get("/api/unknown/2")
                        .then()
                        .statusCode(200)
                        .log().all()
                        .extract().response().as(RootSourceSingle.class);
    }
    public RootSource getSource404(){
        return
                given().contentType(ContentType.JSON)
                        .baseUri("https://reqres.in/")
                        .get("/api/unknown/23")
                        .then()
                        .statusCode(404)
                        .log().all()
                        .extract().response().as(RootSource.class);
    }
}
