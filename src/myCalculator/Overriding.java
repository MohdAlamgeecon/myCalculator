package myCalculator;

public class Overriding {

	void getOveriding(){
		System.out.println("This is parent class Implimentation");
	}
}
 class OverridingDemo extends Overriding{
	 int number,secNumber;
	 String operation;
	 void getOveriding(int number,int secNumber,String operation){
		this.number=number;
		this.secNumber=number;
		this.operation=operation;
	
	try{
		switch(operation){
		case "+":
			System.out.println("By Overriding ");
			System.out.println("The Addition is = "+(number+secNumber));
			break;
		case "-":
			System.out.println("By Overriding ");
			System.out.println("Substraction is = "+(number-secNumber));
			break;
		case "/":
			System.out.println("By Overriding ");
			System.out.println("Division is = "+(number/secNumber));
			break;
		case "*":
			System.out.println("By Overriding ");
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
