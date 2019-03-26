
public class switch_class {

	public static void switch1(int a)
	{
		switch(a)
		{
		case 0:
			System.out.println("Sun");
			break;
		case 1:
			System.out.println("Mon");
			break;
		case 3:
			System.out.println("Tue");
			break;
		case 4:
			System.out.println("Wed");
		case 5:
			System.out.println("Thu");
			break;
		case 6:
		case 7:
			System.out.println("Fri");
			break;	
		default:
			System.out.println("INVLid");

		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch_class.switch1(6);
	}

}


