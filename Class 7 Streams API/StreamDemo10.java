package streamspack1;

import java.util.stream.*;
import java.util.*;

class NamePhoneEmail1{
	
	String name;
	String phonenum;
	String email;
	public NamePhoneEmail1(String name, String phonenum, String email) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.phonenum=phonenum;
		this.email=email;
	}
	public String toString() {
		return name+":"+phonenum+":"+email;
	}
}
class NamePhone1{
	String name;
	String phonenum;
	public NamePhone1(String name, String phonenum) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.phonenum=phonenum;
	}
	public String toString() {
		return name+":"+phonenum;
	}
}
public class StreamDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<NamePhoneEmail1> myList=new ArrayList<NamePhoneEmail1>();
		
		myList.add(new NamePhoneEmail1("aa", "12345", "a@b.com"));
		myList.add(new NamePhoneEmail1("bb", "456534", "b@c.com"));
		myList.add(new NamePhoneEmail1("cc", "54321", "c@d.com"));
		
		myList.stream().forEach((obj)-> System.out.println(obj));
		
		Stream<NamePhone1> nameAndPhone= myList.stream().map((a)-> new NamePhone1(a.name, a.phonenum));
		
		
		List<NamePhone1> newList= nameAndPhone.collect(Collectors.toList());
		
		//From list
		System.out.println("From List");
		for(NamePhone1 e: newList) {
			System.out.println(e);
		}
		
		nameAndPhone= myList.stream().map((a)-> new NamePhone1(a.name, a.phonenum));
		
		//From set
		System.out.println("From Set(Unordered)");
		Set<NamePhone1> newSet=nameAndPhone.collect(Collectors.toSet());
		for(NamePhone1 e: newSet) {
			System.out.println(e);
		}
	}

}

