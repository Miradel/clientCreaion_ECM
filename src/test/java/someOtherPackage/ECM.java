package someOtherPackage;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.junit.Assert;
import co.poynt.postman.PostmanCollectionRunner;
import co.poynt.postman.PostmanHttpResponse;
import co.poynt.postman.PostmanRunResult;

public class ECM {
	
	
	public static void main(String[] args) throws Exception {
		
		// {{ECMURL}}/psp/{{ECMURL2}}/?cmd=login&languageCd=ENG
		
				// Rest-Assured mode to log in 
//				Response rs = RestAssured.get("http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/?cmd=login&languageCd=ENG");
//				
//				// System.out.println(   rs.statusCode()  );
//				 
//				 // Open the page with adding Query parameter
//				 RestAssured.baseURI = "http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/";
//				 given().queryParam("cmd", "login")
//				.queryParam("language", "ENG")
//				.when().get()
//				.then().statusCode(200);
//				 
//				 //System.out.println(     );
//				// System.out.println(  rs.then().log().all().statusCode(200) );
//		
//				 
//				 // Open the page with adding Path parameter
//				 RestAssured.baseURI = "http://misaixtst04.cgic.ca:8080/";
//				 given().pathParam("Env", "CRMDEV2")
//				.when().get("psp/{Env}?cmd=login&LanguageCd=ENG")
//				.then().statusCode(200);
//				 
//				 
//				 // Open the page with adding Path and Query parameter
//				 RestAssured.baseURI = "http://misaixtst04.cgic.ca:8080/";
//				 given().pathParam("Env", "CRMDEV2")
//				.queryParam("cmd", "login")
//				.queryParam("language", "ENG")
//				.when().get("psp/{Env}")
//				.then().statusCode(200);
//				
//				 /*
//				  RestAssured.given()
//                .auth().basic("admin","admin")
//                .when().get("https://the-internet.herokuapp.com/basic_auth")
//                .then().assertThat().statusCode(200);	  
//				  */
////				
//				 
//				 // Log in to ECM with valid UserName and Password
//				 RestAssured.given().auth()
//				.basic("EG93052", "password")
//				.when().get("http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/?cmd=login&languageCd=ENG")
//				.prettyPrint();
		//		.then().assertThat().statusCode(200);
				 
//				 System.out.println("---------------------------");
		
		//timezoneOffset=240&ptmode=f&ptlangcd=ENG&ptinstalledlang=CFR%2CENG&userid=EG93052&pwd=password22&ptlangsel=ENG
				 
		
		        // RestAssured.baseURI = "http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/?cmd=login&languageCd=ENG";
		
		// Log in with resAssured 
//		String body = "{\\r\\n              \\\"timezoneOffset\\\": 240,\\r\\n              \\\"ptmode\\\": \\\"f\\\",\\r\\n              \\\"ptlangcd\\\": \\\"ENG\\\",\\r\\n              \\\"required\\\": true,\\r\\n              \\\"ptinstalledlang\\\": \\\"CFR,ENG\\\",\\r\\n              \\\"userid\\\": \\\"EG93052\\\",\\r\\n              \\\"pwd\\\": \\\"password\\\",\\r\\n              \\\"ptlangsel\\\": \\\"ENG\\\",\\r\\n\\t      \\\"cmd\\\": \\\"login\\\",\\r\\n              \\\"languageCd\\\": \\\"ENG\\\" \\r\\n            }";
//		RestAssured.given()
//				 	//.body("timezoneOffset=240&ptmode=f&ptlangcd=ENG&ptinstalledlang=CFR%2CENG&userid=EG93052&pwd=password&ptlangsel=ENG")
////				 	.queryParam("pwd", "password")
////				 	.queryParam("userid", "EG93052")
//					.body(body)
////					.param("pwd","password")
////					.param("timezoneOffset", "240")
////					.param("ptmode", "f")
////					.param("ptlangcd", "ENG")
////					.param("ptinstalledlang", "CFR,ENG")
////					.param("ptlangsel", "ENG")
////				 	.param("cmd", "login")
////				 	.param("languageCd", "ENG")
//					.when().post("http://misaixtst04.cgic.ca:8080/psp/CRMDEV2")
//					.prettyPrint();
		
		
				PostmanCollectionRunner cr = new PostmanCollectionRunner();
				
				//cr.runCollection("C:\\Users\\XG04467\\Documents\\Eclipse-Workspace\\clinetCreation_ECM\\ECM2.json", "C:\\Users\\XG04467\\Documents\\Eclipse-Workspace\\clinetCreation_ECM\\En2.json", "", true);
		
				PostmanRunResult result = cr.runCollection(
						"LoooginRedo.postman_collection.json",
						"Dev.postman_environment.json",
						null, false);
				
				System.out.println(result);
				
				boolean isSuc = cr.runCollection(
						"LoooginRedo.postman_collection.json",
						"Dev.postman_environment.json",
						"postmanfolder", false).isSuccessful();
				
				
				boolean isSuccessful = cr.runCollection(
						"classpath:LoooginRedo.postman_collection.json",
						"classpath:Dev.postman_environment.json",
						"", false).isSuccessful();
			
				
				
				System.out.println(isSuccessful);
				
				
				
		      // cr.runCollection(colFilename, envFilename, folderName, haltOnError)
				
			  // cr.runCollection("ECM2.json", null, "Documents", true);
			   
			  //PostmanRunResult prr = new PostmanRunResult();
					
	          //cr.runCollection("ECM2.json", "En2.json", "", true);
	
	   		 		
	}
	
	public void testRunPostman() throws Exception {
		PostmanCollectionRunner cr = new PostmanCollectionRunner();
		
	//	cr.runCollection(colFilename, envFilename, folderName, haltOnError)
		
		cr.runCollection("resources/Client Creation Both_C.postman_collection.json", "Environemtn.json", "C:\\Users\\XG04467\\AppData\\Local\\Postman", true);

		boolean isSuccessful = cr.runCollection(
				"classpath:C:\\Users\\XG04467\\Documents\\ECM2.json",
				"classpath:MyTestCollection.postman_environment",
				"My use cases", false).isSuccessful();
		
		Assert.assertTrue(isSuccessful);
	}

}
