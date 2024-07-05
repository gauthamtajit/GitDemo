import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class StreamIntegerSorting {

	@Test
	public void streamCollect()
	{
		List<Integer> values=Arrays.asList(3,2,2,3,4,5,6,7,8,8,7,9,8);
		//print unique number from array and sort the array
		
		//values.stream().distinct().forEach(s->System.out.println(s));	
		List<Integer> values1=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(values1.get(2));
		
	}
	
}