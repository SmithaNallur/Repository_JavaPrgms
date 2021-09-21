package Repository_java.Repository_javaPrgms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveChar {
	public String removeCharFromString(String input,char ch) {
		
		String inputlow=input.toLowerCase();
		String output=inputlow.replace(Character.toString(ch),"");
		System.out.println(output);
		return output;
		
}
	@Test
	public void testCase1() {
		String input="I Like Coding";
		char ch='i';
		Assert.assertEquals(removeCharFromString(input,ch)," lke codng");
		
	}
	

}
