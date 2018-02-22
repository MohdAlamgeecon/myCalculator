package myCalculator;

public class Polymorphism {
	int answer=0;
	String str=null;
	int number,secNumber;
	String operation ;

void getData(int number ,int secNumber,String operation){
		this.number=number;
		this.secNumber=number;
		this.operation=operation;
	
	
	try{
		switch(operation){
		case "+":
			answer=(number+secNumber);
			str="addition is = ";
			getdata(answer, str);
			break;
		case "-":
			
			answer=(number-secNumber);
			str="Substraction is = ";
			getdata(answer, str);
			break;
		case "/":
			
			str="Division is = ";
			answer=(number/secNumber);
			getdata(answer, str);
			break;
		case "*":
			
			answer=(number*secNumber);
			str="Multiplication is =";
			getdata(answer, str);
			
			break;
			default:
			System.out.println("Wrong operation Input");
		}
	}catch(Exception e){
		System.out.println(e);
	}
	
}
void getdata(int answer,String str){
	System.out.println("By Overloading");
	System.out.println(str+answer);
}
}
