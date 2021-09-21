package Repository_java.Repository_javaPrgms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumPalindromeCheck {
	public boolean numPalindromeCheck(int input) {
		int temp=input;
		int reverse=0;
		boolean palindrome=false;
		
		while(temp!=0) {
			 int remainder=temp%10;
			 reverse=reverse*10+remainder;
			 temp=temp/10;
			
		}
		if(reverse==input) {
			
			System.out.println(input+" Number is Palindrone");
			return palindrome=true;
		}else {
			System.out.println(input+" Number is not a Palindrone");
			return palindrome;
		}
		
		
		
	}
	@Test 
	public void testCase1() {
		int input=121;
		Assert.assertTrue(numPalindromeCheck(input));
	}
	@Test 
	public void testCase2() {
		int input=120;
		Assert.assertFalse(numPalindromeCheck(input));
	}

}
