package someOtherPackage;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class quaryParam {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://uinames.com/api";
		
		/*
		 // given ==> prepare requestss
            given().

        // the submit request
           when().get().

        // then verify response
        // statusCode ==> verify the status code
        then().statusCode(200);
		 */
		
		// Get the two user info
//		given().queryParam("amount", "2")
//		.when().get().prettyPrint();
		
		// set the region and gender, amount of the user
		given().queryParam("region", "Canada")
		.queryParam("amount", "2")
		.queryParam("gender", "female")
		.when().get().prettyPrint();
		
		// testing status code 
		given().when().get().then().statusCode(201);
		
		
	}

	

	

}
