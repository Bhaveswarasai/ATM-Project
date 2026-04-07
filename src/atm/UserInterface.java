package atm;

import java.util.*;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AtmOperationImpl impl = new AtmOperationImpl();
		boolean b = true;;
		int atmNumber = 123456;
		int atmPin =123;
		System.out.println("WELCOME TO ATM MACHINE");
		System.out.println("ENTER THE ATM NUMBER");
		int atmnum2= sc.nextInt();
		
		System.out.println("ENTER THE ATM PIN");
		int atmPin2 = sc.nextInt();
		
		if(atmNumber == atmnum2 && atmPin == atmPin2) 
		{
			while(b) 
			{
				System.out.println("1.viweAvalible\n 2.withdrawAmount\n 3.DepositeAmount\n 4.viewMiniStatement\n 5.Exit");
				System.out.println("ENTER YOUR CHOICE:");
				int ch = sc.nextInt();
				switch(ch) 
				{
					case 1:
						impl.viewBalance();
						break;
					case 2:
						System.out.println("Enter the amount to withdraw");
						double d = sc.nextDouble();
						impl.withdrawAmount(d);
						break;
					case 3:
						System.out.println("Enter the amount to deposite");
						double d1 =sc.nextDouble();
						impl.depositeAmount(d1);
						break;
					case 4:
						impl.viewMiniStatement();
						break;
					case 5:
						System.out.println("Collect your ATM card\n Thank You ");
						b=false;
						break;
						default :
							System.out.println("Choose correct Option");
				}
			} 
			
		}else {
			System.out.println("INCORRECT ATM NUMBER OR PIN");
		}
		sc.close();
	}

}
