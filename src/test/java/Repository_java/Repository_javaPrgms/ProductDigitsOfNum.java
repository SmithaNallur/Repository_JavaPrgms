package Repository_java.Repository_javaPrgms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDigitsOfNum {
	public int productNum(int input) {
		int lastNum=0;
	int	product=1;
		while(input!=0) {
			lastNum=input%10;
			product=product*lastNum;
			input=input/10;
			
		}
		System.out.println("Product is "+product);
		return product;
		
		
		
	}
	
	@Test
	public void testCase1() {
		int input=6571;
		Assert.assertEquals(productNum(input),210);
		
	}

}
