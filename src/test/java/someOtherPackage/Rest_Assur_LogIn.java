package someOtherPackage;

import io.restassured.RestAssured;

public class Rest_Assur_LogIn {
	
	public static void main(String[] args) {
		
		// Log in with resAssured 
		String body = "{\\r\\n              \\\"timezoneOffset\\\": 240,\\r\\n              \\\"ptmode\\\": \\\"f\\\",\\r\\n              \\\"ptlangcd\\\": \\\"ENG\\\",\\r\\n              \\\"required\\\": true,\\r\\n              \\\"ptinstalledlang\\\": \\\"CFR,ENG\\\",\\r\\n              \\\"userid\\\": \\\"EG93052\\\",\\r\\n              \\\"pwd\\\": \\\"password\\\",\\r\\n              \\\"ptlangsel\\\": \\\"ENG\\\",\\r\\n\\t      \\\"cmd\\\": \\\"login\\\",\\r\\n              \\\"languageCd\\\": \\\"ENG\\\" \\r\\n            }";
		RestAssured.given()
				 	//.body("timezoneOffset=240&ptmode=f&ptlangcd=ENG&ptinstalledlang=CFR%2CENG&userid=EG93052&pwd=password&ptlangsel=ENG")
//				 	.queryParam("pwd", "password")
//				 	.queryParam("userid", "EG93052")
					.body(body)
//					.param("pwd","password")
//					.param("timezoneOffset", "240")
//					.param("ptmode", "f")
//					.param("ptlangcd", "ENG")
//					.param("ptinstalledlang", "CFR,ENG")
//					.param("ptlangsel", "ENG")
//				 	.param("cmd", "login")
//				 	.param("languageCd", "ENG")
					.when().post("http://misaixtst04.cgic.ca:8080/psp/CRMDEV2")
					.prettyPrint();
		
		
	}

}
