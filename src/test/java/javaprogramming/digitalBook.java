package javaprogramming;

import org.testng.annotations.Test;


@Test
public class digitalBook extends Librarybooks {

	public String digitalbookforamt;
	
	digitalBook(String Title,String  Author, String Publisher,String digitalbookforamt)
{
	 super(Title,Author,Publisher);
	 this.digitalbookforamt = digitalbookforamt;
}
}
