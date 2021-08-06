import java.util.Scanner;

public class StringDemo{

public static void main(String[] args){

String s1="hello";
String s2="How are you?";
System.out.println(s1);
System.out.println(s2);

String s3="hello";
String s4= new String("hello"); //heap

//checking the memory address not the content
System.out.println(s1==s3);//True
System.out.println(s1==s4);//False

System.out.println(s1.equals(s4));

//Immutable
s1.concat("Java");
System.out.println(s1);//hello

//Reference assigning
s1=s1.concat("Java");
System.out.println(s1);//helloJava

//Different methods in String
//variable.endsWith("character")
System.out.println(s1.endsWith("a"));//true

//isEmpty
System.out.println(s2.isEmpty());//false


//trim ->removes whitespaces
String s5="  KLETECH  ";
System.out.println(s5);//  KLETECH  
System.out.println(s5.trim());//KLETECH

//Make string as mutable
StringBuffer s6=new StringBuffer("KLE");
System.out.println(s6);
s6.append("SoCSE");
System.out.println(s6);



}

}