package streamspack1;

import java.util.stream.*;

import java.util.*;
import java.util.Collections;
public class StreamDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> myList=new ArrayList<Integer>();
		
		myList.add(7);
		myList.add(10);
		myList.add(18);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		Stream<Integer> myStream=myList.stream();
		
		//using Optional object
		Optional<Integer> productVal= myStream.reduce((a,b) -> a*b);
		
		if(productVal.isPresent()) {
			System.out.println(productVal.get());
			
		}
		
		// using simple variable
		int x= myList.stream().reduce(1, (a,b)-> a*b);
		
		System.out.println("product:"+x);
		
		
	}

}

