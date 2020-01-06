package sarat;

import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=0;i<=1;){
			
			System.out.println("Infinite Input :");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			if(number==-1) {
				break;
			}
		}

	}

}
