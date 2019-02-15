package UseString;
public class UseString {
public static void main(String[] args) {
		
		String str = "A sentence";
		String str2 = " Another sentence ";
		char ch1 = str.charAt(0);
		
		//String class methods
		System.out.println("1: " + "Character at 0 index is: "+ch1);
		System.out.println("2: " +str.toLowerCase());
		System.out.println("3: " +str.toUpperCase());
		
		for(int i=0; i<=str.length()-1; i++) {
			System.out.println(" 4: " + str.charAt(i));
		}
		
		System.out.println("5: " +"str equals to str2:"+str.equals(str2));
		System.out.println("6: " +"str equals to A sentence:"+str.equals("A sentence"));
		System.out.println("7:" + "str equals to hello:"+str.equals("hello"));
	    System.out.println(" 8: " + "String before trim: "+str2);
	    System.out.println(" 8: " + "String after trim: "+str2.trim());
	    System.out.println("9: " + "Hash Code for String str: "+str.hashCode());	  
	    System.out.println("10: " + "Index of B in str: "+str.indexOf('s'));
	    System.out.println("11: " + "Index of B in str after 15th char:"+str.indexOf('s', 3));
		System.out.println("12: " + str.isEmpty());  
		String str3 = String.join( "*","hello","world");  
		System.out.println("13: " +str3);
		System.out.println("14: " + str.length());
		System.out.println("15: " + str.replace(" ", "").length());
		
	   }
	

	}



