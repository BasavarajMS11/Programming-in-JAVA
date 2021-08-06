class Share{
	double shareAmt;
	String shareHolderName;
	
	Share(){
		shareAmt=0;
		shareHolderName="";
	}

	Share(double shareAmt,String shareHolderName){
		this.shareAmt=shareAmt;
		this.shareHolderName=shareHolderName;
	}
	
	void printShareDetails(){
		System.out.println("\nShare Details:\n"); 
		System.out.println("Share Amount:"+shareAmt+"\t"+"Share Holder Name:"+shareHolderName);
	}
	
}

class Company{
	String cName;
	String cId;
	//shares Share[];
	
	Company(){
		cName="";
		cId="";	
	}

	Company(String cName,String cId){
		this.cName=cName;
		this.cId=cId;	
	}
	
	void printCompanyDetails(){
		System.out.println("\nCompany Details:\n"); 
		System.out.println("Company Name:"+cName+"\t"+"Company ID:"+cId);
	}
	
}

class Investor{
	String iName;
	String category;
	
	Investor(){
		iName="";
		category="";
	}
	
	Investor(String iName,String category){
		this.iName=iName;
		this.category=category;
	}
	
	void printInvestorDetails() {
		System.out.println("\nInvestor Details:\n"); 
		System.out.println("Investor Name:"+iName+"\t"+"Investor Category:"+category);
	}
	
	void changeCategory(String from,String to) {
		this.category=to;
		System.out.println("Investor Name:"+this.iName+"\t"+"Investor Category Changed To:"+this.category);
	}
	
	
}

class Buyer extends Investor{
	
	Buyer(){
		super();
	}
	
	Buyer(String name,String cat){
		super(name,cat);
	}
	void printInvestorDetails() {
		System.out.println("\nBuyer Details:\n"); 
        super.printInvestorDetails();
	}
	
	void buyStock(){
		
		
	}
	
	
}

class Seller extends Investor{

	Seller(){
		super();
	}
	
	Seller(String name,String cat){
		super(name,cat);
	}
	void printInvestorDetails() {
		System.out.println("\nSeller Details:\n"); 
        super.printInvestorDetails();
	}
	void sellStock() {
		
	}
	
}

class BombayStockExchange{
	String location;
	String stockExcId;
	
	BombayStockExchange(){
		location="";
		stockExcId="";
	}
	BombayStockExchange(String location, String stockExcId){
		this.location=location;
		this.stockExcId=stockExcId;
	}
	
	
	
}
public class BSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n.....Bombay Stock Exchange......\n"); 

	}

}
