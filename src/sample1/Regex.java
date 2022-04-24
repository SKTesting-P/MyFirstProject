package sample1;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Regex
{
	@Test
	public void main() 
	{
	
		String str = "abcd123efgh4567!@#$./]";
		
		// To remove all non numeric characters
		System.out.println(str.replaceAll("[^\\d]*", ""));
		
		// To remove all numeric characters
		System.out.println(str.replaceAll("[\\d]", ""));
		
		// To remove all special characters
		System.out.println(str.replaceAll("[,./;'!@#$%^&*]", ""));
		System.out.println(str.replaceAll("[\\W]", ""));
	
		// To remove all non numeric characters
		System.out.println(str.replaceAll("[\\D]", ""));
		System.out.println(str.replaceAll("[^0-9]", ""));
	
		// To remove any word characters
		System.out.println(str.replaceAll("[\\w]", ""));
		System.out.println(str.replaceAll("[a-zA-Z0-9]", ""));
		System.out.println(str.replaceAll("[a-z]*[A-Z][0-9]", ""));
		
		// To remove all non characters
		System.out.println(str.replaceAll("[\\W]", ""));
	
	}
}
