package unit2;


public class SavingsAccountTester {
	public static void main(String[]args)
	{
		SavingsAccount myAccount = new SavingsAccount(1000,10);
		System.out.println("Initial Balance: 1000");
		System.out.println("Interest: 10");
		System.out.printf("Balance with Interest Added: %.2f", myAccount.addInterest() );
	}
	
	

}
 