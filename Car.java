
public class Car{
	static String name;
	int strSeat;
	String strEngine;
	int strnumberofwheel;
	String strColor;
	int strStearing;
	String strbrand;
	public static void staticdisplay() {
		strSeat=2;
	}
	public Car(int s,String e,int no,String strColor,int strStearing,String brand) {
		this.strSeat=s;
		this.strEngine=e;
		this.strnumberofwheel=no;
		this.strColor=strColor;
		this.strStearing=strStearing;
		this.strbrand=brand;
	}
	
	public void display() {
		System.out.println("Total no of seats is "+this.strSeat);
		
		System.out.println("Engine is "+this.strEngine);
		
		System.out.println("No. of wheel "+this.strnumberofwheel);
		
		System.out.println("Color is "+this.strColor);
		
		System.out.println("Stearing is "+this.strStearing);
		
		System.out.println("Brand is "+this.strbrand);

		System.out.println("\n");
	}

public static void main(String args[]) {
	
	
	Car.staticdisplay();
	System.out.println(Car.name);
	
	Car Car1= new Car(4,"Turbo",4,"Blue",1,"Maruti");
	System.out.println(Car1.name);
	
	Car Car2= new Car(6,"Nitro",4,"Red",1,"Tesla");
	
	Car Car3= new Car(6,"DTSI",4,"YELLOW",1,"Hundai");
	
Car Car4= new Car(4,"Carborater",4,"GREEN",1,"Ford");
	
	Car Car5= new Car(6,"auto",4,"BROWN",1,"Cevrolet");
	
	Car Car6= new Car(6,"manual",4,"Violet",1,"Hunk");
	
	Car Car7= new Car(4,"semimanu",4,"BLACK",1,"AUdi");
	
	Car Car8= new Car(6,"semiauto",4,"WHITE",1,"BMW");
	
	Car Car9= new Car(12,"ASHOK",4,"PURPLE",1,"TRUCK");
	//Car.display();
	
	Car1.display();
	Car2.display();
	Car3.display();
	Car4.display();
	Car5.display();
	Car6.display();
	Car7.display();
	Car8.display();
	Car9.display();
		
}


}
