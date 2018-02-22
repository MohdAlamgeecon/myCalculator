package myCalculator;
import java.io.*;



public class Myclass  {
	
	void getConcept(String conceptVal,int number,int secNumber,String operation){
		switch(conceptVal){
		case "1":
			Inheritance i=new Inheritance(number,secNumber,operation);
			break;
		case "2":
			
			Polymorphism p=new Polymorphism();
			p.getData(number, secNumber, operation);
			
			break;
		case "3":
			Abstract a=new Abstract();
			a.getData(number, secNumber, operation);
			break;
		case "4":
			Encapsulation e=new Encapsulation();
			e.getEncapsul(number, secNumber, operation);
			break;
		case "5":
			JavaobjectClass joc=new JavaobjectClass(number,secNumber,operation);
			
			break;
		case "a":
			OverridingDemo o=new OverridingDemo();
			o.getOveriding(number, secNumber, operation);
			break;
		case "b":
			Polymorphism pn=new Polymorphism();
			pn.getData(number, secNumber, operation);
			break;
		case "c":
			Abstract ab=new Abstract();
			ab.getData(number, secNumber, operation);
			break;
		case "d":
			Interface obj=new Interface();
			obj.getData(number, secNumber, operation);
		
		}
	}
	

	
	public static void main(String[] args)throws Exception  {
		
		try{
			
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Two Numbers");
				int number=Integer.parseInt(br.readLine());	
				int secNumber=Integer.parseInt(br.readLine());
				System.out.println("Enter Your Operation");
				String operation=br.readLine();
				System.out.println("Choose which concept you want to use");
				System.out.println("1.Inheritance\n2.Polymorphism\n a.Method overloading\n b.Method Overriding\n3.Abstraction\n c.Abstract Class\n d.Interface\n4.Encapsulation\n5.Java Object Class");
				String conceptVal=br.readLine();
				Myclass m=new Myclass();
				m.getConcept(conceptVal, number, secNumber, operation);
				}catch(Exception e){
				System.out.println(e);
			}
	}

}
