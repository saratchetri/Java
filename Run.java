package sarat;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static human properties ");
		System.out.println("The Ears "+Human.ear);
		System.out.println("The Eyes "+Human.eyes);
		System.out.println("The Fingers "+Human.finger);
		System.out.println("The Hand "+Human.hand);
		System.out.println("The Leg "+Human.leg);
		System.out.println("The gender is :"+Human.Gender);
		Human.SetGender();
		System.out.println("The gender after function call is :"+Human.Gender);
		System.out.println("Printing non static properties   .");
		
		
		Human Billa = new Human("Anurag");
		System.out.println("The Color "+Billa.color);
		System.out.println("The Name :"+Billa.name);
		System.out.println("The non static method after call is :"+Billa.name);
		
		System.out.println("The Height :"+Billa.height);
		System.out.println("The Weight:"+Billa.weight);
		
		Human sarat =  new Human("Sarat");
		System.out.println("Printing Sarat object non static properties");
		System.out.println("The Color "+sarat.color);
		System.out.println("The Name :"+sarat.name);
		//sarat.SetName("PP");
		System.out.println("The name after call is :"+sarat.name);
		System.out.println("The Height :"+sarat.height);
		System.out.println("The Weight:"+sarat.weight);
		
		
		
	}

}
