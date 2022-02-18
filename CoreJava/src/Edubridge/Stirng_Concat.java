package Edubridge;

public class Stirng_Concat {
public static void main (String[]args)
{
	String s = "welcome ";
	s.concat("to edubridge;");
	System.out.println(s);
	StringBuffer v = new StringBuffer("welcome ");
	v.append("to edubridge;");
	System.out.println(v);
	
}
}
