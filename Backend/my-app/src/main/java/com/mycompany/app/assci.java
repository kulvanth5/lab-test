package com.mycompany.app;

public class assci {
 
    public static String main(String s)
    {

        String result = "";
        
        for(int i=0;i<s.length();i++){
        
        	if( (int)s.charAt(i) >= 32 && (int)s.charAt(i) <= 126 )
        		result = result + (int)s.charAt(i) + " ";
        }
        
        System.out.println(s+" is converted to "+result);
        
//        	return "";
		return result;
}
}
