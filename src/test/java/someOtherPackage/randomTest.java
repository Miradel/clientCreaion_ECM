package someOtherPackage;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class randomTest {
	
	public static void main(String[] args) {
		
//		 RestAssured.given().auth()
//			.basic("EG93052", "password")
//			.when().get("http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/?cmd=login&languageCd=ENG")
//			.then().assertThat().statusCode(200);
		 
		 
		 RestAssured.given()
			.when().get("http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/?cmd=login&languageCd=ENG")
			.then().assertThat().statusCode(200);
		 
		 
		 
		 RestAssured.baseURI = "http://misaixtst04.cgic.ca:8080/";
		 given().pathParam("Env", "CRMDEVM")
		.queryParam("cmd", "login")
		.queryParam("language", "ENG")
		.when().get("psp/{Env}")
		.then().statusCode(200);
		 
		 RestAssured.given().auth()
			.basic("EG93052", "password")
			.when().post("http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/?cmd=login&languageCd=ENG")
			.then().assertThat().statusCode(200);
		 
		 
		
	}

}
