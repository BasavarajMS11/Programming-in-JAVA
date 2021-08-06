package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;


public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> mylist1=new ArrayList<String>();
		
		mylist1.add("kletech");
		mylist1.add("kleit");
		mylist1.add("bvbcet");
		mylist1.add("ait");
		mylist1.add("sdmcet");
		
		System.out.println(mylist1);
		
		mylist1.set(3, "bvbcet");
		System.out.println(mylist1);
		
		/*
		mylist1.remove(3);
		System.out.println(mylist1);
		*/
		ArrayList<String> mylist2=new ArrayList<String>(mylist1);
		
		System.out.println(mylist2);
		

		ArrayList<String> mylist3=new ArrayList<String>();

		mylist3.add("kletech");
		mylist3.add("pesit");
		mylist3.add("ramiah");
		mylist3.add("reva");
		mylist3.add("rv");
		
		mylist1.addAll(mylist3);
		
		System.out.println(mylist1);
		
		mylist1.removeAll(mylist3);
		
		System.out.println(mylist1);
		
		

	}

}
