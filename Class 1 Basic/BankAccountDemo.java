class BankAccount{

int accNo;
double accBal;
String custName;

BankAccount()
{
	accNo=0;
	accBal=0;
	custName="";

}

BankAccount(int no,double bal,String name)
{
	accNo=no;
	accBal=bal;
	custName=name;

}

public String toString()
{
	return "\nFrom the overridden function:"+"\nAccount No:"+accNo + " " + "\nAccount Bal:"+accBal + "\nCustomer Name:" + custName;
}

void printAccount()
{
	System.out.println("\nAccount No:"+accNo + " " + "\nAccount Bal:"+accBal + "\nCustomer Name:" + custName);
}


}

//Starter code
class BankAccountDemo{

public static void main(String[] args){

BankAccount ba1;
ba1=new BankAccount(1122,20000.0,"Ramesh");
ba1.printAccount();

//Without using the method->using overriding the built in method toString()
System.out.println(ba1);

}
}