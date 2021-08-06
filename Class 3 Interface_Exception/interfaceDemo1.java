package sync3package;

interface Payable{
	double getPaymentAmount();
}

class Employee implements Payable{
	int empId;
	String firstName;
	String lastName;
	Employee(){}
	Employee(int empId,String firstName,String lastName)
	{
		this.empId=empId;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
}

class SalariedEmployee extends Employee{
	double weeklySalary;
	SalariedEmployee(int empId,String firstName,String lastName,double weeklySalary){
		super(empId,firstName,lastName);
		this.weeklySalary=weeklySalary;
	}
	public double getPaymentAmount()
	{
		return weeklySalary;
	}	
	
}

class Invoice implements Payable{
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	
	Invoice(){}
	Invoice(String partNumber,String partDescription,int quantity,double price){
		this.partNumber=partNumber;
		this.partDescription=partDescription;
		this.quantity=quantity;
		this.price=price;
	}
	public double getPaymentAmount()
	{
		return quantity*price;
	}
}

public class interfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payable p;
		SalariedEmployee se=new SalariedEmployee(1001,"aaa","bbb",10000);
		
		p=se;//assigned object of class which implemented that interface
		System.out.println(p.getPaymentAmount());
		
		Invoice iv=new Invoice("p01","part",10,100);
	    p=iv;
		System.out.println(p.getPaymentAmount());
		
	}

}
