package accountpackage;

class BankAccount{

int accNo;
double accBal;
String custName;
long mobile[];

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
	mobile=new long[2];
	mobile[0]=123456789;
	mobile[1]=10987654321L;

}

public String toString()
{
	return "\nAccount No:"+accNo + " " + "\nAccount Bal:"+accBal + "\nCustomer Name:" + custName+"\nMobile No:"+mobile[0]+" and "+mobile[1] ;
}

void debitAmount(double amt) {
	System.out.println("Yet to Implement");
}

void creditAmount(double amt) {
	System.out.println("Yet to Implement");
}

void printAccount()
{
	System.out.println("\nAccount No:"+accNo + " " + "\nAccount Bal:"+accBal + "\nCustomer Name:" + custName);
}

}

class SavingsAccount extends BankAccount{
	
	int noOfTrans;
	double penaltyAmount;
	
	SavingsAccount(){
		super();
	}
	
	SavingsAccount(int no,double bal,String name,int noOfTrans,double penaltyAmount){
		super(no,bal,name);
		this.noOfTrans=noOfTrans;
		this.penaltyAmount=penaltyAmount;
	}
	
	public String toString()
	{
		return super.toString()+"\nNo of Transaction:"+this.noOfTrans+"\nPenalty Amount:"+this.penaltyAmount ;
	}
	
	void debitAmount(double amt){
		if(noOfTrans<=5) {
			if(amt>=0 && amt<=(accBal-1000)) {
				accBal-=amt;
				noOfTrans++;
			}
			else {
				System.out.println("\nEnter Correct Amount");
			}
		}
		else {
			System.out.println("\nNumber of transactions exceed");
			penaltyAmount+=50;
			noOfTrans=0;
			
		}
	}
	void creditAmount(double amt) {
		System.out.println("\nCredit Amount");
		this.accBal+=amt;
	}
	
	
}

class CurrentAccount extends BankAccount{
	
	CurrentAccount(){
		super();
	}
	CurrentAccount(int no,double bal,String name,int noOfTrans,double penaltyAmount){
		super(no,bal,name);
	}
	
	void debitAmount(double amt) {
		this.accBal-=amt;
	}
	
	void creditAmount(double amt) {
		this.accBal+=amt;
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	
}

public class BankAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba=new BankAccount();
		
		SavingsAccount sa=new SavingsAccount(1111,2000,"Basavaraj",0,0);
		System.out.println(sa);
		
		/*
		sa.debitAmount(500);
		System.out.println(sa);
		sa.debitAmount(500);
		System.out.println(sa);
		sa.debitAmount(500);
		System.out.println(sa);
		*/
		ba=sa; //Run time polymorphism is restricted pointer
		//sa=ba
		ba.creditAmount(1000); //base class reference to call subclass methods
		System.out.println(sa);
		
		Object obj=ba;
		System.out.println(obj);
		
		//obj.creditAmount(1000); //Base class Object has no knowledge about subclass
		
		((SavingsAccount)(obj)).creditAmount(1000);
		System.out.println(obj);
		
		//Array of base class variables for subclass objects
		
	    BankAccount[] accounts= {new SavingsAccount(1212,3000,"aaa",0,0),new CurrentAccount(2121,4000,"bbb",0,0)};
	    
	    for(int i=0; i<accounts.length;i++) {
	    	System.out.println(accounts[i]);	
	    }
	    for(int i=0; i<accounts.length;i++) {
	    	accounts[i].creditAmount(1000);;	
	    }
	    for(int i=0; i<accounts.length;i++) {
	    	System.out.println(accounts[i]);	
	    }

	}

}
