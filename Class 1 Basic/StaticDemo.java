import java.util.Scanner;

//Shared memory by the variables
public class Static{

	static int a=2;
	static int b=4;

	static void print()
	{

		System.out.println("Static Method");
		//showData()//Error: Non static methods inside static Cannot be called

	}

	void showData()
	{
		System.out.println("a:"+a+"\tb:"+b);
		print();//Static methods can be accessed in non static methods
	}

}

public class StaticDemo{

public static void main(String[] args){

	System.out.println(Static.a);
	//Static.showData();//Static from non static
	Static.print();//Static

	}

}