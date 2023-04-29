package com.mycompany.app;

public class caseconvert {
 
    public static String main(String s,String c)
    {
        int temp;
        String result = "";
        
        for(int i=0;i<s.length();i++){
        
        	if( c == "lower" ){
        	
				if( (int)s.charAt(i) >=65 && (int)s.charAt(i) <= 90){
					temp = (int)s.charAt(i) + 32;
					result = result + (char)temp;
				}
					
				else
					result = result + s.charAt(i);
			}
			
			else if(c == "upper"){
				
				if( (int)s.charAt(i) >=97 && (int)s.charAt(i) <= 122){
					temp = (int)s.charAt(i) - 32;
					result = result + (char)temp;
				}
				
				else
					result = result + s.charAt(i);
					
			}
        }
        
//        	return "";
			return result;
}
}
