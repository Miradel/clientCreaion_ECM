package someOtherPackage;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class useOkHttp {
	
	public static void main(String[] args) throws IOException {
		
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		RequestBody body = RequestBody.create(mediaType, "timezoneOffset=240&ptmode=f&ptlangcd=ENG&ptinstalledlang=CFR%2CENG&userid=EG23562&pwd=password&ptlangsel=ENG");
		Request request = new Request.Builder()
		  .url("http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/?cmd=login&languageCd=ENG")
		  .post(body)
		  .addHeader("Content-Type", "application/x-www-form-urlencoded")
		   .addHeader("User-Agent", "PostmanRuntime/7.19.0")
		  .addHeader("Accept", "*/*")
		  .addHeader("Cache-Control", "no-cache")
		 .addHeader("Token", "c9a0d641-eb9b-4263-a1da-b93c0b71328c,51b92232-b894-476a-bf62-2f74a93fac24")
		  .addHeader("Accept-Encoding", "gzip, deflate")
		  .addHeader("Cookie", "ExpirePage=http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/; PS_LOGINLIST=http://misaixtst04.cgic.ca:8080/CRMDEV2; ps_theme=node:CRM portal:EMPLOYEE theme_id:DEFAULT_THEME_TANGERINE accessibility:N formfactor:3 piamode:2; PS_360=PS_360_BO_ID_CUST!825788234073996968703503641906!PS_360_CUST_SETID!CG001!PS_360_BO_ID_CONT!0!PS_360_BO_ID_SITE!0!PS_360_CUST_ROLE!9!PS_360_CONT_ROLE!0!PS_USERID!EG93052; misaixtst04-8080-PORTAL-PSJSESSIONID=wGUnnAIMNUNz2XPk4TCIkG0X2hiKoDEh!-605020398; PS_TOKENEXPIRE=1_Nov_2019_15:22:15_GMT; http%3a%2f%2fmisaixtst04.cgic.ca%3a8080%2fpsp%2fcrmdev2%2femployee%2fcrm%2frefresh=list: %3frp%3ddefault|%3ftab%3dremoteunifieddashboard|%3frp%3dremoteunifieddashboard||||; SignOnDefault=")
		  .addHeader("Referer", "http://misaixtst04.cgic.ca:8080/psp/CRMDEV2/?cmd=login&languageCd=ENG")
		  .addHeader("Connection", "keep-alive")
		  .addHeader("cache-control", "no-cache")
		  .build();

		Response response = client.newCall(request).execute();
		
		
		System.out.println(response.body().string());
		
		
	}

}
