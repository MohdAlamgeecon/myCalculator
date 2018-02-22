package myCalculator;

public class JavaobjectClass {
	
	int number,secNumber;
	String operation;
	JavaobjectClass(int number,int secNumber,String operation){
		this.number=number;
		this.secNumber=secNumber;
		this.operation=operation;
		
		switch(operation){
		case "+":
			System.out.println("By Java Object Class");
			System.out.println("The Addition is = "+(number+secNumber));
			break;
		case "-":
			System.out.println("By Java Object Class");
			System.out.println("Substraction is = "+(number-secNumber));
			break;
		case "/":
			System.out.println("By Java Object Class");
			System.out.println("Division is = "+(number/secNumber));
			break;
		case "*":
			System.out.println("By Java Object Class");
			System.out.println("Multiplication is "+(number*secNumber));
			break;
			default:
				System.out.println("Wrong operation Input");
		}
	}
}
