package javaprogramming;

import org.testng.annotations.Test;


@Test
public class AudioBook extends Librarybooks{
private int runduration;
	
	AudioBook(String Title,String  Author, String Publisher,int runduration)
	{
		super(Title,Author,Publisher);
		this.runduration = runduration;
		
	}
	
}
