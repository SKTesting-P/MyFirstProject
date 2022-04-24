package sample1;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Count_Characters
{

	@Test
	public void sample()
	{
		String str="abcabcabcdefghdehgs";
		
		HashMap<Character, Integer> hmp =new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			Character ch = str.charAt(i);
			if(hmp.containsKey(ch))
			{
				hmp.put(ch, hmp.get(ch)+1);
			}
			else
			{
				hmp.put(ch, 1);
			}
		}
		
		hmp.entrySet();
		System.out.println(hmp);
	}
	
	@Test
	public void sample1()
	{
		String str="abcabcabcdefghdehgs";
		
		
	}
	
}
