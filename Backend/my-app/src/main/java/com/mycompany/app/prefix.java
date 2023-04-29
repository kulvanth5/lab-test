package com.mycompany.app;

public class prefix {
 
    public static String main(String s,String prefix)
    {
        String result;
        
		System.out.println(s);
		
		result = prefix + " ";
		
		for(int i=0;i<s.length();i++){
			
			if( s.charAt(i) == '\n' )
				result = result + '\n' + prefix;
				
			else
				result = result + s.charAt(i);
		}
		
		System.out.println(result);
		return result;
}
}
