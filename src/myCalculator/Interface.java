package myCalculator;
interface Avengers{
	void getData(int number,int secNumber,String operation);
}
public class Interface implements Avengers {

	 int number,secNumber;
	 String operation;
	public void getData(int number,int secNumber,String operation){
		this.number=number;
		this.secNumber=number;
		this.operation=operation;
	
	try{
		switch(operation){
		case "+":
			System.out.println("By Interface");
			System.out.println("The Addition is = "+(number+secNumber));
			break;
		case "-":
			System.out.println("By Interface");
			System.out.println("Substraction is = "+(number-secNumber));
			break;
		case "/":
			System.out.println("By Interface");
			System.out.println("Division is = "+(number/secNumber));
			break;
		case "*":
			System.out.println("By Interface");
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
