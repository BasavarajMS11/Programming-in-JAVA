package streamspack1;

import java.util.stream.*;
import java.util.*;

public class StreamDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> myList=new ArrayList<Double>();
		
		myList.add(7.0);
		myList.add(18.0);
		myList.add(10.0);
		myList.add(24.0);
		myList.add(17.0);
		myList.add(5.0);
		
		
		Stream<Double> myStream=myList.stream().map((a)-> Math.sqrt(a) );
		//myStream.close();
		
		myStream.forEach((a)-> System.out.println(a));
		//the stream is closed,again create and open
		
		
		myStream=myList.stream().map((a)-> Math.sqrt(a) );
		
		double prodSquareRoot=myStream.reduce(1.0,  (a,b) -> a*b);
		
		
		//To show list is not affected after streams
		Iterator<Double> itr=myList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Product:"+prodSquareRoot);
		
	}

}
