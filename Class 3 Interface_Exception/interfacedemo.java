package sync3package;

interface IFace1{
	int x=10; //Final or static data
	void printData(); //by default public
}

interface IFace2{
	int x=10;
	void printData();
}

interface IFace3 extends IFace1,IFace2{
	void printData(String data);
}

class A implements IFace3{
	
	A(){
		System.out.println(IFace1.x);
		System.out.println(IFace2.x);
	}

	public void printData() {
		System.out.println("Printed");
	}
	
	public void printData(String data) {
		System.out.println(data);
	}
}


public class interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.printData();
		
		IFace1 iFace1=obj; 
		iFace1.printData();
		
		IFace2 iFace2=obj;
		iFace2.printData();
		
		IFace3 iFace3=obj;
		iFace3.printData();

	}

}
