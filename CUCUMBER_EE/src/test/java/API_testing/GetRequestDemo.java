package API_testing;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRequestDemo {

    public static void main(String[] args) {

        // Base URI
        RestAssured.baseURI = "https://gorest.co.in";

        System.out.println("============== GET REQUEST ==============");

        // GET Request
        Response getResponse = given()

                .when()
                .get("/public/v2/users/8056485");

        // Print Response
        System.out.println("Status Code : " + getResponse.getStatusCode());

        System.out.println("Response Body : ");
        System.out.println(getResponse.getBody().asString());

        System.out.println("Response Time : " + getResponse.getTime());

        System.out.println("Content Type : " + getResponse.getContentType());

        System.out.println("\n============== VALIDATIONS ==============");

        // Validations
        given()

                .when()
                .get("/public/v2/users/8056485")

                .then()
                .statusCode(200)
                .body("id", equalTo(8056485))
                .body("name", equalTo("Suresh Gupta"))
                .body("email", equalTo("gupta_suresh@mante.example"))
                .body("gender", equalTo("male"))
                .body("status", equalTo("active"))
                .time(lessThan(5000L))
                .header("Content-Type", containsString("application/json"))
                .log().all();

        System.out.println("\n============== JSON EXTRACTION ==============");

        // JSON Extraction
        JsonPath jsonPath = getResponse.jsonPath();

        int id = jsonPath.getInt("id");
        String name = jsonPath.getString("name");
        String email = jsonPath.getString("email");
        String gender = jsonPath.getString("gender");
        String status = jsonPath.getString("status");

        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
        System.out.println("Status : " + status);

        System.out.println("\n============== POST REQUEST ==============");

        // Request Body
        String postRequestBody = "{"
                + "\"user_id\":8477478,"
                + "\"title\":\"API Testing\","
                + "\"body\":\"Post created using RestAssured\""
                + "}";

        // Bearer Token
        String token = "YOUR_TOKEN";

        // POST Request
        Response postResponse = given()

                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(postRequestBody)

                .when()
                .post("/public/v2/posts");

        // Print Response
        System.out.println("Status Code : " + postResponse.getStatusCode());

        System.out.println("Response Body : ");
        System.out.println(postResponse.getBody().asString());

        // POST Validation
        postResponse.then()

                .statusCode(201)
                .body("id", notNullValue())
                .body("user_id", equalTo(8477478))
                .body("title", equalTo("API Testing"))
                .body("body", equalTo("Post created using RestAssured"))
                .log().all();

        // Extract Generated ID
        String generatedId = postResponse.jsonPath().getString("id");

        System.out.println("Generated ID : " + generatedId);

        System.out.println("\n============== PUT REQUEST ==============");

        // PUT Request Body
        String putRequestBody = "{"
                + "\"name\":\"P Karunakar\","
                + "\"email\":\"pkarunakar2205@gmail.com\","
                + "\"gender\":\"male\","
                + "\"status\":\"active\""
                + "}";

        given()

                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(putRequestBody)

                .when()
                .put("/public/v2/users/8056485")

                .then()
                .statusCode(200)
                .body("name", equalTo("P Karunakar"))
                .body("email", equalTo("pkarunakar2205@gmail.com"))
                .body("gender", equalTo("male"))
                .body("status", equalTo("active"))
                .log().all();

        System.out.println("\n============== DELETE REQUEST ==============");

        given()

                .header("Authorization", "Bearer " + token)

                .when()
                .delete("/public/v2/posts/" + generatedId)

                .then()
                .statusCode(204)
                .log().all();

        System.out.println("\n============== PATH PARAMETER ==============");

        given()

                .pathParam("id", 8056485)

                .when()
                .get("/public/v2/users/{id}")

                .then()
                .statusCode(200)
                .log().all();

        System.out.println("\n============== QUERY PARAMETER ==============");

        given()

                .queryParam("page", 1)

                .when()
                .get("/public/v2/users")

                .then()
                .statusCode(200)
                .log().all();

        System.out.println("\n============== PRINT HEADERS ==============");

        getResponse.getHeaders().forEach(System.out::println);

        System.out.println("\n============== PRINT COOKIES ==============");

        getResponse.getCookies().forEach(
                (k, v) -> System.out.println(k + " : " + v));

        System.out.println("\n============== TEST COMPLETED ==============");
    }
}