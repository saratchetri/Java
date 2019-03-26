
public class ifelse {

	// 
	public static void fun1(int para1) {
//		int a
		if((para1==0)||(para1==100))
		{
			if (para1==0) {
			System.out.println("Sunday_a");
			}
			else if(para1==100)
			{
				System.out.println("Sunday_b");
			}
		}
		
		else if(para1==1) {
			System.out.println("Monday");
		}
		else if(para1==2) {
			System.out.println("Tue");
		}
		else if(para1<3)//&&(para1==2)&&(para1==1)&&(para1==0))
		{
			System.out.println("GRT");
		}
		else {
			System.out.println("AOD");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifelse.fun1(100);
	
	}

}
