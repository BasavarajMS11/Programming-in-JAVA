package streamspack1;

import java.util.stream.*;
import java.util.Collections;
import java.util.*;


class NamePhoneEmail{
	
	String name;
	String phonenum;
	String email;
	public NamePhoneEmail(String name, String phonenum, String email) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.phonenum=phonenum;
		this.email=email;
	}
	public String toString() {
		return name+":"+phonenum+":"+email;
	}
}
class NamePhone{
	String name;
	String phonenum;
	public NamePhone(String name, String phonenum) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.phonenum=phonenum;
	}
	public String toString() {
		return name+":"+phonenum;
	}
}
public class StreamsDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<NamePhoneEmail> myList=new ArrayList<NamePhoneEmail>();
		
		myList.add(new NamePhoneEmail("aa", "12345", "a@b.com"));
		myList.add(new NamePhoneEmail("bb", "456534", "b@c.com"));
		myList.add(new NamePhoneEmail("cc", "54321", "c@d.com"));
		
		myList.stream().forEach((obj)-> System.out.println(obj));
		
		Stream<NamePhone> nameAndPhone= myList.stream().map((a)-> new NamePhone(a.name, a.phonenum));
		
		System.out.println("After map");
		
		nameAndPhone.forEach((a)-> {
			if(a.name.equals("aa"))System.out.println(a);});
	}

}
