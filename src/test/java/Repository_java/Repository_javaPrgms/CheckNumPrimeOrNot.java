package Repository_java.Repository_javaPrgms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckNumPrimeOrNot {
	
	public boolean checkPrime(int input) {
		boolean isPrime=false;
		for(int i=2;i<=input;i++) {
			if(input%i==0) {
				if(i==input) {
					isPrime=true;
					System.out.println(input+" is a prime number");
				}else {
					isPrime=false;
					System.out.println(input+" is not a prime number");
					break;
				}
				}
				
			}
		return isPrime;
		}
	@Test
	public void testCase1() {
		int input=7;
		Assert.assertTrue(checkPrime(input));
		
	}
		
	@Test
	public void testCase2() {
		int input=9;
		Assert.assertFalse(checkPrime(input));
		
	}
		
	}


