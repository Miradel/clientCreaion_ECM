package someOtherPackage;

import org.junit.BeforeClass;
import org.junit.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class bodyVerify {
	
		@BeforeClass
		public void setUp() {
		
		RestAssured.baseURI = "https://uinames.com/api";

		}


    @Test
    public void testBody(){

        given()
                .when()
                .get()
                // body("name" --> first param is locator,get the value from the response
                //second value will be the matcher
                .then().assertThat().body("name", notNullValue());
		
		
	}
    
    @Test
    public void verifyNumberOfResults(){

        given().queryParam("amount",2)
                .when().get()
                .then().assertThat().body("amount",hasSize(3));


    }
    

}
