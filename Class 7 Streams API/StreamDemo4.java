package streamspack1;

import java.util.stream.*;
import java.util.Optional;
import java.util.Collections;
import java.util.*;

public class StreamDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> myList=new ArrayList<Integer>();
		
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		System.out.println("Data:"+myList);
		Iterator<Integer> itr=myList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Stream<Integer> myStream = myList.stream();
		
		System.out.println("Directly from stream for each");
		
		myStream.forEach((n)-> System.out.println(n));
		
		
		myStream=myList.stream();
		Optional<Integer> minVal = myStream.min(Integer::compare);
		if(minVal.isPresent()) 
			System.out.println("Minimum value: " + minVal.get());	
	
		myStream=myList.stream();
		Optional<Integer> maxVal = myStream.max(Integer::compare);
				if(maxVal.isPresent()) 
			System.out.println("Minimum value: " + maxVal.get());	

		Stream<Integer> sortedStream=myList.stream().sorted();
		
		System.out.println("sorted stream:");
		sortedStream.forEach((n)-> System.out.println(n));
		
		Stream<Integer> oddVals=myList.stream().filter((n)-> (n%2==1));
		
		oddVals.forEach((n)->System.out.println(n));
		
		oddVals=myList.stream().filter((n)-> (n%2==1)).filter((n)->(n>5));

		oddVals.forEach((n)-> System.out.println(n));
		
	}

}
