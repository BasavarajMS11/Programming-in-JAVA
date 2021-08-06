package CollectionPackage;

import java.util.*;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Non generic
		ArrayList list1=new ArrayList();
		list1.add(10);
		list1.add("kletech");
		list1.add(10L);
		
		System.out.println(list1);
		
		//Generic
		ArrayList<Integer> mylist1=new ArrayList<Integer>();
		
		mylist1.add(10);
		mylist1.add(20);
		mylist1.add(30);
		mylist1.add(40);
		mylist1.add(50);
		
		Iterator itr1=mylist1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("From iterator");
		for(Integer data:mylist1) {
			System.out.println(data);
		}
		

	}

}
