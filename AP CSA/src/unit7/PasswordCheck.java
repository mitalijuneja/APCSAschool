package unit7;

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
		password = "helloworld";
	}

	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
		String user = "";
		do{
			System.out.print("Enter a password: ");
			user = keyboard.nextLine();
			if (!(user.equals(password)))
			{
				System.out.println("INVALID");
			}
		}while (!(user.equals(password)));
		System.out.println("VALID");






	}
}