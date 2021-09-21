package Repository_java.Repository_javaPrgms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumEvenGreaterOdd {
	public boolean SumEvenGreaterOdd(int input) {
		int lastdigit=0;
		int SumOfEven=0;
		int SumOfOdd=0;
		while(input!=0) {
			lastdigit=input%10;
			if(lastdigit%2==0) {
				SumOfEven+=lastdigit;
			}else {
				SumOfOdd+=lastdigit;
			}
			input=input/10;
			}
		if(SumOfEven>SumOfOdd) {
			return true;
			
		}else {
			return false;
		}
		
		
	}
	
	@Test
	public void testCase1() {
		int input=5421;
	Assert.assertFalse(SumEvenGreaterOdd(input));	
		
	}

	@Test
	public void testCase2() {
		int input=5621;
	Assert.assertTrue(SumEvenGreaterOdd(input));	
		
	}
	@Test
	public void testCase3() {
		int input=56201;
	Assert.assertTrue(SumEvenGreaterOdd(input));	
		
	}
}
