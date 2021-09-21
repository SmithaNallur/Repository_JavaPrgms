package Repository_java.Repository_javaPrgms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountPalidromeWords {
	public int countPalin(String input) {
		String[] inputwords=input.toLowerCase().split(" ");
		//String reverse="";
		int count=0;
		for(String word:inputwords) {
			String reverse="";
			for(int i=word.length()-1;i>=0;i--) {
			reverse=reverse+word.charAt(i);
				
			}
			if(reverse.equals(word)) {
				count++;
				
			}
			
		}
		
		return count;
	}
	@Test
	public void testCase1() {
		String input="Madam teaches malayalam";
		Assert.assertEquals(countPalin(input),2);
	}
	@Test
	public void testCase2() {
		String input="teaches";
		Assert.assertEquals(countPalin(input),0);
	}

}
