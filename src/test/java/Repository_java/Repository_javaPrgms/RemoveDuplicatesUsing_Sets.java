package Repository_java.Repository_javaPrgms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveDuplicatesUsing_Sets {
	
	public String removeDuplicates(int[] input){
		
		Set<Integer> intSet=new LinkedHashSet<>();
		for(int i=0;i<=input.length-1;i++) {
			intSet.add(input[i]);
			
		}
		StringBuffer sb=new StringBuffer();
		
		for(int num:intSet) {
		sb.append(num+",");	
			
		}
		return sb.toString();
		}
	@Test
	public void testCase1(){
		int[] input= {2,3,4,5,4,6,7,5,5};
		Assert.assertEquals(removeDuplicates(input), "2,3,4,5,6,7,");
	}

}
