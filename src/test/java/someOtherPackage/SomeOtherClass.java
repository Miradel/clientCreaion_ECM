package someOtherPackage;


import io.restassured.RestAssured;
//import okhttp3.Response;
import io.restassured.response.Response;

import org.junit.Assert;
//import org.junit.Test;

public class SomeOtherClass {

	public static void main(String[] args) {
		
		
		System.out.println("Api is Starting");
		
		
	  Response response = RestAssured.get("https://uinames.com/api/");
	  		
	//Response response = RestAssured.get("https://api.got.show/api/cities/{Braavos}");
//		
//		
	//	System.out.println( response.getStatusCode());
//		
//		
		response.prettyPrint();
		System.out.println("----------------------------------------------------------------------------");
		response.then().log().all();
			
		
	}
	

	
	
	

}
