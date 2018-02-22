package myCalculator;

abstract class Marvel{
	abstract void getData(int number,int secNumber,String operation);
}
public class Abstract extends Marvel {

	
	 int number,secNumber;
	 String operation;
	 void getData(int number,int secNumber,String operation){
		this.number=number;
		this.secNumber=number;
		this.operation=operation;
	
	try{
		switch(operation){
		case "+":
			System.out.println("By Abtraction!");
			System.out.println("The Addition is = "+(number+secNumber));
			break;
		case "-":
			System.out.println("By Abtraction!");
			System.out.println("Substraction is = "+(number-secNumber));
			break;
		case "/":
			System.out.println("By Abtraction!");
			System.out.println("Division is = "+(number/secNumber));
			break;
		case "*":
			System.out.println("By Abtraction!");
			System.out.println("Multiplication is "+(number*secNumber));
			break;
			default:
				System.out.println("Wrong operation Input");
		}
	}catch(Exception e){
		System.out.println(e);
	}

}
}
