package CollectionPackage;

import java.util.Collection;
import java.util.*;

class BankAccount{
	int accNo;
	double bal;
	
	public BankAccount() {
		
	}
	
	BankAccount(int accNo, double bal)
	{
		this.accNo=accNo;
		this.bal=bal;
	}
	
	void debitAmt(double amt) {
		bal-=amt;
	}
	
	void creditAmt(double amt) {
		this.bal+=amt;
	}
	
	public String toString() {
		return this.accNo+":"+this.bal;
	}
}

class SavingAccount extends BankAccount{
	public SavingAccount() {
		super();
	}
	SavingAccount(int accNo, double bal) {
		super(accNo,bal);
	}
}
public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BankAccount> accountList=new ArrayList<BankAccount>();
		
		accountList.add(new BankAccount(1001,1000));
		accountList.add(new BankAccount(1002,1000));
		accountList.add(new BankAccount(1003,1000));
		accountList.add(new BankAccount(1004,1000));
		accountList.add(new BankAccount(1005,1000));
		
		Iterator itr=accountList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(BankAccount acc:accountList) {
			acc.creditAmt(500);
			
		}
		for(BankAccount acc:accountList) {
			System.out.println(acc);
			
		}
		
		BankAccount ba1=new BankAccount(1006,5000);
		BankAccount ba2=new BankAccount(1007,5000);
		accountList.add(ba1);
		accountList.add(ba1);
		for(BankAccount acc:accountList) {
			System.out.println(acc);
			
		}
		
		accountList.add(new SavingAccount(1008,1000));
		for(BankAccount acc:accountList) {
			System.out.println(acc);
			
		}

	}

}
