package Edubridge;

public class StringOperation {

	public static void main(String[] args)
	{
	 String name1 = "Welcome to Edubridge";
	 String name2 = "Welcome to Edubridge";
	 System.out.println(name1.length());
	 System.out.println(name1.charAt(5));
	 System.out.println(name1.equals(name2));
	 System.out.println(name1.equalsIgnoreCase(name2));
	 System.out.println(name1.toLowerCase());
	 System.out.println(name1.toUpperCase());
	 System.out.println(name1.replace('E', 'a'));
	 System.out.println(name1.substring(5)); 
	 System.out.println(name1.indexOf('g'));
	 System.out.println(name1.lastIndexOf('e'));
	 System.out.println(name1.substring(5,9));
     System.out.println(name1.split(" ")[1]);
     System.out.println(name1.split(" ")[0]);
	}

}
 