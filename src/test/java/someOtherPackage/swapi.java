package someOtherPackage;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class swapi {
	
	
	public static void main(String[] args) {
		
		//RestAssured.baseURI = "https://swapi.co/api/people";
		
//		Response rs = RestAssured.get("https://swapi.co/api/people");
//		
//		rs.prettyPrint();
	
		List<Integer> arr = new ArrayList();
		arr.add(1); arr.add(2);  arr.add(3); arr.add(4);
		
		System.out.println(subArraySum2(arr));
		
		
	}
	
	public static long subArraySum(List<Integer> arr) {
		
		   long result = 0; 
	       int n = arr.size();
	        for (int i=0; i<n; i++) {
	            result += (arr.get(i) * (i+1) * (n-i)); 
	        }
	        return result ; 
		
	}
	
	
	 public static long subArraySum2( List<Integer> arr ) {
	    
	        long result = 0; 
	        int  n = arr.size();
	        // Pick starting point 
	        for (int i = 0; i < n; i ++){  
	            for (int j = i; j < n; j ++) { 
	                for (int k = i; k <= j; k++) {
	                    result += arr.get(k) ; 
	                }
	            } 
	        } 
	        return result ; 
	    } 

}
