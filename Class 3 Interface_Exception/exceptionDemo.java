package sync3package;
import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeInputException extends Exception{
	
	private static final long serialVersionUID = 1L;
	int errNo;
	String errorMessage;
	
	NegativeInputException(){
		
	}
	NegativeInputException(int errNo,String errorMessage){
		this.errNo=errNo;
		this.errorMessage=errorMessage;
	}
	
	public String toString() {
		return errNo+":"+errorMessage;
	}
	
	void showError() {
		System.out.println(errNo+":"+errorMessage);
	}
	
	
}

class Quotient{
	int getQuotient(int num1,int num2)throws IllegalAccessException,NegativeInputException {
		if(num2==0)
			throw new NegativeInputException(1234,"Num2 Cannot be zero");
		else if (num1<0 || num2<0)
			throw new IllegalAccessException("num1 or num2 cannot be less than zero");
		else
			return num1/num2;
		//throw ThrowableInstance (Not an run time exception)
	}
}

public class exceptionDemo {

	public static void main(String[] args)throws IllegalAccessException,NegativeInputException {
		// TODO Auto-generated method stub
		int num1,num2,result=0;
		Scanner sc=  new Scanner(System.in);
		
		System.out.println("Enter num1 and num2");
		
		Quotient qObj=new Quotient();

		try {
			num1=sc.nextInt();
			num2=sc.nextInt();
			result=qObj.getQuotient(num1,num2);
			System.out.println("Result:"+result);
		}
		catch(IllegalArgumentException iae) {
			System.out.println("Enter non zero and positive value for num2");
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("num2 cannot be zero:");
		}/*
		catch(InputMismatchException ime) {
			System.out.println(ime.getMessage());
			System.out.println("num2 should be integer value:");
		}*/
		catch(IllegalAccessException iae)
		{
			System.out.println("Enter non zero and positive value for num2");
		}
		
		catch(NegativeInputException  nie)
		{
			System.out.println("Enter non zero for num2");
			System.out.println(nie);
			nie.showError();
		}
		
		/*
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("num2 should be integer value:");
		}*/
		
		finally {
			System.out.println("Finally Called");
		}
		
		

	}

}
