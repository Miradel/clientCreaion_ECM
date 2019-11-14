package someOtherPackage;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class addressTest {
	
	public static void main(String[] args) {
							 //http://misaixtst04.cgic.ca:8080/psc/CRMDEV2/EMPLOYEE/CRM/c/RB_MANAGE_CUSTOMER_INFORMATION.RD_PERSON.GBL
		//RestAssured.baseURI = "http://misaixtst04.cgic.ca:8080/psc/CRMDEV2/EMPLOYEE/CRM/c/RB_MANAGE_CUSTOMER_INFORMATION.RD_PERSON.GBL";
		
//		RestAssured.given().header("", "")
//		 .header("Content-Type", "application/x-www-form-urlencoded")
//		  .header("User-Agent", "PostmanRuntime/7.19.0")
//		  .header("Accept", "*/*")
//		  .header("Cache-Control", "no-cache")
//		  .header("Postman-Token", "3182e71c-4424-477f-b5fd-cd123cd77f58,3d29246b-9273-4bca-ba24-3df0d186d72f")
//		  .header("Host", "misaixtst04.cgic.ca:8080")
//		  .header("Accept-Encoding", "gzip, deflate")
//		  .header("Content-Length", "1128")
//		  .header("Cookie", "SignOnDefault=EG93052; misaixtst04-8080-PORTAL-PSJSESSIONID=yI0kpjB45gO1QjKsVct2nvWHL5jUEc8H!-605020398; ExpirePage=http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/; PS_LOGINLIST=http://misaixtst04.cgic.ca:8080/CRMDEV2; ps_theme=node:CRM portal:EMPLOYEE theme_id:DEFAULT_THEME_TANGERINE accessibility:N formfactor:3 piamode:2; PS_360=PS_360_BO_ID_CUST!823945676357999906103287072409!PS_360_CUST_SETID!CG001!PS_360_BO_ID_CONT!0!PS_360_BO_ID_SITE!0!PS_360_CUST_ROLE!9!PS_360_CONT_ROLE!0!PS_USERID!EG93052; PS_TOKEN=AAAAqAECAwQAAQAAAAACvAAAAAAAAAAsAARTaGRyAgBOdQgAOAAuADEAMBT2LevpBoypNdjvAR7/hdu6i3br4gAAAGgABVNkYXRhXHicHYs7DoAwDENfC2Jk4hqg0pbfDKgTjKycgttxOFwS6dmOHOAxtigxaOybWbOTWAg4BnyleJIaVl1vhZVDusldEa9Sr3IrOjFIs5/p9Bx/jmJueSbtwgexagwZ; http%3a%2f%2fmisaixtst04.cgic.ca%3a8080%2fpsp%2fcrmdev2%2femployee%2fcrm%2frefresh=list: %3frp%3ddefault|%3ftab%3dremoteunifieddashboard|%3frp%3dremoteunifieddashboard; PS_TOKENEXPIRE=1_Nov_2019_03:07:02_GMT")
//		  .header("Connection", "keep-alive")
//		  .header("cache-control", "no-cache")
//		  .queryParam("ICNAVTYPEDROPDOWN", "1")
//		  .queryParam("ICType", "Panel")
//		  .queryParam("ICElementNum", "0")
//		  .queryParam("ICAction", "QPW_VERI_WRK_QPW_SEARCH&ICXPos=0")
//		  .queryParam("ICYPos", "0")
//		  .queryParam("ResponsetoDiffFrame", "-1")
//		  .queryParam("TargetFrameName", "None")
//		  .queryParam("FacetPath", "None")
//		  .queryParam("ICFocus", "")
//		  .queryParam("ICSaveWarningFilter", "0")
//		  .queryParam("ICChanged", "1")
//		  .queryParam("ICAutoSave", "0")
//		  .queryParam("ICResubmit", "0")
//		  .queryParam("ICSID", "eUCwhMcYUzi4ZzX6BuEOGdh5ENTQC%2Bz49SUFoXXmadU%3D")
//		  .queryParam("ICActionPrompt", "false")
//		  .queryParam("ICBcDomData", "C~CR_RD_PERSON_GBL~EMPLOYEE~CRM~RB_MANAGE_CUSTOMER_INFORMATION.RD_PERSON.GBL~UnknownValue~Add Person~UnknownValue~UnknownValue~http://misaixite01.cgic.ca:6100/psp/decmsu1/EMPLOYEE/CRM/c/RB_MANAGE_CUSTOMER_INFORMATION.RD_PERSON.GBL~UnknownValue*F~CR_CUSTOMER~EMPLOYEE~CRM~UnknownValue~UnknownValue~Customers CRM~UnknownValue~UnknownValue~http://misaixite01.cgic.ca:6100/psp/decmsu1/EMPLOYEE/CRM/s/WEBLIB_PT_NAV.ISCRIPT1.FieldFormula.IScript_PT_NAV_INFRAME?pt_fname=CR_CUSTOMER&c=ng0LqrHF2LGXfOxh%2bza1ajYlXi4QN20o&FolderPath=PORTAL_ROOT_OBJECT.CR_CUSTOMER&IsFolder=true~UnknownValue")
//		  .queryParam("QPW_VERI_WRK_QPW_FLAT_LINE1", "8420 Eva Blvd")
//		  .queryParam("QPW_VERI_WRK_QPW_FLAT_LINE4", "Niagara Falls")
//		  .queryParam("QPW_VERI_WRK_QPW_FLAT_LINE5", "ON")
//		  .when().post("http://misaixtst04.cgic.ca:8080/psc/CRMDEV2/EMPLOYEE/CRM/c/RB_MANAGE_CUSTOMER_INFORMATION.RD_PERSON.GBL")
//		  .then().log().all().statusCode(201);
		
		
		RestAssured.given()
		 .header("Content-Type", "application/x-www-form-urlencoded")
//		  .header("User-Agent", "PostmanRuntime/7.19.0")
//		  .header("Accept", "*/*")
//		  .header("Cache-Control", "no-cache")
//		  .header("Postman-Token", "3182e71c-4424-477f-b5fd-cd123cd77f58,3d29246b-9273-4bca-ba24-3df0d186d72f")
//		  .header("Host", "misaixtst04.cgic.ca:8080")
//		  .header("Accept-Encoding", "gzip, deflate")
//		  .header("Content-Length", "1128")
//		  .header("Cookie", "SignOnDefault=EG93052; misaixtst04-8080-PORTAL-PSJSESSIONID=yI0kpjB45gO1QjKsVct2nvWHL5jUEc8H!-605020398; ExpirePage=http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/; PS_LOGINLIST=http://misaixtst04.cgic.ca:8080/CRMDEV2; ps_theme=node:CRM portal:EMPLOYEE theme_id:DEFAULT_THEME_TANGERINE accessibility:N formfactor:3 piamode:2; PS_360=PS_360_BO_ID_CUST!823945676357999906103287072409!PS_360_CUST_SETID!CG001!PS_360_BO_ID_CONT!0!PS_360_BO_ID_SITE!0!PS_360_CUST_ROLE!9!PS_360_CONT_ROLE!0!PS_USERID!EG93052; PS_TOKEN=AAAAqAECAwQAAQAAAAACvAAAAAAAAAAsAARTaGRyAgBOdQgAOAAuADEAMBT2LevpBoypNdjvAR7/hdu6i3br4gAAAGgABVNkYXRhXHicHYs7DoAwDENfC2Jk4hqg0pbfDKgTjKycgttxOFwS6dmOHOAxtigxaOybWbOTWAg4BnyleJIaVl1vhZVDusldEa9Sr3IrOjFIs5/p9Bx/jmJueSbtwgexagwZ; http%3a%2f%2fmisaixtst04.cgic.ca%3a8080%2fpsp%2fcrmdev2%2femployee%2fcrm%2frefresh=list: %3frp%3ddefault|%3ftab%3dremoteunifieddashboard|%3frp%3dremoteunifieddashboard; PS_TOKENEXPIRE=1_Nov_2019_03:07:02_GMT")
//		  .header("Connection", "keep-alive")
//		  .header("cache-control", "no-cache")
		//  .queryParam("ICNAVTYPEDROPDOWN", "1")
		//  .queryParam("ICType", "Panel")
		//  .queryParam("ICElementNum", "0")
		//  .queryParam("ICAction", "QPW_VERI_WRK_QPW_SEARCH&ICXPos=0")
		//  .queryParam("ICYPos", "0")
		//  .queryParam("ResponsetoDiffFrame", "-1")
		//  .queryParam("TargetFrameName", "None")
		//  .queryParam("FacetPath", "None")
		//  .queryParam("ICFocus", "")
		//  .queryParam("ICSaveWarningFilter", "0")
		//  .queryParam("ICChanged", "1")
		//  .queryParam("ICAutoSave", "0")
		//  .queryParam("ICResubmit", "0")
		//  .queryParam("ICSID", "eUCwhMcYUzi4ZzX6BuEOGdh5ENTQC%2Bz49SUFoXXmadU%3D")
		//  .queryParam("ICActionPrompt", "false")
		//  .queryParam("ICBcDomData", "C~CR_RD_PERSON_GBL~EMPLOYEE~CRM~RB_MANAGE_CUSTOMER_INFORMATION.RD_PERSON.GBL~UnknownValue~Add Person~UnknownValue~UnknownValue~http://misaixite01.cgic.ca:6100/psp/decmsu1/EMPLOYEE/CRM/c/RB_MANAGE_CUSTOMER_INFORMATION.RD_PERSON.GBL~UnknownValue*F~CR_CUSTOMER~EMPLOYEE~CRM~UnknownValue~UnknownValue~Customers CRM~UnknownValue~UnknownValue~http://misaixite01.cgic.ca:6100/psp/decmsu1/EMPLOYEE/CRM/s/WEBLIB_PT_NAV.ISCRIPT1.FieldFormula.IScript_PT_NAV_INFRAME?pt_fname=CR_CUSTOMER&c=ng0LqrHF2LGXfOxh%2bza1ajYlXi4QN20o&FolderPath=PORTAL_ROOT_OBJECT.CR_CUSTOMER&IsFolder=true~UnknownValue")
		  .queryParam("QPW_VERI_WRK_QPW_FLAT_LINE1", "8420 Eva Blvd")
		  .queryParam("QPW_VERI_WRK_QPW_FLAT_LINE4", "Niagara Falls")
		//  .queryParam("QPW_VERI_WRK_QPW_FLAT_LINE5", "ON")
		  .when().post("http://misaixtst04.cgic.ca:8080/psc/CRMDEV2/EMPLOYEE/CRM/c/RB_MANAGE_CUSTOMER_INFORMATION.RD_PERSON.GBL")
		  .then().log().all().statusCode(200);
	
		  
		  
		
		
		
		
		
	}

}
