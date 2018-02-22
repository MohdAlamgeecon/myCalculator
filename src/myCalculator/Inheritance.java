package myCalculator;


public class Inheritance {
		
		String operation;
		int number,secNumber;
		String str=null;
		protected int answer=0;
		Inheritance(int number,int secNumber,String operation){
		this.number=number;
		this.secNumber=secNumber;
		this.operation=operation;
		
		switch(operation){
		case "+":
			
			str="The Addition is =  ";
			answer=(number+secNumber);
			a.showAdd(answer,str);
			break;
		case "-":
			
			str ="Substraction is = ";
			answer=(number-secNumber);
			a.showSub(answer,str);
			break;
		case "/":
			
			str="Division is = ";
			answer=(number/secNumber);
			a.showDiv(answer,str);
			break;
		case "*":
			str="Multiplication is ";
			answer=(number*secNumber);
			a.showMul(answer,str);
			break;
			default:
				System.out.println("Wrong Input");
		}
	}
		
	
}
class a extends Inheritance{

	a(int number, int secNumber, String operation) {
		super(number, secNumber, operation);
		// TODO Auto-generated constructor stub
	}
	static void showAdd(int answer,String str){
		System.out.println("By Inheritance");
		System.out.println(str+answer);
	}
	static void showSub(int answer,String str){
		System.out.println("By Inheritance");
		System.out.println(str+answer);
	}
	static void showMul(int answer,String str){
		System.out.println("By Inheritance");
		System.out.println(str+answer);
	}
	static void showDiv(int answer,String str){
		System.out.println("By Inheritance");
		System.out.println(str+answer);
	}
}

