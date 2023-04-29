package com.mycompany.app;

public class encryption {
 
    public static String main(String s,String r)
    {
        int temp , shift = 2;
        String result = "";
        
        for(int i=0;i<s.length();i++){
        
        	temp = (int)s.charAt(i);
        	
        	if( (temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122) )
        		temp = temp + shift;
        		
        	result = result + (char)temp;
        }
        
       // System.out.println(s+" is converted to "+result);
        
//        	return "";
		return result;
}
}
