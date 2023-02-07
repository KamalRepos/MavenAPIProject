import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITests
    {
        @Test
        void test1()
        {
           Response response = get("https://reqres.in/api/users?page=2");

            System.out.println("Response:" +response.asString());
            System.out.println("Response Status Code:" +response.getStatusCode());
            System.out.println("Response Body:" +response.getBody().asString());
            System.out.println("Time Taken:" +response.getTime());
            System.out.println("Header:" +response.getHeader("content-type"));

            int statusCode = response.getStatusCode();
            Assert.assertEquals(statusCode,200);

        }

        @Test
        void test2()
        {
            //BDD format
            given().get("https://reqres.in/api/users?page=2").then().statusCode(200);

        }
    }
