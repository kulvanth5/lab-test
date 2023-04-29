package com.example.demo;

import org.springframework.web.bind.annotation.*;
import com.mycompany.app.*;
import java.util.*;

//RestController and GetMapping are built-in
@RestController 
public class DemoController //Annotating entire class to be a part of RestController
{
	//@PostMapping("/")
	/*public String print(@RequestBody Map<String,String> data)
	{
		String str = data.get("pal_input");
		Palindrome ob = new Palindrome();
		String subStr = ob.answer(str);
		return subStr;
	}*/
	
	@PostMapping("/")
	public String print(@RequestBody Map<String,String> input){
	
		String data = (String)input.get("data");
		//String options = input.get("options");

		/*List<String> options = new ArrayList<>();
		
		options.add(input.get("options"));

		if(options.get(0) == "-c"){
			caseconvert obj = new caseconvert();
			String result = obj.main(data,options.get(1));
			return result;
		}
		
		else if( options.get(0) == "-e" ){
			encryption obj = new encryption();
			String result = obj.main(data,(String)options.get(1));
			return result;	
		}*/
		
		//if( options.get(0) == "-a" ){
			assci obj= new assci();
			String result = obj.main(data);
			return result;
		//}
		
		/*else if( options.get(0) == "-p"){
			prefix obj = new prefix();
			String result = obj.main(data,(String)options.get(1));
			return result;
		}*/
						
	}
}

/*
1. Go to where mvnw file is there and type ./mvnw spring-boot:run
   
3. Controller is a servlet that runs continuously waiting for Request.
*/
