package collections;

import java.util.List;
import java.util.Set;

@FunctionalInterface
public interface Function {
	Set<Adults> adultsFiltered();
	 static int totalSalary(Set<Adults> adults) 
	    { 
		 int sum=adults.stream().reduce(0,(a,b)->a+(int)b.getAdultSalary(),Integer::sum);
		 return sum;

	    } 
	  

}
