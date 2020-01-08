package sarat;

public class Human {

	// static properties
	//accessmodifier keyword(static/nonstatic) datatype variablename
	public static int hand=2;
	public static int leg=2;
	public static int finger=5;
	public static int ear=2;
	public static int nose=1;
	public static int eyes=2;
	public static String Gender="Empty value";
	
	//non static human properties
	public String color="Green";
	public	String name="";
	public float height=5.5f;
	public int weight=80;
	
	
	
	
	// static methods
	public static void SetGender(){
		Gender= "Female";
	}
	// non static methods
	public void SetName(String strname){
		name = strname;
			
	}
	
	//constructor: function with the same name of class
	public Human(String strname) {
		name = strname;
		
		
	}
	

}
