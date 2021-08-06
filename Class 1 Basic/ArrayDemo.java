import java.util.Scanner;

public class ArrayDemo{

public static void main(String[] args){

int[] a;
a=new int[5];

System.out.println("Enter array values:");
Scanner sc=new Scanner(System.in);

for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}

System.out.println("\nEntered Array Values are:\n");

for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}


//Without using the method->using overriding the built in method toString()


}

}