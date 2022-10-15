package api;

import io.restassured.http.ContentType;
import model.user.Root;
import model.user.Root2;

import static io.restassured.RestAssured.given;

public class ApiUser {
    public Root getUser(int id){
        return
                given().contentType(ContentType.JSON)
                        .baseUri("https://reqres.in/")
                        .get("api/users/" + id)
                        .then()
                        .statusCode(200)
                        .log().all()
                        .extract().response().as(Root.class);
    }
    public Root2 getUser(){
        return
                given().contentType(ContentType.JSON)
                        .baseUri("https://reqres.in/")
                        .get("/api/users?page=2")
                        .then()
                        .statusCode(200)
                        .log().all()
                        .extract().response().as(Root2.class);
    }
    public Root getUser404(){
        return
                given().contentType(ContentType.JSON)
                        .baseUri("https://reqres.in/")
                        .get("api/users/23" )
                        .then()
                        .statusCode(404)
                        .log().all()
                        .extract().response().as(Root.class);
    }
}
