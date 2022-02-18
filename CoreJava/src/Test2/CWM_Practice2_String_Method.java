package Test2;

public class CWM_Practice2_String_Method {
	public static void main(String[] args) {
		String name = "Mrinmoy";
//		String a1 = "Mrinmoy"
		int value = name.length();
//		System.out.println(name)
		System.out.println(value);
		
		String lstring = name.toLowerCase();
		System.out.println(lstring);
	   String ustring = name.toUpperCase();
	   System.out.println(ustring);
	   
//	   .trim(); StringMethod 
	   
	   String nonTrimmedString = "    Mrinmoy";
	   System.out.println(nonTrimmedString);
//	   System.out.println(nonTrimmedString.trim());
	   String trimmedString = nonTrimmedString.trim();
	   System.out.println(trimmedString);
	   
//	   .substring(0); StringMethod:---
	   
	   
System.out.println(name.substring(5));
System.out.println(name.substring(2,6));

// name. replace(); String Method:----


System.out.println(name.replace('i','t'));
System.out.println(name.replace("n","ier" ));
 
// name.startsWith and name.endWith String Mehod:----

System.out.println(name.startsWith("Mr"));
System.out.println(name.startsWith("mi"));
System.out.println(name.endsWith("i"));


// name.charAt(); StringMethod:--- 

System.out.println(name.charAt(5));

//  name.indexOf(); StringMethod:---
String modifiedName = "Mrinmooy"
System.out.println(modifiedName.indexOf("rry));
	}
	

}
