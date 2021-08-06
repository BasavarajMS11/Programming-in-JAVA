package streamspack1;

import java.util.stream.*;
import java.util.*;

public class StreamDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> myList = new ArrayList<>( );
		myList.add(1.1);
		myList.add(3.6);
		myList.add(9.2);
		myList.add(4.7);
		myList.add(12.1);
		myList.add(5.0);
		System.out.print("Original values in myList: ");
		myList.stream().forEach( (a) -> {
		System.out.print(a + " ");
		});
		System.out.println();
		// Map the ceiling of the elements in myList to an IntStream.
		IntStream cStrm = myList.stream().mapToInt((a) -> (int) Math.ceil(a));
		System.out.print("The ceilings of the values in myList: ");
		cStrm.forEach( (a) -> {
		System.out.print(a + " ");
		});

		System.out.println();
		
		System.out.println("After adding 10 to list values");
		
		cStrm = myList.stream().mapToInt((a) -> (int) Math.ceil(a));
		cStrm.forEach( (a) -> {
			System.out.print((a+10) + " ");
			});
	}
}
