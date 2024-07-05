import java.util.ArrayList;

import org.testng.annotations.Test;

public class Streams {
	
	@Test
	public void StreamFilter() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhi");
		names.add("Don");
		names.add("Gautham");
		names.add("Anjali");
		names.add("Arpana");
	//	int count=0;
		
	/*	for(int i=0;i<names.size();i++) {
			
			String actual=names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		
		System.out.println(count); */
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c); 

	}

}
