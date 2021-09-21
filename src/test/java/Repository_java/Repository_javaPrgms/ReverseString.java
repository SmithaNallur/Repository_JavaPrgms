package Repository_java.Repository_javaPrgms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString {
	public String reverseString(String input) {
		String reverse ="";
		String[] inputArray =input.split(" ");
		for(int i=inputArray.length-1;i>=0;i--) {
			reverse=reverse +inputArray[i]+" ";
			
			
		}
		System.out.println(reverse);
		return reverse;
		
		
	}
	@Test
	public void testCase1() {
	String input="Hello World";
	Assert.assertEquals(reverseString(input) ,"World Hello ");
		
		
		
	}

}
