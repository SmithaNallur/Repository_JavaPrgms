package Repository_java.Repository_javaPrgms;



import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveDuplicatesUsingHashMap
{
	public String removeDuplicates(int[] input){
	
	

		Map<Integer,Integer> mapCount=new LinkedHashMap<>();
		for(int i=0;i<=input.length-1;i++){
		int count=mapCount.containsKey(input[i])? mapCount.get(input[i]):0;
		mapCount.put(input[i],count+1);


		}
		StringBuilder sb=new StringBuilder();

		for(Entry<Integer,Integer> entry:mapCount.entrySet()){
		

		sb.append(entry.getKey()+",");
		}


		
		return sb.toString();

		}

		@Test
		public void testCase1(){
			int[] input= {2,3,4,5,4,6,7,5,5};
			Assert.assertEquals(removeDuplicates(input), "2,3,4,5,6,7,");


		}


		
		
		

}
